package com.iu.api1.strings.ex3;

public class WeatherView {
	//2개의 메서드 생성
	//1. 모든 날씨 정보를 출력
	public void view(WeatherDTO [] datas) {
		for(int i=0; i<datas.length;i++) {
			this.view(datas[i]);
		}
	}
	
	//2.DTO 하나의 정보를 출력
	public void view(WeatherDTO weatherDTO) {
		System.out.println("---------------");
		System.out.println("city : "+weatherDTO.getCity());
		System.out.println("Gion : "+weatherDTO.getGion());
		System.out.println("Status : "+weatherDTO.getStatus());
		System.out.println("MISE : "+weatherDTO.getMise());
		
	}
	
	

}
