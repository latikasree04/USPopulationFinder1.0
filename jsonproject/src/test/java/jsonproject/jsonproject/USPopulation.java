package jsonproject.jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class USPopulation {

	public static void main(String[] args) throws IOException, ParseException {

		//NumberFormat myFormat = NumberFormat.getInstance();
	    //myFormat.setGroupingUsed(true);
		Scanner n = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();     
	    FileReader reader = new FileReader(".\\jsonfiles\\USPopulation.json");

		Object obj = jsonparser.parse(reader);

		JSONObject emp = (JSONObject)obj;
	    
	    JSONArray array = (JSONArray)emp.get("data");
	    
	    System.out.println("Enter a year between 2013 and 2019: ");
	    int year = n.nextInt();
	    
	    for(int i = 0; i < array.size(); i++)
			{
				
	    		JSONObject data = (JSONObject)array.get(i);
				//System.out.println(data.get("Population"));
				
	    		String datayear = (String)data.get("Year");
	    		//System.out.println(datayear);
	    		
				if(year == Integer.parseInt(datayear))
				{
					//String pop = ()data.get("Population");
					System.out.println("The population in " + year + " was " + data.get("Population") + ".");
				}
			}
			
			
	  }

}
