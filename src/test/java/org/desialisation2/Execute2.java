package org.desialisation2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Execute2 {

	public static void main(String[] args) throws IOException {
		
		FileReader file =new FileReader("H:\\Eclipse Workspace\\ApiJson\\src\\test\\resources\\Deseialization2.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Root2 readValue = mapper.readValue(file, Root2.class);
		
		System.out.println(readValue.getId());
		
		Category category =new Category();
		System.out.println(category.getId());
		System.out.println(category.getName());
		
		System.out.println(readValue.getName());
		
		ArrayList<String> photoUrls=readValue.getPhotourls();
		for(int i=0;i<photoUrls.size();i++) {
			System.out.println(photoUrls.get(i));
		}
		
		Tags tags =new Tags();
		System.out.println(tags.getId());
		System.out.println(tags.getName());
		
		System.out.println(readValue.getStatus());
		
		System.out.println("Welcome");
	}

}
