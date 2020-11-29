package com.org.day2.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(101, "TV", 50000));
		list.add(new Items(100, "Mobile", 25000));
		list.add(new Items(102, "Laptop", 40000));
		
		System.out.println("List Before Sorting");
		for(Items item:list)
		{
			System.out.println(item);
		}
		System.out.println();
		
		System.out.println("List After Sorting by Id");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getId() - i2.getId();
			}
		});
		for(Items item:list)
		{
			System.out.println(item);
		}
		System.out.println();
		
		System.out.println("List After Sorting by Name");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getName().compareTo(i2.getName());
			}
		});
		for(Items item:list)
		{
			System.out.println(item);
		}
		System.out.println();
		
		System.out.println("List After Sorting by Price");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return (int) (i1.getPrice() - i2.getPrice());
			}
		});
		for(Items item:list)
		{
			System.out.println(item);
		}
	}
}
