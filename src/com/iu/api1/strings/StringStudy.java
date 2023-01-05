package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abcdefg");
		//위와 아래는 같음
		String str2 = "abcdefg";
		
		
		System.out.println(str==str2); // 이건 틀림
		boolean check = str.equals(str2); // 이건 같음
		System.out.println(check);
		//앞으로 비교할때 이퀄스 씁시다(문자열도 됨)

		
		
		int num = str2.indexOf('d',2);
		System.out.println(num);
		
		System.out.println(str2.indexOf('b'));
		
		

		//멤버 메서드 생성 방식
		char ch = str2.charAt(1);
		System.out.println("Char : "+ch);
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0); //한글자만 스캐너로 받고싶다
		System.out.println("Char : "+ch);
		
		

	}

}
