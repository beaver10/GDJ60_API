package com.iu.api2.collections.ex1;

import com.iu.api1.strings.ex3.WeatherController;

public class Ex1Main {

	public static void main(String[] args) {
		
		
		
		
		// 학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		// 1. 학생정보 초기화
		// 2. 학생정보 전체조회
		// 3. 학생정보 검색조회(이름으로 조회)
		// 4. 학생정보 추가
		// 5. 학생정보 삭제(이름으로 조회)
		// 6. 프로그램 종료
		StudentDAO studentDAO = new StudentDAO();
		StudentView studentView = new StudentView();

		System.out.println("Start");
		
	
		new Controller().Start();
		
		
		System.out.println("finish");
		

	}

}
