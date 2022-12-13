# Ocl Constraints

## Required

### 1. Sensor Method retunf properties (easy)

The Methods of a Sensor must return a value, meaning their returnDataType cannot be NULL and it’s hasReturn must be true. 

### 2. Node and Component Status (medium)

The status of a Node can be “GOOD” only if all its Components are also “GOOD”.

### 3. Connection Modules Connections (hard)

**WirelessModules** can only connect to other **wirelessModules** that are within their connection range. This must be true for both connecting modules. The distance between the modules is computed(Euclidian distance) based on their **Location**.

### 4. Subscription/Publish requires connection to MessageBroker (hard)
Nodes can subscribe and publish to a MessageBroker only if they are connected to it over ConnectionModules. And the ConnectionModules  support matching Protocols.
The connections support relaying with one hop, meaning if not directly connected to a MessageBroker, nodes can relay messages over a connected Node. Connections of one hops (one other Nodes in-between) is supported. ??

Need at least one matching topic.


###


## Further Possible Constrains