package jsonproject.jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\employee.json");

		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		String fname = (String) empjsonobj.get("firstName");
		String lname  = (String) empjsonobj.get("lastName");
		
		System.out.println(fname + " " + lname);
		
		JSONArray array = (JSONArray)empjsonobj.get("address");
		
		for(int i = 0; i < array.size(); i++)
		{
			JSONObject address = (JSONObject)array.get(i);
			System.out.println(address.get("street"));
		}
		
	}

}
