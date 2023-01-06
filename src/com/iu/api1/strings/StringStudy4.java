package com.iu.api1.strings;

public class StringStudy4 {

	public static void main(String[] args) {
		String str ="StarWars";
		
		String result = str.substring(4); //끝 번호를 입력하지않으면 끝까지 입력
		System.out.println(result);
		
		
		result = str.substring(4, 6); //뒷번호는 미만까지
		System.out.println(result);
		
		
		str = "Test@naver.com";
		//int idx=str.indexOf("@"); //4번째부터 출력됨
		//result = str.substring(idx+1);
		//위의 2줄을 줄인것이 아래 한줄
		result = str.substring(str.indexOf("@")+1);
		
		System.out.println(result);
		
			
		}

	}

