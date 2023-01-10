package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다
		//무슨 타입인지 정해져있지 않기 때문!
		//꺽쇠는 Generic : Type의 안전성을 위한것
		//E는 엘리먼트(요소)의 약자 
		//E : 변수명
		//E = Integer
		//int는 안됨 레퍼런스타입만 되기 때문 = 대신 Integer을 넣음
		ArrayList<Integer> ar = new ArrayList<>();
		//ArrayList<String> ar = new ArrayList<>(); //String 타입만 넣을수 있음
		
		//뒷부분 꺽쇠는 생략 가능 (같기 때문)
		ar.add(1);
		
		int num = ar.get(0); //형변환 안해도 Integer로 나옴
		
		
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Seoul");
		ar2.add(weatherDTO);
		weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Jeju");
		ar2.add(weatherDTO);
//		
//		weatherDTO = new WeatherDTO();
//		weatherDTO.setCity("Jeju");
//		
		ar2.remove(weatherDTO);
		
		for(int i = 0; i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());
		}

	}

}
