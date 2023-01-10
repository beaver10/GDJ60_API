package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;import javax.security.auth.Subject;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		//0은 제외되게 만드는법! +1
//		int num = random.nextInt(9)+1;
//		System.out.println(num);

		
		//예제
		//로또 구매 1~45 무작위 6개 번호
		//중복 없이
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i = 0; i<6;i++) {
			int num =random.nextInt(10)+1;
			ar.add(num);
			for(int j = 0; j<ar.size();j++) {
				if(num==j){
					ar.remove(num);
					i--;
					break;
				}
				
			}
			
		}
		
		System.out.println(ar);
		
		
		
		
	}

}
