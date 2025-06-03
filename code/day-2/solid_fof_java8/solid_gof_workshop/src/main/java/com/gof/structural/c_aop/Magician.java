package com.gof.structural.c_aop;

import org.springframework.stereotype.Component;

@Component(value = "m")
public class Magician {
		public void doMagic(){
			System.out.println("abra ka dabra...");
		}

		public void eat(){
			System.out.println("eating the food");
		}
}