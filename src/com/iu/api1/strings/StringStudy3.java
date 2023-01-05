package com.iu.api1.strings;

public class StringStudy3 {

	public static void main(String[] args) {
		//String은 불변
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		
		//1,2번은 주소가 같고 3,4번은 주소가 다르다
		//문자열은 비교할떄 디폴트를 쓰자..!
		
		
		str1=str1+"world"+str2;

	}

}
