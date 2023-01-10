package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private Scanner sc;
	
	private StudentDAO studentDAO; //의존성
	private StudentView studentView; //의존성
	private ArrayList<StudentDTO> ar; //의존성

	public StudentController(){
		sc = new Scanner(System.in);
		studentDAO = new StudentDAO(); //주입 
		studentView = new StudentView(); //주입 
		// 의존성 주입(DI)
		
	}
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생정보 초기화");
		System.out.println("2. 학생정보 전체조회");
		System.out.println("3. 학생정보 검색조회");
		System.out.println("4. 학생정보 추가");
		System.out.println("5. 학생정보 삭제");
		System.out.println("6. 프로그램 종료");
		int select = sc.nextInt();
		
		switch(select) {
		case 1 :
			ar = studentDAO.init();
			break;
		case 2 :
			studentView.view(ar);
			break;
		case 3 : 
			StudentDTO studentDTO =studentDAO.findByName(ar);
			if(studentDTO != null) {
				studentView.view(studentDTO);
			}else {
				studentView.view("찾는 학생이 없음");
			}
			break;
		case 4 : 
			studentDAO.addStudent(ar);
			break;
		case 5 :
			select =studentDAO.removeStudent(ar);
			if(select==1) {
				studentView.view("삭제 성공");
			}else {
				studentView.view("삭제 실패");
			}
			break;
		default :
			check=false;
			break;
		}
		}
		
	}

}
