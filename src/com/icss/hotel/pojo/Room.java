package com.icss.hotel.pojo;

public class Room {
	private Integer rno;
	private String tname;
	private Integer rstate;
	private String remark;
	public Room() {
		super();
	}
	public Room(Integer rno, String tname, Integer rstate, String remark) {
		super();
		this.rno = rno;
		this.tname = tname;
		this.rstate = rstate;
		this.remark = remark;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getRstate() {
		return rstate;
	}
	public void setRstate(Integer rstate) {
		this.rstate = rstate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Room [rno=" + rno + ", tname=" + tname + ", rstate=" + rstate + ", remark=" + remark + "]";
	}
	
	
}
