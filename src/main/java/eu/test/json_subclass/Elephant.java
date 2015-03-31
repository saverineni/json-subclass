package eu.test.json_subclass;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Elephant implements ItemResult {
	private List<Double> table;
	@JsonProperty("cardId")
	String name;
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	// Empty constructor needed for deserialization
	public Elephant() {
	}
	
	boolean endangered;
	


	public Elephant(String name) {
		this.name = name;
		this.endangered = false;
		Double[] array = { 1.0, 2.0, 3.0 };
		this.table = Arrays.asList(array);
	}

	public List<Double> getTable() {
		return table;
	}

	public void setTable(List<Double> table) {
		this.table = table;
	}
	
	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}



	public boolean isEndangered() {
		return endangered;
	}

	
	@Override
	public String toString() {
	return "name : " + this.name +" endangered :" + this.endangered + " table : " + this.table.toString() ;
	}

}