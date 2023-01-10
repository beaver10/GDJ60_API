package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.api1.strings.ex3.WeatherDTO;

public class StudentView {
	
	public void view(StudentDAO [] datas){
		ArrayList<StudentDAO> ar = new ArrayList<>();
//		StudentDAO studentDAO = new StudentDAO();
	
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i).init());
		}
		
	}
	
	public void search(StudentDAO[] studentDAOs) {
		System.out.println("검색할 학생명 입력");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		StudentDAO studentDAO = null;
		for(int i = 0; i<studentDAOs[i].init()) {
			
		}
	}
}
		
		
	