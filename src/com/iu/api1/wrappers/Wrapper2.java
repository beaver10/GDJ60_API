package com.iu.api1.wrappers;

public class Wrapper2 {

	public static void main(String[] args) {
		int num = 10;
		
		//Auto-Boxing
		//Primitive -> Reference 타입으로 바꿔주는
		//Integer num2= new Integer(num); 아래와 같음
		Integer num2= num;
		
		//Auto-UnBoxing
		//Reference -> Primitive 타입으로 바꿔주는
		//num = num2.intValue(); 아래와 같음
		num=num2;
		
		System.out.println(num+2);
		

	}

}
