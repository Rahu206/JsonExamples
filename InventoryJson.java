package com.bridgelabz.datamanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryJson {
	
	public static void main(String args[]) {
		
		JSONObject rice = new JSONObject();
		rice.put("name" , "basmati");
		rice.put("weight" , "10kg");
		rice.put("pricePerKg" , "80");
		
		JSONObject pulses = new JSONObject();
		pulses.put("name" ,  "Redlentils");
		pulses.put("weight", "15kg");
		pulses.put("pricePerKg","120");
			
		
		JSONObject wheat = new JSONObject();
		wheat.put("name","Emmer");
		wheat.put("weight", "30kg");
		wheat.put("pricePerKg","34");
		
		JSONArray inventoryArray = new JSONArray();
		inventoryArray.add(rice);
		inventoryArray.add(pulses);
		inventoryArray.add(wheat);
		
		
		try {
			File file = new File("D:\\bridgelabz assignment\\JsonExamples/Inventory.json");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(inventoryArray.toJSONString());
			
			fileWriter.flush();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(inventoryArray);
		
		
	}

}
