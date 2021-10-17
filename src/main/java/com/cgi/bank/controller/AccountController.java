package com.cgi.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.bank.entity.Account;
import com.cgi.bank.service.AccountService;

//@RestController
@Controller
@RequestMapping
public class AccountController {
	
	@Autowired
	private AccountService accSer;
	
	@RequestMapping("/Hello")
	public String heeloWorld() {
		return "index";
	}
	
	@PostMapping(value = "/save")
	public int saveAccount(@RequestBody Account acc) {
		System.out.println(acc);
		int id =accSer.saveAccount(acc);
		return id;
	}
	@RequestMapping(value = "/getAll")
	//@ResponseBody
	public String  getAllAccount(Model model) {
		
		List<Account> listAcc= accSer.getAllAccountDetails();
		System.out.println(listAcc);
		model.addAttribute("account", listAcc);
		
		return "result";
	}
 
	
}
