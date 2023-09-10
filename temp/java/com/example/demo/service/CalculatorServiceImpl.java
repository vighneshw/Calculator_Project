package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.sun.el.parser.ParseException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	public Integer add(String a, String b) throws ParseException {
		
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
	
	public Integer subtract(String a, String b) throws ParseException {
		
		return Integer.parseInt(a) - Integer.parseInt(b);
	}
	
	public Integer multiply(String a, String b) throws ParseException {
		
		return Integer.parseInt(a) * Integer.parseInt(b);
	}
	
	public Integer divide(String a, String b) throws Exception {
		
		return Integer.parseInt(a) / Integer.parseInt(b);
	}
}
