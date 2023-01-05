package com.iu.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "abc @123@gmail.com";
		int idx = email.lastIndexOf("@");
		System.out.println(idx);
		
		
		System.out.println(email.length());//문자열의 길이를 알려줌 .lenght
	
		
		
	
		//한글자씩 꺼내서 출력하는것
			for(int i = 0;i<email.length();i++) {
				System.out.println("Char : "+email.charAt(i));
		}
			
			
			//@를 한꺼번에 _로 바꾸고싶을때
			System.out.println("Before Email : "+email);
			email=email.replace("@", "_"); //직접 replace 되지 않으므로 다시한번 본인에게 대입해야함
			System.out.println("After Email : "+email);
	}

}
