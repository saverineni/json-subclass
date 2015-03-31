package eu.test.json_subclass;

import java.io.FileInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class App {
	public static void main(String[] args) {
		final String demoFile = "flight.json";
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
				
		try {			
			 ItemResult deserializedFlight = mapper.readValue(new FileInputStream(demoFile), ItemResult.class);    	   			 
    	    String writeValueAsString = mapper.writeValueAsString(deserializedFlight);
			System.out.println(writeValueAsString);			
			ItemResult readValue = mapper.readValue(writeValueAsString, ItemResult.class);
			System.out.println(mapper.writeValueAsString(readValue));
 		
		} catch (JsonGenerationException e) {
			System.out.println("Could not generate JSON: " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Invalid JSON Mapping: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("File I/O error: ");
		}
	}
}
