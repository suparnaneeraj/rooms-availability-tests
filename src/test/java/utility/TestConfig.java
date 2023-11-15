package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;


public class TestConfig {
	
	private BufferedReader reader;
	private final String propertyFilePath="configs//configurationFile.properties";
	Properties properties;

	public HashMap<String,String> getPropertiesAsMap()
	{
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			reader= new BufferedReader(new FileReader(propertyFilePath));
			properties=new Properties();
			properties.load(reader);
			reader.close();
			for (Entry<Object,Object> entry : properties.entrySet()){
				map.put((String) entry.getKey(), (String) entry.getValue());
			}
					
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return map;
	}
	

	
}