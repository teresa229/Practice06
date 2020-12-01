package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] admin = new User[3];
		
		User u01 = new Customer("jws","j1234","정우성",1000);
		User u02 = new Customer("yjs","y1234","이효리",4000);
		User u03 = new Employee("master","m7788","운영자",500000);
		
		admin[0] = u01;
		admin[1] = u02;
		admin[2] = u03;
		
		for(int i=0; i<admin.length; i++) {
			admin[i].showInfo();
		}  
		
	}

}
