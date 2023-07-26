package com.joker;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
   private int emp_no;
   private String emp_name;
   private String job;
public int getEmp_no() {
	return emp_no;
}
public void setEmp_no(int emp_no) {
	this.emp_no = emp_no;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
   
}
