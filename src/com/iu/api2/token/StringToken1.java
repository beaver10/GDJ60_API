package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";
		
		//이렇게 스플릿으로 힘들게 말고
		//하나하나가 독립적인 데이터는 스플릿이 편함
		String [] n =nations.split(",");
		for(int i = 0; i<n.length;i++) {
			NationDTO nationDTO = new NationDTO();
			nationDTO.setName(n[i]);
			nationDTO.setCity(n[++i]);
		}
		
		
		
		//이렇게 토커나이저로 쉽게
		//2개 이상인 데이터는 토커나이저가 편함
		StringTokenizer st = new StringTokenizer(nations,",");
		while(st.hasMoreTokens()) {
			NationDTO nationDTO = new NationDTO();
			
			String t1 = st.nextToken();
			nationDTO.setName(t1);
			
			String t2 =st.nextToken();
			nationDTO.setCity(t2);
			
		}
		

	}

}
