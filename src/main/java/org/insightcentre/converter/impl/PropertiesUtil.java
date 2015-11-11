package org.insightcentre.converter.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.google.gson.stream.JsonWriter;

public class PropertiesUtil {



	public String getPropertyValue(String fileName, String propertyName) throws IOException{
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream(fileName);
			prop.load(input);
			String result = prop.getProperty(propertyName);
			return result;
		} finally{
			if(input!=null){
				try {
					input.close();
				} catch (IOException e) {
					throw new RuntimeException("ERROR! ",e);
				}
			}
		}
		
	}
	

}
