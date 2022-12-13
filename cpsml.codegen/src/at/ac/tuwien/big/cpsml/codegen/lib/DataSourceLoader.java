package at.ac.tuwien.big.cpsml.codegen.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class DataSourceLoader {

	/**
	 * Creates a Map of DataSource Objects for the simulation of a SmartGrid. 
	 * The data values are read from a JSON file.
	 * 
	 * @param filePath path to the json file containing the sensor values
	 * @return Map<"NodeName", Map<"Node_parameter", DataSource>>
	 * @throws IOException if the file could not be read
	 */
	public Map<String, DataSource<?>> loadDataSource(String filePath) throws IOException {
		
		String jsonStr = new String(Files.readAllBytes(Paths.get(filePath)));
						
		
		Map<String, DataSource<?>> dataSources = new HashMap<>();
		
		Gson gson = new Gson();
		JsonElement elem = gson.fromJson(jsonStr, JsonElement.class);
		JsonArray controllers = elem.getAsJsonObject().get("controllers").getAsJsonArray();
		for (JsonElement controller : controllers) {
			String name = controller.getAsJsonObject().get("name").getAsString();
			JsonArray messages = controller.getAsJsonObject().get("messages").getAsJsonArray();
			
			DataSource<String> dataSource = new DataSource<String>();
			messages.forEach(entry -> dataSource.fill(entry.getAsString()));
			
			dataSources.put(name, dataSource);
		}
		
		return dataSources;
	}
}
