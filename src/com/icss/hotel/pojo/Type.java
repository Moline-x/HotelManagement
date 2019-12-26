package com.icss.hotel.pojo;

public class Type {
	private Integer tno;
	private String tname;
	private Double price;
	private Integer totalNum;
	private Integer RestNum;
	
	
	public Type() {
		super();
	}

	
	public Type(Integer tno, String tname, Double price, Integer totalNum, Integer restNum) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.price = price;
		this.totalNum = totalNum;
		RestNum = restNum;
	}


	public Integer getTno() {
		return tno;
	}

	public void setTno(Integer tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getRestNum() {
		return RestNum;
	}

	public void setRestNum(Integer restNum) {
		RestNum = restNum;
	}

	@Override
	public String toString() {
		return "Type [tno=" + tno + ", tname=" + tname + ", price=" + price + ", totalNum=" + totalNum + ", RestNum="
				+ RestNum + "]";
	}
	
}
