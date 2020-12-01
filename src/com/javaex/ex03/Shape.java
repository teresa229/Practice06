package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor; //private 수정
	protected String lineColor; //private 수정
	
	//생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소스-기본
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

}

