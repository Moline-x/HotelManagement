package com.icss.hotel.pojo;
/**
 * 顾客表
 * @author Moline-x
 *
 */
public class Customer {
	//顾客编号
	private Integer cno;
	//顾客姓名
	private String cname;
	//性别
	private String gender;
	//身份证号
	private String idcard;
	//手机号码
	private String phone;
	//积分，退房时候自动添加（10元1积分）
	private Integer integral;
	
	public Customer() {
		super();
	}

	public Customer(Integer cno, String cname, String gender, String idcard, String phone, Integer integral) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.gender = gender;
		this.idcard = idcard;
		this.phone = phone;
		this.integral = integral;
	}

	

	public Customer(String cname, String gender, String idcard, String phone) {
		super();
		this.cname = cname;
		this.gender = gender;
		this.idcard = idcard;
		this.phone = phone;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", gender=" + gender + ", idcard=" + idcard + ", phone="
				+ phone + ", integral=" + integral + "]";
	}
}
