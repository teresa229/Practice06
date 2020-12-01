package com.javaex.ex05;

public class Depart extends Employee {

	 //필드
	private String dev;
	
	//생성자
	public Depart() {}
	
	public Depart(String name, int salary, String dev) {
		super(name, salary);
		this.dev= dev;
	}
	
	//메소드
	public void showInformation() {
        System.out.println("이름:" + getName() + "   연봉:" + getSalary() + "   부서:" + dev);
    }
}
