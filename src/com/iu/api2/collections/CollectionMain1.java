package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		//어레이 리스트를 모아둔 어레이리스트
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		ars.add(ar1);
		ars.add(ar2);
		
		ars.get(0).get(0);
		
		//이론상은 된다.. 머리아픈..
		ArrayList<ArrayList<ArrayList<Integer>>> arrs = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("ar1", ar1);
		map.put("ar2", ar2);
		
		
		

	}

}
