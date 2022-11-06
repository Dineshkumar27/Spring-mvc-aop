package com.fita.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccountDAO(String status) {
		System.out.println("ADDING AN ACCOUNT" + status);
	}

}
