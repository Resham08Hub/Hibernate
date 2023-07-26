package com.joker;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {
	@Id
	private int d_no;
	private String d_name;
	private String d_loc;

	public int getD_no() {
		return d_no;
	}

	public void setD_no(int d_no) {
		this.d_no = d_no;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_loc() {
		return d_loc;
	}

	public void setD_loc(String d_loc) {
		this.d_loc = d_loc;
	}

}
