package com.lamda.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionExlamda {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<>();		
		data.add(1);
		data.add(3);
		data.add(2);
		data.add(4);
		data.add(5);
		data.add(6);
		System.out.println("Data Before"+ data);
		//Collections.sort(data);
		//Collections.sort(data,(data1,data2) -> (data1 > data2)? 1 : (data1 < data2)?-1 : 0);
		//Collections.sort(data, (data1,data2) -> {     return data2.compareTo(data1);    });
		//data.sort(Comparator.nullsLast(Integer::compareTo));		
		 System.out.println("Data After"+ data);
		
	}

}
