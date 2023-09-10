package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.demo.form.ApiRequest;
import com.example.demo.form.ApiResponse;
import com.example.demo.service.CalculatorService;



@RestController // Controller & Response Body
public class CalculatorController {
	
	 private static final Logger LOGGER = LogManager.getLogger(CalculatorController.class);
	
	@Autowired
	CalculatorService vCalculatorService;
	
	@RequestMapping(produces="application/json", consumes="application/json", value="/calculate")
	public ApiResponse calculate(@RequestBody ApiRequest vRequest) {
		LOGGER.info("Entered in calculate metho of CalculatorController");
		ApiResponse vResponse = null;
		String value = null;
		try {
			
			if(vRequest.getAction().equals("add")) {
				value = vCalculatorService.add(vRequest.getVar1(), vRequest.getVar2()).toString();
				vResponse = new ApiResponse();
				vResponse.setResult(value);
				vResponse.setStatus("success");
				LOGGER.info("The value of addition is " + value);
			} else if(vRequest.getAction().equals("subtract")) {
				value = vCalculatorService.subtract(vRequest.getVar1(), vRequest.getVar2()).toString();
				vResponse = new ApiResponse();
				vResponse.setResult(value);
				vResponse.setStatus("success");
				LOGGER.info("The value of subtracction is " + value);
			} else if(vRequest.getAction().equals("divide")) {
				value = vCalculatorService.divide(vRequest.getVar1(), vRequest.getVar2()).toString();
				vResponse = new ApiResponse();
				vResponse.setResult(value);
				vResponse.setStatus("success");
				LOGGER.info("The value of division is " + value);
			} else if(vRequest.getAction().equals("multiply")) {
				value = vCalculatorService.multiply(vRequest.getVar1(), vRequest.getVar2()).toString();
				vResponse = new ApiResponse();
				vResponse.setResult(value);
				vResponse.setStatus("success");
				LOGGER.info("The value of multiplication is " + value);
			} else {
				vResponse = new ApiResponse();
				vResponse.setStatus("fail");
				vResponse.setFailedReason("Only add, subtract, divide & multiply operations are supported");
				LOGGER.info("Invalid data entered By useer");
			}
		} catch(Exception e) {
			vResponse = new ApiResponse();
			vResponse.setStatus("fail");
			vResponse.setFailedReason("Exception occurred " + e.getMessage());
			LOGGER.info("Invalid data entered By useer ", e);
		}
		//Integer value =  vCalculatorService.add(, b)
		return vResponse;
	}

}
