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
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		//출력
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		//입력
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		String msg = "";
		boolean check = true;
		
		
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("192.168.1.138", 8282); //0~65535
			//어디든 자기 컴 ip : 127.0.0.1
			//내컴 : localhost
			System.out.println("Server 접속 성공");
			
			while(check) {
				//0,1 바꿔주는 애
				os = socket.getOutputStream();
				//char 바꿔주는애
				ow = new OutputStreamWriter(os);
				//stream
				bw = new BufferedWriter(ow);
					
					
					System.out.println("server로 보낼 메세지 입력");
					msg = scanner.nextLine();
					
					bw.write(msg+"\r\n");
					bw.flush();
					
				if (msg.toUpperCase().equals("Q")) {
					System.out.println("채팅 종료");
					check=false;
					break;
				}
					is =socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					
					msg= br.readLine();
					System.out.println("server : "+ msg);
					
				 if (msg.toUpperCase().equals("Q")) {
					System.out.println("채팅 종료");
					check=false;
					break;
				}
			}
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				socket.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
