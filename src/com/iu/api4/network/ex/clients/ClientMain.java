package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		//1. C\\fileTest\\123.txt 초기화
		
		
		
		//1. 전체 학생정보 출력 파싱
		//2. 학생정보 검색 출력
		//3. 학생정보 추가
		//4. 학생정보 삭제
		//5. 종료
		
		
		Socket socket = new Socket("127.0.0.1", 8282);
		
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
		
		//번호:data
		bw.write("1:\r\n");
		bw.flush();
		
		//응답
		String str = br.readLine();
		System.out.println(str);
		
		
		
	}

}
