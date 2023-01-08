package com.iu.api1.strings.ex3;

import java.util.Scanner;


public class WeatherController {
	//start
	//1번 누르면 날씨정보 초기화 (init 호출)- "초기화가 완료되었습니다"
	//2번 누르면 전국날씨정보 (view 호출)
	//3번 누르면 지역 날씨 검색 - 없으면 "도시정보가 없습니다."
	//4번 누르면 지역 날씨 추가 
	//5번 누르면 지역 날씨 삭제
	//6번 누르면 종료
	private Scanner sc = new Scanner(System.in);
	private WeatherData weatherData ;
	private WeatherView weatherView ;
	private WeatherInput weatherInput;
	private WeatherDTO[] weatherDTOs;
	
	public WeatherController() {
		this.sc=new Scanner(System.in);
		this.weatherData = new WeatherData();
		weatherView = new WeatherView();
		weatherInput= new WeatherInput();
		
		
	}
	
	
	public void start(){
//		Scanner sc = new Scanner(System.in);
//		WeatherData weatherData = new WeatherData();
//		WeatherView weatherView = new WeatherView();
//		WeatherInput weatherInput = new WeatherInput();
//		WeatherDTO[] weatherDTOs = null;
		
		boolean check = true;
		

			while(check) {
				System.out.println("1.날씨정보 초기화");
				System.out.println("2.전국 날씨 정보");
				System.out.println("3.지역 날씨 검색");
				System.out.println("4.지역 날씨 추가");
				System.out.println("5.지역 날씨 삭제");
				System.out.println("6.종료");
				int select = sc.nextInt();
				
				
		switch(select) {
			case 1 :
				weatherDTOs=weatherData.init();
				System.out.println("초기화가 완료되었습니다");
				break;
			case 2 :
				System.out.println("전국 날씨정보");
				weatherView.view(weatherDTOs);
				break;
			case 3 :
				System.out.println("지역 날씨 검색");
				WeatherDTO weatherDTO = weatherInput.seach(weatherDTOs);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}else {
					System.out.println("도시 정보가 없습니다");
				}
				break;
			case 4 :
				System.out.println("지역 날씨 추가");
				this.weatherDTOs=weatherInput.add(this.weatherDTOs);
				break;
			case 5 :
				System.out.println("지역 날씨 삭제");
				this.weatherDTOs=weatherInput.remove(this.weatherDTOs);
				break;
			default :
				System.out.println("종료");
				check=false;
				}
			}
			}
			
		
	}
	
	

