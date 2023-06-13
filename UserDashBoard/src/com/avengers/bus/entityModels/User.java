package com.avengers.bus.entityModels;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "btrs_user1")
public class User {

	@Id
	int user_id;
	String user_email;
	String user_name;
	String dob;
	long mobile;
	String address;
	String passwords;

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_email=" + user_email + ", user_name=" + user_name + ", Dob=" + dob
				+ ", mobile=" + mobile + ", address=" + address + ", passwords=" + passwords + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getdob() {
		return dob;
	}

	public void setDob(String dob) {
		dob = dob;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

}
