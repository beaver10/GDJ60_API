package com.iu.api4.network.ex.servers;
		


public class ServerMain {

	public static void main(String[] args) {
		
		//1. C\\fileTest\\123.txt 초기화
		
		
		//1. 전체 학생정보 출력 파싱
		//2. 학생정보 검색 출력
		//3. 학생정보 추가
		//4. 학생정보 삭제
		//5. 종료

		
		try {
			new StudentController().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}