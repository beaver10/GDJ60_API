package com.iu.api1.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		// StringBuffer는 String이 아님
		StringBuffer sb = new StringBuffer("hello");
		
		sb.append("world");
		
		System.out.println(sb);
		//참조 변수를 출력하면 toString():클래스명@객체주소
		//toString을 오버라이딩 했다...
		
		//변수에는 같은 데이터 타입만 대입 가능
		//String str = sb; 안됨 
		String str = sb.substring(0);
		System.out.println(str);
		
		str = sb.toString();
		System.out.println(str);
		
		sb.reverse();
		System.out.println(sb);
		
		//static이 붙은 애들은 class.vdfds();로 쓴다
		str = String.valueOf(123);
		System.out.println(str);
		
		str=123+"";
		
	}

}
