package Ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetail {
	@Id
	String userName;
	String password;
	String role;
	boolean enable;
	String customerName;
	String cuStomerAddr;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCuStomerAddr() {
		return cuStomerAddr;
	}

	public void setCuStomerAddr(String cuStomerAddr) {
		this.cuStomerAddr = cuStomerAddr;
	}

	
}
