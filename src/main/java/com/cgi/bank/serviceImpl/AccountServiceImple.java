package com.cgi.bank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cgi.bank.Repository.AccountRepository;
import com.cgi.bank.entity.Account;
import com.cgi.bank.service.AccountService;

@Service
public class AccountServiceImple implements AccountService {
	
	@Autowired
	private AccountRepository accRepo;

	@Override
	public int saveAccount( Account acc) {
		System.out.println(acc);
		Account accsave=accRepo.save(acc);
		
		return accsave.getAccountNumber();
	}
  @Override
public List<Account> getAllAccountDetails() {
	  List<Account> getAll =accRepo.findAll();
	  
	 
	return getAll;
}
}
