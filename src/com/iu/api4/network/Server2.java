package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		// Client 접속 대기
		// 1번 : 점심 메뉴중 하나를 랜덤하게 골라서 전송
		// 2번 : 저녁 메뉴중 하나를 랜덤하게 골라서 전송
		// 3번 : 종료
		
		ServerSocket ss=null;
		Socket sc = null; 
		//입력
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//출력
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
				
		String[] lunch = {"라면", "햄버거", "피자", "치킨"};
		String[] dinner = {"고기", "김찌", "된찌", "맨밥"};
		
		boolean check = true;
		

		try {
			ss= new ServerSocket(8282);
			System.out.println("Client 접속 기다리는 중");
			sc = ss.accept(); //new를쓰면 안됨 서버 번호를 모르기때문 
			System.out.println("Client와 연결 성공");


			is =sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			//0,1 바꿔주는 애
			os = sc.getOutputStream();
			//char 바꿔주는애
			ow = new OutputStreamWriter(os);
			//stream
			bw = new BufferedWriter(ow);
			
			while(check) {
				
				String data=br.readLine();
				int select = Integer.parseInt(data);
				
				
				Calendar ca = Calendar.getInstance();
				Random random = new Random(ca.getTimeInMillis());
			
				String menu = null;
			
				switch (select) {
					case 1 : 
						System.out.println("1번 선택");
						select = random.nextInt(100)%4;
						menu=lunch[select];
						break;
					case 2 :
						System.out.println("2번 선택");
						select = random.nextInt(100)%4;
						menu=dinner[select];
						break;
					default :
						System.out.println("종료");
						check=false;
			
					}
				
				if(check) {
					bw.write(menu+"\r\n");
					bw.flush();
				}
	
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					br.close();
					ir.close();
					is.close();
					sc.close();
					ss.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}	
		}	
		
}
