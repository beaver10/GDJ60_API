package com.iu.api1.objects;

public class ObjectStudy {

	public static void main(String[] args) {
		//객체 생성 공식
		Object object = new Object();
		
		
		//멤버 사용(접근)
		//참조변수명.변수명, 참조변수명,메서드명()
		int result = object.hashCode();
		System.out.println(result);
		
		String result2 = object.toString();
		System.out.println(result2);
		System.out.println(object);//object.toString()
		
		Child child = new Child();
		Object obj = new Object();
		
		
		
		System.out.println(object==obj);
		//위와 아래의 코드는 같다 이퀄을사용하면 ==과 같음
		boolean check =object.equals(obj);
		System.out.println(check);
		
		
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());
		
		
		Object o = child; //다형성
		

	}

}
