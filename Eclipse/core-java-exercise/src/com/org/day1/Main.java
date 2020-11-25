package com.org.day1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list.add(new User(100, "Shiny", "shiny123"));
		list.add(new User(102, "Jasmine", "jasmine1234"));
		list.add(new User(103, "Jasper", "jasper987"));
		list.add(new User(104, "Amy", "amy456"));
		list.add(new User(105, "Jerrina", "jerrina123"));
		
		for(User user : list) {
			if(user.getName().length() > 5) {
				System.out.println("Id = "+user.getId()+", Name = "+user.getName());
			}
		}
	}

}
