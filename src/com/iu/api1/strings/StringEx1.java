package com.iu.api1.strings;

public class StringEx1 {

	public static void main(String[] args) {
		
		String phone = "010-1234-5678"; //못찾을때까지 '-'를 찾는다 = -1이 나올때까지
		
		int idx =0;
		boolean check=true;
		while(check) {
			
			idx = phone.indexOf('-', idx);
			if(idx != -1) {
				System.out.println("IDX : "+idx);
				idx++;
			}else {
				check=false;
				break;
			}
			
		}
		
	}

}
