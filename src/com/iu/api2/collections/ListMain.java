package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		int [] arr = new int [3];
		arr[0] =1;
		arr[1]=2;
		arr[2]=3;
		//배열엔 더이상 못들어감 3으로 미리 생성해놨기 때문
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("==================");

		
		//순서 유지, 값의 중복 허용, 배열기반
		ArrayList ar = new ArrayList();
		ar.add(1);
		//add 새로운 데이터 추가
		ar.add(2);
		ar.add(3);
		ar.add(4);
		//하지만 어레이리스트에는 추가로 들어갈수 있음
		
		//1번 인덱스에 8을 사이에 끼워넣어라 (삭제x)
		ar.add(1,8);
		//3번 인덱스 값을 지워버려라!
		ar.remove(3);
		//0번 인덱스 번호를 9로 수정해라!
		ar.set(0, 9);
		//모든 요소를 삭제한다
		//ar.clear();
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i)); 
		}
		
	}

}
