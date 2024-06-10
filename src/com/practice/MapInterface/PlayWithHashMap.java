package com.practice.MapInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class PlayWithHashMap {

	public static void main(String[] args) {

		Map m = new HashMap();
		m.put(1, "Peter");
		m.put(2, 2);
		m.put(1, 5);
		System.out.println(m);
		
		Map<String, Set<String>> m1= new HashMap<String, Set<String>>();
		Hashtable<Integer, String> htable= new Hashtable();
		htable.put(100, "Ashwini");
		htable.put(200, "Ashwini1");
		htable.put(400, "Ashwini2");
		
		htable.put(300, "Ashwin3");
		htable.put(500, "Ashwini5");
		htable.put(600, "Ashwini6");
		
		
		System.out.println("This is the hashtable "+ htable);
		
		Set<String> setlist1= new HashSet<String>();
		setlist1.add("Mumbai");
		
		
		m1.put("Start", setlist1);
		System.out.println(m1);
		setlist1.add("Delhi");
		setlist1.add("Delhi");
		setlist1.add("Delhi1");
		setlist1.add("Delhi1");
		
		System.out.println(m1);
		
		
		
		
		

	}
}
