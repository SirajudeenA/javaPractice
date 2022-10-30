package com.practice.full;

import java.util.TreeMap;

public class Task_Map {

	public static void main(String[] args) {

		TreeMap<Integer,Integer> map;
		map= new TreeMap<Integer,Integer>();
		Integer[] list ={9,2,3,4,5,6,7,10,3,4,2,3,4,2,3};
		
		for (Integer num :list)
			if(map.get(num)==null)
				map.put(num, 1);

			else
				map.put(num,map.get(num)+1);
		
		System.out.println(map.values());
		
		
	}
}
