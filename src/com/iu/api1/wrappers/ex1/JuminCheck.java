package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class JuminCheck{
	Scanner sc = new Scanner(System.in);
	
	//check1 메서드
	//주민등록번호를 받아서 
	//남성인지 여성인지 출력
	
	public void check1(String jumin) {
		//jumin.charAt(7);
		String check =jumin.substring(7,8);
		int c = Integer.parseInt(check);
		
		if(c%2==1) {
			System.out.println("남성입니다");
		}else {
			System.out.println("여성입니다");
		}
		
		
//		if(c==1||c==3) {
//			System.out.println("남성입니다");
//		}else {
//			System.out.println("여성입니다");
//		}
//		
		
//		if(check.equals("1")||check.equals("3")) {
//			System.out.println("남성입니다");
//			
//		}else{
//			System.out.println("여성입니다");
//		}
	}
	
	//check2 메서드
	//주민등록번호를 받아서
	//나이를 계산해서 출력
	//3-5월 : 봄
	//6-8월 : 여름
	//9-11월 : 가을
	//12-2월 : 겨울 출력
	
	public void check2(String jumin) {
		String y = jumin.substring(0,2);
		String check = jumin.substring(7,8);
		int year = 1900;
		//String year ="19"
		if(check.equals("3")||check.equals("4")) {
			year=2000;
			//year="20"
		}
		
		year = year+Integer.parseInt(y);
		int age = 2023-year;
		System.out.println("age : "+age);
		
		//계절출력
		String m = jumin.substring(2,4);
		int month = Integer.parseInt(m);
		if(month>=3&&month<=5) {
			System.out.println("봄");
		}else if(month>=6&&month<=8) {
			System.out.println("여름");
		}else if(month>=9&&month<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		
		
		
	}
	

}
