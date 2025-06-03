package com.gof.structural.c_aop;
//Aspect or programming
//Aspect: advice + pointcut
//joinpont vs pointcut

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //advice + pointcut
		// kiya karna hey + kaha karna
public class AudianceAspect {

		@After("execution(public void doMagic())")
		public void clapping(){
			System.out.println("maza aa gaya...");
		}
	}
