package com.fita.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
//
//	@Before("execution (public void addAccountDAO(..))") // point cut expression
//	public void beforeloggerAspect() {
//		System.out.println("<====add Account =====>");
//	}
//
	@After("execution (* addAccountDAO(..))")
	public void afterloggerAspect(JoinPoint jp) {
		System.out.println(jp.getSignature());

		System.out.println(jp.getArgs()[0].toString());
		System.out.println("<====after add Account =====>");
	}

//	@Around("execution (* com.fita.aopdemo.dao.AccountDAO.addAccountDAO(..))")
//	public void afterloggerAspect() {
//		System.out.println("<====around add Account =====>");
//	}

}
