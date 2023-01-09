package com.iu.api1.wrappers;

public class Wrapper1 {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(Byte.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		String n1 = "12";
		Integer int1 = new Integer(n1); //가로선이 있는 이유는 왠만해서 쓰지말라! 
		System.out.println(int1*3);
		
		
		//Integer.parse는 문자열을 숫자로 바꿀때 사용
		int num1=Integer.parseInt(n1);
		System.out.println(num1*2);
		
		n1 = "15.234";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1*3.2);
		

	}

}
