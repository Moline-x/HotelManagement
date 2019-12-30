package com.icss.hotel.pojo;
/**
 * 订单表
 * @author Moline-x
 *
 */
public class Order {
	//订单编号
	private Integer ono;
	//顾客姓名
	private String cname;
	//房间类型
	private String tname;
	//房间编号
	private String rno;
	//入住时间
	private String startTime;
	//退房时间
	private String endTime;
	//状态
	private Integer ostate;
	
	public Order() {
		super();
	}

	public Order(Integer ono, String cname, String tname, String rno, String startTime, String endTime,
			Integer ostate) {
		super();
		this.ono = ono;
		this.cname = cname;
		this.tname = tname;
		this.rno = rno;
		this.startTime = startTime;
		this.endTime = endTime;
		this.ostate = ostate;
	}

	public Integer getOno() {
		return ono;
	}

	public void setOno(Integer ono) {
		this.ono = ono;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getOstate() {
		return ostate;
	}

	public void setOstate(Integer ostate) {
		this.ostate = ostate;
	}

	@Override
	public String toString() {
		return "Order [ono=" + ono + ", cname=" + cname + ", tname=" + tname + ", rno=" + rno + ", startTime="
				+ startTime + ", endTime=" + endTime + ", ostate=" + ostate + "]";
	}
	
	
	
}
