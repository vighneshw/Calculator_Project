package com.example.demo.service;

import com.sun.el.parser.ParseException;

public interface CalculatorService {
	public Integer add(String a, String b) throws ParseException;
	public Integer subtract(String a, String b) throws ParseException;
	public Integer multiply(String a, String b) throws ParseException;
	public Integer divide(String a, String b) throws Exception;
	
}
