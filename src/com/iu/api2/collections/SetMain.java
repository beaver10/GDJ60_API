package com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		hs.remove(1); //순서가 없기때문에 인덱스 번호가 없음 -> 1을 지우면 1이라는 데이터가 삭제됨
		
		System.out.println(hs);
		//.toString 오버라이딩 됨
		System.out.println(hs.size());
		//중복은 허용하지 않음
		
		//Set의 Data들을 Iterator 형식으로 변경 
		//List나 Set처럼 컬렉션, 열거형)
		//변수 선언
		Iterator<Integer> is = hs.iterator(); //다형성 개념
		
		while(is.hasNext()) {
			Integer num = is.next();
			System.out.println(num);
		}
	}

}
