package com.icss.hotel.pojo;
/**
 * ������
 * @author Moline-x
 *
 */
public class Order {
	//�������
	private Integer ono;
	//�˿�����
	private String cname;
	//��������
	private String tname;
	//������
	private String rno;
	//��סʱ��
	private String startTime;
	//�˷�ʱ��
	private String endTime;
	//״̬
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
