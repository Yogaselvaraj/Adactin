package org.desialisation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execute {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		FileReader file =new FileReader("H:\\Eclipse Workspace\\ApiJson\\src\\test\\resources\\regressGet.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Root readValue = mapper.readValue(file, Root.class);
		
		System.out.println(readValue.getPage());
		System.out.println(readValue.getPer_page());
		System.out.println(readValue.getTotal());
		System.out.println(readValue.getTotal_pages());
		
		Support support=readValue.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());
		
		ArrayList<Data> data=readValue.getData();
		for(int i=0;i<data.size();i++) {
			Data data2 = data.get(i);
			System.out.println(data2.getId());
			System.out.println(data2.getFirst_name());
			System.out.println(data2.getLast_name());
			System.out.println(data2.getEmail());
			System.out.println(data2.getAvatar());
			System.out.println();
		}
		

	}

}
