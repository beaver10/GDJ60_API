package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		// 학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		// 1. 학생정보 초기화
		// 2. 학생정보 전체조회
		// 3. 학생정보 검색조회(이름으로 조회)
		// 4. 학생정보 추가
		// 5. 학생정보 삭제(이름으로 조회)
		// 6. 프로그램 종료
		
		
		new StudentController().start();
		
		
		
//		일반 for문		
//		for(int i = 0; i<ar.size();i++) {
//			System.out.println(ar.get(i).getName());
//		}
	
//		향상된 for문
//		for(StudentDTO studentDTO:ar) {
//			
//		}
//		
//		예시
//		int [] nums = new int [3];
//		for(int n:nums) {
//			
//		} 하지만 인덱스 번호를 못씀 ex. i

	}

}
