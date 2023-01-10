package com.iu.api2.collections.ex1;

import java.util.Scanner;

public class Controller {
	
	private Scanner sc = new Scanner(System.in);
	private StudentDAO studentDAO;
	private StudentView studentView;
	private StudentDAO[] studentDAOs;

	
	
	

	public Controller() {
		this.sc=new Scanner(System.in);
	}
	
	public void Start() {
		boolean check = true;
		// 학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
				// 1. 학생정보 초기화
				// 2. 학생정보 전체조회
				// 3. 학생정보 검색조회(이름으로 조회)
				// 4. 학생정보 추가
				// 5. 학생정보 삭제(이름으로 조회)
				// 6. 프로그램 종료


		while(check) {
			System.out.println("1. 학생정보 초기화");
			System.out.println("2. 학생정보 전체조회");
			System.out.println("3. 학생정보 검색조회");
			System.out.println("4. 학생정보 추가");
			System.out.println("5. 학생정보 삭제");
			System.out.println("6. 종료");
			int select = sc.nextInt();
			
			
			switch (select) {
			case 1 : studentDAO.init();
			break;
			case 2 : studentView.view(studentDAOs);
			break;
			}
			
		
	
	

		}
	}
}