package com.iu.api4.network.ex.servers;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentController {
	private Scanner sc;

	private ServerSocket ss;
	private Socket socket;
	
	//의존성
	private StudentDAO studentDAO;
	
	
	public void start() throws Exception {
		
		ss= new ServerSocket(8282);
		System.out.println("Client 접속 기다리는 중");
		socket = ss.accept();
		System.out.println("Client와 연결 성공");
		
		//입력
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//출력
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		is =socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);

		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		studentDAO=new StudentDAO(); 
		
		ArrayList<StudentDTO>ar = studentDAO.init();
		studentDAO.studentBackUp(ar);	
		System.out.println("초기화 완료");

		boolean check=true;
		while(check) {
			//선택번호:Data 보내는 약속
			//1. 전체 학생정보 출력 파싱
			//2. 학생정보 검색 출력
			//3. 학생정보 추가
			//4. 학생정보 삭제
			//5. 종료
			
			String select =br.readLine(); //선택번호:Data
			String [] s = select.split(":");
			
			switch(s[0]) {
			case "1":
				//1:
				select=studentDAO.makeList(ar);
				break;
			case "2":
				//2:iu
				select = studentDAO.findByName(ar, s[1]);
				
				break;
			case "3":
				//3:iu-4-50-75-81
				//s[1]
	//			select = studentDAO.addStudent(ar, s[1]);
				
				break;
			case "4":
		//		select = studentDAO.removeStudent(ar, s[1]);
				
				break;
			default:
				bw.write("종료"+"\r\n");
				bw.flush();
				check=false;
			}
			if(check) {
				bw.write(select+"\r\n");
				bw.flush();
				
			}
				
			}
		
		
		
	}

}