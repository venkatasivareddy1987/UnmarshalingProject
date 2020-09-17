package com.info.slokam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JsonTest {

	public static void main(String[] args) throws FileNotFoundException, JSONException, IOException {
		
		JsonTest jsonTest = new JsonTest();
  	  
        JSONObject json = XML.toJSONObject(jsonTest.xmlToString()); // converts xml to json
     
        String jsonPrettyPrintString = json.toString(4); // json pretty print
        //System.out.println(jsonPrettyPrintString);
		
		  ObjectMapper om = new ObjectMapper(); //om.readValue("", Root.class);
		  Root readValue = om.readValue(jsonPrettyPrintString, Root.class);
		 

		  
		  System.out.println(readValue.getpOSLog().getTransaction().getRetailTransaction().getLineItem().get(1).getTender().getAuthorization().getReceiptText());
		
	}
	
	public static String xmlToString() throws FileNotFoundException, IOException {
		// our XML file for this example
		File xmlFile = new File("customer.xml");

		// Let's get XML file as String using BufferedReader
		// FileReader uses platform's default character encoding
		// if you need to specify a different encoding, use InputStreamReader
		Reader fileReader = new FileReader(xmlFile);
		BufferedReader bufReader = new BufferedReader(fileReader);

		StringBuilder sb = new StringBuilder();
		String line = bufReader.readLine();
		while (line != null) {
			sb.append(line).append("\n");
			line = bufReader.readLine();
		}
		String xml2String = sb.toString();
		// System.out.println("XML to String using BufferedReader : ");
		// System.out.println(xml2String);

		bufReader.close();
		return xml2String;
	}
}
