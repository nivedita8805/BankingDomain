package com.cgi.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cgi.bank.entity.Account;

@Service
public interface AccountService {
	
	public int saveAccount(Account acc);
	
	public List<Account> getAllAccountDetails();
		
	

}
