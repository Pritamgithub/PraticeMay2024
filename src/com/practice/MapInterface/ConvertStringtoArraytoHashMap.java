package com.practice.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class ConvertStringtoArraytoHashMap {

	public static void main(String[] args) {
		
		//given a String 
		// Convert String Array to Hashmap
		// How do we do that
		String givenString= "Peter:Parker, Tom:Cruise, Bradley:Cooper";
	
		String actorname[]= givenString.split(",");
		Map<String, String> map= new HashMap<String, String>();
        for(String actors :actorname) {
        	
        	String actorData[]=actors.split(":");
        	String actorFirstName= actorData[0].trim();
        	String actorLastName= actorname[2].trim();
        	
        	map.put(actorLastName, actorFirstName);
        }
        System.out.println(map);
        
        
	}
	
	
}
