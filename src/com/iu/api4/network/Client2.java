package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		// 1. 서버 접속 시도
		// 2. 1.점심, 2.저녁, 3.종료
		// 3. 사용자가 1 2 3 고르기
		//1번 : 서버에서 점심 메뉴중 하나 보내줌, 출력
		//2번 : 서버에서 저녁 메뉴중 하나 보내줌, 출력
		//3번 : 종료

		Scanner scanner = new Scanner(System.in);
		
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		int num;
		boolean check = true;
		String menu;
		
		
			//객체 생성시 서버 접속 시도
			try {
				socket = new Socket("192.168.1.138", 8282);
				System.out.println("Server 접속 성공");

				is =socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				//0,1 바꿔주는 애
				os = socket.getOutputStream();
				//char 바꿔주는애
				ow = new OutputStreamWriter(os);
				//stream
				bw = new BufferedWriter(ow);
				
				while(check) {
				
					System.out.println(" 1.점심    2.저녁    3.종료");
					int select = scanner.nextInt();
					
					
					bw.write(select+"\r\n");
					bw.flush();
					
					if(select == 3) {
						System.out.println("종료");
						break;
					}
				
					menu = br.readLine();
					System.out.println("오늘 메뉴는 : "+ menu);

					}
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0~65535
			//어디든 자기 컴 ip : 127.0.0.1
			//내컴 : localhost
			
		
		
		
		
		
	}
	
}


