package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("Strat");
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명을 입력");
		String fileName=sc.next(); //sdsad.gif
		//이미지 파일만 허용 가능하게
		
		//확장자 분리 작업
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);
		System.out.println(result);
		
		boolean flag = true;
		
		//확장자가 이미지인지 검증
	
		for(int i =0; i<names.length ;i++) {
			if(result.equals(names[i])) {
				System.out.println("정상적인 파일");
				i=names.length; //종료문
				flag =!flag;
				break;
			}
		}//for문 끝
		
		if(flag) {
			System.out.println("비정상 파일");
		}
		
		
		System.out.println("Finish");
		

	}

}
