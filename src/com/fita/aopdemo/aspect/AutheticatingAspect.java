package com.fita.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AutheticatingAspect {
	@Pointcut("within(com.fita.aopdemo..*)")
	public void authenticationPointCut() {

	}

	@Pointcut("within(com.fita.aopdemo..*)")
	public void authorizationPointCut() {

	}

	@Before("authenticationPointCut()||authorizationPointCut()")
	public void authenticate() {
		System.out.println("Authenticating the request");
	}
}
