package org.desiarialization2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("H:\\Eclipse Workspace\\ApiJson\\src\\test\\resources\\Task2JsonFile.json");
		
		ObjectMapper mapper =new ObjectMapper();
		
		RootDesializationJsonFile2 readValue = mapper.readValue(file, RootDesializationJsonFile2.class);
		
		System.out.println(readValue.getId());
		System.out.println(readValue.getType());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPpu());
		
		Batters batters = readValue.getBatters();
		ArrayList<Batter> batter = batters.getBatter();
		
		for(int i=0;i<batter.size();i++) {
			Batter batter2 = batter.get(i);
			System.out.println(batter2.getId());
			System.out.println(batter2.getType());
			
		}
		
		ArrayList<Topping> topping = readValue.getTopping();
		for (int i = 0; i < topping.size(); i++) {
			Topping topping2 = topping.get(i);
			System.out.println(topping2.getId());
			System.out.println(topping2.getType());
		}
		
		
		

	}

}
