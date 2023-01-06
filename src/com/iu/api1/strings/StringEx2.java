package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명을 입력");
		String fileName=sc.next(); //sdsad.gif
		//이미지 파일만 허용 가능하게
		
		int idx = fileName.indexOf(".");
		String result = fileName.substring(idx);
		System.out.println(idx);
		System.out.println(result);
		
		boolean check = false;
			if(result.equals(result)) {
				System.out.println("정상적인 파일");
				
			}System.out.println("비정상적인 파일");
			
		
		
		
		
		
		

	}

}
