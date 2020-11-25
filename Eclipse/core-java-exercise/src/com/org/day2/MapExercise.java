package com.org.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("Student1");
		list1.add("Student2");
		map.put("CS", list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("Student3");
		list2.add("Student4");
		map.put("EC", list2);
		for(Map.Entry<String, List<String>> entry: map.entrySet()) {
			String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println(key + " : " + values);
		}
	}

}
