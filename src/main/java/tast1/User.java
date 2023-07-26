package tast1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
   private long mobile_no;
   private String password;
   private String u_name;
   private String email;
   private String job;
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public long getMobile_no() {
	return mobile_no;
}
public void setMobile_no(long mobile_no) {
	this.mobile_no = mobile_no;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getU_name() {
	return u_name;
}
public void setU_name(String u_name) {
	this.u_name = u_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
   
   
 
}

