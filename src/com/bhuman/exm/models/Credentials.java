package com.bhuman.exm.models;

/* Credentials POJO */
public class Credentials {

	private String userId;

	private String companyId;

	private String password;

	public Credentials() {

	}

	public Credentials(String userId, String companyId, String password) {
		this.userId = userId;
		this.companyId = companyId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSessionId() {
		return userId + "," + companyId + "," + password;
	}
}
