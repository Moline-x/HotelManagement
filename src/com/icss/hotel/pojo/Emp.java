package com.icss.hotel.pojo;
/**
 * 员工表
 * @author Moline-x
 * 20191224
 */
public class Emp {
	//员工编号
	private Integer eno;
	//员工姓名
	private String ename;
	//性别
	private String gender;
	//生日
	private String birth;
	//密码
	private String password;
	//账户 登录用的
	private String account;
	//电话
	private String phone;
	//状态 离职1 在职0
	private Integer state;
	//角色 管理员1 普通员工0
	private Integer roleid;
	
	public Emp() {
		super();
	}

	public Emp(Integer eno, String ename, String gender, String birth, String password, String account, String phone,
			Integer state, Integer roleid) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.gender = gender;
		this.birth = birth;
		this.password = password;
		this.account = account;
		this.phone = phone;
		this.state = state;
		this.roleid = roleid;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", gender=" + gender + ", birth=" + birth + ", password="
				+ password + ", account=" + account + ", phone=" + phone + ", state=" + state + ", roleid=" + roleid
				+ "]";
	}
	
}
