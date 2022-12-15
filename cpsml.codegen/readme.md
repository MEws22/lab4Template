# Codegen Notes
The following notes aim to ease the understanding of simulation in lab4 and how it's individual components interact. The most critical components and their critical functions are documented.

## Simulation Utilities
The simulation utilities are used to simulate the execution of the CPS, which shows the interaction of different components i.e., controllers, nodes, node components and message brokers with each other. The simulation shows the interaction as described by the [Runner](### Runner). The message loading from the file is handled by [DataSource](###DataSource) and each message follows a specific format in order to reach a specific nodes and controller and execute a specific function as described in [messages](### Messages in dataSources). 


### DataSource
A DataSource is needed for all Controller objects. It is basically a queue and the Controller reads the next message out of it. Each step a new message is read from each datasource of each controller. This continues as long as there are messages in the dataloader i.e., dataloader with maximum messages. Messages with no content can be understood as empty messages/no message for that step.


### Messages in dataSources
Messages from the dataSources are function calls defined as a concatenated string containing the topic, the receiving node, the component, the function name and possible function parameters in the following format:
``Topic-NodeName-ComponentName.FunctionName(ParameterValue1, ParameterValue2, ...)``
e.g.: ``temp-threedPrinter-heatedPrintBed.setTemperature(110)``

## Generated Code

### Runner
For each CyberPhysicalSystem is simulated by a runner. A Runner sets up the Environment, Controller, MessageBroker and Node objects. It further creates DataSources using the [messages JSON file](https://github.com/MEws22/lab4Template/blob/master/cpsml.codegen/scenarios/productionCPSScenario.json). Once all objects are created it links Controllers and Nodes with the respective MessageBrokers by creating MessagingLinks. This Simulation does not entail the connection over ConnectionModules for the sake of simplification.

The runner is also the only interface for the Simulation. For this each Runner implements a ``step`` method, which further invokes the steps from its containing objects.
A step invokation follows the following execution flow:
Runner ``step`` -> invoke the following ``steps`` -
1.  Controller ``step`` -> look if new Messages are provided in dataSource
2.  Node ``step`` -> Query MessageBroker for Messages -> invoke matching component functions -> invoke Sensor ``step``(2.1) -> send successes or possible return values as Messages back to MessageBroker
	2.1 Sensor ``step`` -> depending on its frequency invoke its function
3.  MessageBroker ``step`` -> output topic queue sizes -> clear topic queues

### Environment
An Environment has a name and implements the function ``toString`` which returns its name.

### MessagingBroker
A MessagingBroker implements the interface _Linkable_ . On instantiation a MessageBroker also instantiates a messageQueue as a List of Strings for each of its topics. A MessageBroker implements the functions ``toString``, ``getTopics``, ``queueMessage`` and ``retrieveMessages``.
*   The function ``queueMessage`` adds a String Message to its respective topic queue.
*   The function ``retrieveMessages`` returns all messages of the specified topic and the specified recipient. Messages without recipient are sent to all the recipients.

### Controller
A controller implements the interface _MessagingElement_ . It contains the methods ``addPublication`` , ``addSubscription`` ,``generateMessages``, ``sendAllMessages``, ``sendMessage``,  ``queryMessages``.
As class attributes a controller has a name, topics, a dataSource and Maps of publicationLinks and subscriptionLinks which resemble the MessagingLinks by mapping the topics to the linked MessagingBroker.

*   The ``addPublication`` function adds a new publication MessagingLink to the Controller publicationLinks.
*   The ``addSubscription`` function adds a new subscription MessagingLink to the Controller subscriptionLinks.
*   The ``generateMessages`` generates the a new message by reading it from the controllers dataSource.
*   The ``sendAllMessages`` iterates over the controllers messageGeneratorCache and ``sendMessage`` with the topic matching _Linkables_ .
*   The ``sendMessage`` passes the message to the defined _Linkable_ to be added to its queue.
*   The ``queryMessage`` retrieves this controller concerning messages from its linked MessaginBrokers.

In one ``step`` the method to read the next value from its DataSource is invoked. If the read value contains a message then it is sent to its linked MessageBroker over Messaging links based on the topic of the message. 

### Node
A node implements the interface MessagingElement. As class attributes it has a name, Maps of publicationLinks and subscriptionLinks which resemble the MessagingLinks by mapping the topics to the linked MessagingBroker. Each node has a name, a caching links for incoming and outgoing messages. On instantiation it creates its components. It contains the methods ``addMessageToOutgoingCache`` , ``addPublication`` , ``addSubscription`` ,``generateMessages``, ``sendAllMessages``, ``sendMessage``,  ``queryMessages``.
*   The ``addMessageToOutgoingCache`` function adds a new message to the nodes msgOutCache in defined string concatenation format.
*   The ``addPublication`` function adds a new publication MessagingLink to the Nodes publicationLinks.
*   The ``addSubscription`` function adds a new subscription MessagingLink to the Nodes subscriptionLinks.
*   The ``sendAllMessages`` iterates over the Nodes msgOutCache and ``sendMessage`` with the topic matching _Linkables_ .
*   The ``sendMessage`` passes the message to the defined _Linkable_ to be added to its queue.
*   The ``queryMessage`` retrieves this nodes concerning messages from its linked MessaginBrokers.

### Component
Components are instantiated during the instantiation of their parent nodes. Components have a name and topic. For each function of a component in the CPS model, a function is created with matching name, returnType and parameters.
The functions when invoked output a log message and, if defined, return an appropriately generated return value (either random or dummy data).

#### Actuator
Actuators additionally have attributes runs and ratedRuns.
The functions of actuators only run when invoked, meaning a matching message reached its parent node.

#### Sensor
Sensors additionally have an attribute frequency and internalStepCount. The internalStepCount is zero when a Sensor is instantiated and is increased on every ``step`` invocation.
Depending on the InternalSteCount and the sensors frequency, its functions can be automatically be invoked. If a function is invoked automatically, its return value is added as a message to the nodes msgOutCache.
In addition sensors functions can be invoked as functions of actuators.
