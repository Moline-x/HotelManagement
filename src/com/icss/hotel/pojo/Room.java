package com.icss.hotel.pojo;

public class Room {
	private Integer rno;
	private Integer tno;
	private Integer rstate;
	private String remark;
	public Room() {
		super();
	}
	public Room(int rno, int tno, int rstate, String remark) {
		super();
		this.rno = rno;
		this.tno = tno;
		this.rstate = rstate;
		this.remark = remark;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public int getRstate() {
		return rstate;
	}
	public void setRstate(int rstate) {
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
		return "Room [rno=" + rno + ", tno=" + tno + ", rstate=" + rstate + ", remark=" + remark + "]";
	}
	
}
