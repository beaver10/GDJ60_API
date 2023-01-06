package com.iu.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		
		
		System.out.println("Start");
		
		//WeatherController wc = new WeatherController();
		//wc.start();
		//한번 쓰고 버릴 wc라면... 아래처럼 간편하게! 위랑 아래랑 같음
		new WeatherController().start();
		
		
		
		System.out.println("finish");

	}

}
