package com.iu.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(); 
		//데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k2", "v2Re"); //같은 키에 넣으면 이후 넣은걸로 수정이된다
		
		//데이터 조회
		String v = map.get("k3");
		
		//데이터 수정
		//같은 키에 넣으면 됨 (따로 메서드 없음)
		
		//데이터 삭제
		v = map.remove("k2");
		
		boolean check = map.containsValue("v1");
		System.out.println(check);

		//반복문
		//1. key들의 정보를 알아야함
		//	 key들을 먼저 Set으로 변환
		//	 Set을 Iterator로 변환
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " +key);
			String value = map.get(key);
			System.out.println("value :" + value);
		}
		
		
		//전체 삭제
		map.clear();
		
		System.out.println(map); 
		System.out.println(v);
		
		
		
	}

}
