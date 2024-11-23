package com.cursoprofissional.desafio.entities;

public class Order {

	private Integer code;
	private double basic;
	private double doscount;
	
	public Order() {
		
	}
	
	public Order(Integer code, double basic, double doscount) {
		super();
		this.code = code;
		this.basic = basic;
		this.doscount = doscount;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public double getBasic() {
		return basic;
	}
	
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public double getDoscount() {
		return doscount;
	}
	
	public void setDoscount(double doscount) {
		this.doscount = doscount;
	}
	
	
}
