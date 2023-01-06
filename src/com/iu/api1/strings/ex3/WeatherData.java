package com.iu.api1.strings.ex3;

public class WeatherData {
	
	private String data;
	
	public WeatherData() {
		this.data="SEOUL,12,맑음,60,Deagu,68,비,10,"
				+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	//init = 초기화 시작
	//init 메서드 만들기
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
	//DTO 4개...
	
	public WeatherDTO [] init() {
		
		String [] datas = this.data.split(",");
		WeatherDTO [] weathers = new WeatherDTO[datas.length/4];
//		int idx = 0;
		for(int i = 0; i<datas.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(datas[i]);
			weatherDTO.setGion(datas[++i]);
			weatherDTO.setStatus(datas[++i]);
			weatherDTO.setMise(datas[++i]);
			weathers[i/4] = weatherDTO;
			
//			weathers[idx]=weatherDTO;
//			idx++;
		}
		return weathers;
		}
		
	}
	

