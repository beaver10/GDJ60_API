package com.iu.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {
		String str = "apple# Apple, aPPle# appLe, 1. 2# 3.4, 5.2# 60";
		
		str =str.replace(",", "#"); //쉼표를 #으로 파싱
		//str =str.replace(" ", ""); // 공백(띄어쓰기)을 없애는걸로 파싱
		//str = str.trim();
		String [] result = str.split("#"); //파싱(parsing)
		
		
		
		
		for(int i = 0; i<result.length;i++)
			System.out.println(result[i].trim().toUpperCase());
		//.trim() = 공백 제거 하지만 중간에 있는 공백은 제거가 안됨
		//.toUpperCase() = 전체 대문자로 변환
		//.toLowerCase() = 전체 소문자로 변환
		
		
		

	}

}
