package com.icss.hotel.pojo;

public class Type {
	private int tno;
	private String tname;
	private double price;
	private int totalNum;
	private int RestNum;
	
	
	public Type() {
		super();
	}


	public Type(int tno, String tname, double price, int totalNum, int restNum) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.price = price;
		this.totalNum = totalNum;
		RestNum = restNum;
	}


	public int getTno() {
		return tno;
	}


	public void setTno(int tno) {
		this.tno = tno;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getTotalNum() {
		return totalNum;
	}


	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}


	public int getRestNum() {
		return RestNum;
	}


	public void setRestNum(int restNum) {
		RestNum = restNum;
	}


	@Override
	public String toString() {
		return "Type [tno=" + tno + ", tname=" + tname + ", price=" + price + ", totalNum=" + totalNum + ", RestNum="
				+ RestNum + "]";
	}
	
	
	
}
