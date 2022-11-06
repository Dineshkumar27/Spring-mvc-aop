package com.fita.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fita.aopdemo.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Democonfig.class);

		AccountDAO accountdao = context.getBean("accountDAO", AccountDAO.class);

		accountdao.addAccountDAO("failure");

		System.out.println("Again Calling");
		accountdao.addAccountDAO("Success");

	}

}
