package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {
	
	//check
	//주민번호를 받아서
	//991224-1234567
	//맨 끝자리는 체크용 번호로 뺌
	//	9	8	0	7	2	4	-	1	2	3	4	5	6 //곱하기
	//	2	3	4	5	6	7		8	9	2	3	4	5
	//	18+	24+	0+	35	12	28		8	18	6	12	20	30 //더하기
	//	총 합이 211, 합을 11로 나누어서 나머지 구하기
	//	122/11 =몫:11, 나머지:1
	//	나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	//	11-1=10
	//	11로 뺀 결과값이 두자리라면
	//	11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	//	10/10 몫:1, 나머지:0 
	//	0==7?
	//	정상 주민번호 입니다 or 비정상 주민번호입니다
	
	public void check(String jumin) {
		int num =2;
		int sum =0;
		for(int i = 0; i<jumin.length()-1;i++) {
			if(i==6) {
				continue;
			}
			//sum = sum+ Integer.parseInt(jumin.substring(i,i+1))*num;
			//sum = sum+ Integer.parseInt(jumin.substring(i)+"")*num;
			sum = sum+ Integer.parseInt(String.valueOf(jumin.charAt(i)))*num;

			num++;
			if(num==10) {
				num=2;
			}
		}
		
		int result = 11-sum%11;
		
		if(result>9) {
			result = result%10;
		}
		
		int flag= Integer.parseInt(jumin.substring(13));
		
		if(result == flag) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		
		
	}
	
	
	

}
