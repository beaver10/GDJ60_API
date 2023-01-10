package com.iu.api2.collections.ex1;

import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb=new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("yujin, 3, 89, 74, 87 ");
		sb.append("young, 4, 71, 25, 99 ");

	}
	
	
	public StudentDAO [] init() {
		
		String str = sb.toString();
		
		System.out.println(str);
		
		str = str.replace("-", ",");
		str = str.replace(",", " ");
		
		StringTokenizer st = new StringTokenizer(str.toString()," ");
		StudentDAO[] students = new StudentDAO[st.countTokens()/5];
		
		
		int i = 0;
		while(st.hasMoreTokens()) {
			StudentDAO studentDAO = new StudentDAO();
			
			String t1 = st.nextToken();
			studentDAO.sb.toString();
		
			String t2 =st.nextToken();
			studentDAO.sb.toString();
			
			String t3 =st.nextToken();
			studentDAO.sb.toString();
			
			String t4 =st.nextToken();
			studentDAO.sb.toString();
			
			String t5 =st.nextToken();
			studentDAO.sb.toString();
			
			students[i] = studentDAO;
			i++;
		}
		return students;
	}
	
	

}
