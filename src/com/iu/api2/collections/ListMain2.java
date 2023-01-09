package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		
		
		//어레이 리스트에는 모든 타입을 다 담을수 있다!
		ArrayList ar = new ArrayList();
		//모든타입이 object(부모) 타입 -> 다형성
		//다형성은 상속관계에서만 가능
		//레퍼런스 타입만 다형성
		//int는 안됨..!
		//레퍼런스 타입만 들어감..! 프리미티브는 안들어감
		ar.add(1); 		//Auto-Boxing으로 가능
		ar.add(1.2);	
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		//UnBoxing 레퍼런스 타입을 프리미티브 타입으로 변환
		int n1= (Integer)ar.get(0);
		double n3=(Double)ar.get(2);
		
		//기본은 오브젝트 타입임
		Object n2= ar.get(1);
		
		
		for(int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		

	}

}
