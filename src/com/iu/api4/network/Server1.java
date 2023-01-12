package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
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

		String msg = "";
		boolean check = true;

		
		try {
			ss= new ServerSocket(8282);
			System.out.println("Client 접속 기다리는 중");
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			while(check) {
				
				is =sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				msg= br.readLine();
				
				if(msg.toUpperCase().equals("Q")){
					System.out.println("채팅 종료");
					check=false;
					break;
					}
				System.out.println("Client : "+ msg);	
				
				//0,1 바꿔주는 애
				os = sc.getOutputStream();
				//char 바꿔주는애
				ow = new OutputStreamWriter(os);
				//stream
				bw = new BufferedWriter(ow);
				
				System.out.println("Client로 보낼 메세지 입력");
				msg = scanner.nextLine();
				
				bw.write(msg+"\r\n");
				bw.flush();
				
				if (msg.toUpperCase().equals("Q")) {
					System.out.println("채팅 종료");
					check=false;
					break;
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
					bw.close();
					ow.close();
					os.close();
					sc.close();
					ss.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			
		}

	}

}
