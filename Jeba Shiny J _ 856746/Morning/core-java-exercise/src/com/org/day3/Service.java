package com.org.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

	List<Employee> list = new ArrayList<Employee>();
	
	public void add(Employee e) {
		list.add(e);
	}
	
	public Employee findById(int id) {
		for(Employee e: list) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	
	public Iterable<Employee> display(){
		return list;
	}
	
	public void sortById() {
		Collections.sort(list, (e1,e2) -> e1.getId() - e2.getId());
	}
	
	public void sortByName() {
		Collections.sort(list, (e1,e2) -> e1.getName().compareTo(e2.getName()));
	}
	
	public void sortByDOB() {
		Collections.sort(list, (e1,e2) -> e1.getDate().compareTo(e2.getDate()));
	}
	
	public void sortBySalary() {
		Collections.sort(list,(e1,e2) -> (int)(e1.getSalary() - e2.getSalary()));
	}
}
