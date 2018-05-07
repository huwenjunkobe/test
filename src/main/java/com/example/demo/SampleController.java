package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/")
	public String home() {
		Long  a = 9999999999L;
		Long sum = 0L;
	    String b ="";
		int length = a.toString().length();
		for(int i = 1 ; i <= length ;i++ ) {
			b = b + "9";
			Long num = Long.parseLong(b);
			sum = sum + num;
			System.out.println("length为:" + i + "sum为:" + sum);
		}
		return "HEJA BVB  HALA MADRID  Lakers Championship";
	}
}
