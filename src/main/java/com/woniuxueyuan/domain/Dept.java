package com.woniuxueyuan.domain;

import java.io.Serializable;

public class Dept  implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int did;
	private String dname;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}

}
