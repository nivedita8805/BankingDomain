package com.cgi.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {
	@Id
	@Column(name = "ACCOUNTNUMBER")
	private int  accountNumber;
	@Column(name = "ACCOUNTNAME")
	private String accountName;
	@Column(name = "ACCOUNTTYPE")
	private String accountType;
	@Column(name = "BALANCEDATE")
	private String balanceDate;
	@Column(name = "CURRENCY")
	private String currency;
	@Column(name = "CURRENTOPENINGAVAILABLEBALANCE")
	private Double currencyOpeAvaBalance;
	
	
	/*
	 * @OneToOne(mappedBy = "acc" , cascade = CascadeType.ALL, fetch =
	 * FetchType.LAZY) private AccountHistory listAccount;
	 */
	
	public Double getCurrencyOpeAvaBalance() {
		return currencyOpeAvaBalance;
	}
	public String getCurrency() {
		return currency;
	}

	/*
	 * public AccountHistory getListAccount() { return listAccount; } public void
	 * setListAccount(AccountHistory listAccount) { this.listAccount = listAccount;
	 * }
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setCurrencyOpeAvaBalance(Double currencyOpeAvaBalance) {
		this.currencyOpeAvaBalance = currencyOpeAvaBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", balanceDate=" + balanceDate + ", currency=" + currency + ", currencyOpeAvaBalance="
				+ currencyOpeAvaBalance +"]";
	}
	
	

}
