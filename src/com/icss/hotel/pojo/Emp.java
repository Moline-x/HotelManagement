package com.icss.hotel.pojo;
/**
 * Ա����
 * @author Moline-x
 * 20191224
 */
public class Emp {
	//Ա�����
	private Integer eno;
	//Ա������
	private String ename;
	//�Ա�
	private String gender;
	//����
	private String birth;
	//����
	private String password;
	//�˻� ��¼�õ�
	private String account;
	//�绰
	private String phone;
	//״̬ ��ְ1 ��ְ0
	private Integer state;
	//��ɫ ����Ա1 ��ͨԱ��0
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
