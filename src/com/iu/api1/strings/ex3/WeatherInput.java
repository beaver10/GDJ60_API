package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	
	private Scanner sc;
	
	public WeatherInput() {
		this.sc =new Scanner(System.in);
	}
	//https://github.com/Daeki/GDJ60_API/blob/StringEx3/src/com/iu/api1/strings/ex3/WeatherInput.java
	
	//3번 지역 날씨 검색
	//search라는 메서드
	//배열을 받고, 키보드로부터 검색할 도시명을 입력받음
	//도시명(대소문자 무관)
	//찾은 DTO를 리턴, 없으면 null; 
	
	public WeatherDTO [] seach(WeatherDTO[] weatherDTOs) {
		System.out.println("검색할 도시명 입력");
		String name=sc.next().toUpperCase();
		WeatherDTO weatherDTO=null;
		for(int i=0;i<weatherDTOs.length;i++) {
			if(name.equals(weatherDTOs[i].getCity().toUpperCase())){
				weatherDTO = weatherDTOs[i];
				break;
			}
		}
		return weatherDTO;
		
	}
	
	//4번 지역 날씨 추가
	//add 메서드
	//배열을 받고 키보드로부터 정보들을 입력받음
	//배열에 추가하고 배열을 리턴
	
	public WeatherDTO [] add(WeatherDTO [] weatherDTOs) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weatherDTO.setGion(sc.next());
		System.out.println("날씨를 입력하세요");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지를 입력하세요");
		weatherDTO.setMise(sc.next());
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length+1];
		
		for(int i =0;i<weatherDTOs.length;i++) {
			newInfo[i]=weatherDTOs[i];
		}
		newInfo[weatherDTOs.length]=weatherDTO;
		
		return newInfo;
		
	}
	
	
	
	//5번 지역날씨 삭제
	//remove 메서드
	//배열을 받고 키보드로부터 삭제할 도시명을 입력받음
	//배열에서 삭제하고 배열을 리턴
	
	public WeatherDTO [] remove(WeatherDTO [] weatherDTOs) {
		System.out.println("삭제할 도시명을 입력하세요");
		String name=sc.next().toUpperCase();
		int idx =0;
		for(int i =0;i<weatherDTOs.length;i++) {
			if(name.equals(weatherDTOs[i].getCity().toUpperCase())){
				continue;
			}
			
		}
		
		return newInfo;
		
	}
	

}
