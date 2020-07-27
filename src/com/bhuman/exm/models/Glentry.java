package com.bhuman.exm.models;

/* Glentry POJO */
public class Glentry {

	private String accountNo;

	private String trx_amount;

	public Glentry() {
	}

	public Glentry(String accountNo, String trx_amount) {
		this.accountNo = accountNo;
		this.trx_amount = trx_amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getTrx_amount() {
		return trx_amount;
	}

	public void setTrx_amount(String trx_amount) {
		this.trx_amount = trx_amount;
	}
}
