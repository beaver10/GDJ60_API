package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명을 입력");
		String fileName=sc.next(); //sdsad.gif
		//이미지 파일만 허용 가능하게
		
		//확장자 분리작업
		int idx = fileName.indexOf(".");
		String result = fileName.substring(idx+1);
		System.out.println(idx);
		System.out.println(result);
		
		//이미지인지 확인
		boolean flag = true;
		for(int i = 0; i<names.length;i++) {
			if(result.equals(names[i])) {
				System.out.println("정상적인 파일");
				flag=!flag;
				break;
			}
		}//for문 끝
		if(flag) {
				System.out.println("비정상적인 파일");
		}
		
	}

}
