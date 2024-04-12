package com.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestingClass {



    

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();

	     List<Integer> list=new ArrayList<Integer>();
	     int c=1;
	     for(int i=0;i<n;i++){
	         
	         if(list.contains(sc.nextInt())) {
	        	 c=c+1;
	         }else {
	        	 list.add(sc.nextInt());
	         }
	     }
	     System.out.println(c);
	  //   List<Integer> list=Arrays.asList(1,2,1,3,4,3);

	     findDumplicateElementsCount(list);

	}

	private static void findDumplicateElementsCount(List<Integer> list) {

		Map<Integer , Integer> map=new HashMap<>();
		Integer count=0;
		for(Integer l:list) {
			
			if(map.containsKey(l)) {
				count=count+1;
			}else {
				map.put(l, count);
			}
		}
		System.out.println(count);
	}

}
