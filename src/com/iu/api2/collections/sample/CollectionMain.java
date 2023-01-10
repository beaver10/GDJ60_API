package com.iu.api2.collections.sample;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		//ArrayList<Object>
		ArrayList<Parent> ar = new ArrayList<>();
		
		ar.add(child1);
		ar.add(child2);
		//Child1 ch1 = (Child1)ar.get(0); 꺼낼때
		
		//get(0)번째가 child2 클래스가 맞냐? ture or false
		System.out.println(ar.get(0) instanceof Child2); 

		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		//Parent의 부모타입을 말하는 것
		ArrayList<? super Parent> ar3 = new ArrayList<>();
		
		//ar2.add(child2); //왜안되지??? 선생님이 알아봐주신다고함..
		
		
	}

}
