package com.bridgelabz.oops.stockmgmt;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FileConnection {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}
	Stock st = new Stock();
	File file = new File("C:/Users/Administrator.LAPTOP-BH6CAQ0T/OneDrive/Desktop/Stock.json");
	
	public List<Stock> readFile() throws IOException {
		
		List<Stock> listOfStock =mapper.readValue(file,new TypeReference<List<Stock>>(){});
		return listOfStock;
		
	}
	
	
	public void writeFile(List<Stock> listOfStock) throws IOException {
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(file,listOfStock);
	}

}
