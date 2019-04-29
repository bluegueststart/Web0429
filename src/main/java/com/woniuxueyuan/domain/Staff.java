package com.woniuxueyuan.domain;

import java.io.Serializable;
import java.sql.Date;

public class Staff   implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sid;
	private String sname;
	private Double salary;
	private Date hiredate;
	private int did;

	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sname=" + sname + ", salary=" + salary + ", hiredate=" + hiredate + ", did="
				+ did + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

}
