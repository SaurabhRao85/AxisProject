package com.axis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.dto.CreditCardDto;

import com.axis.service.CreditCardService;

@RestController
@RequestMapping("/api/banking/creditcard")
public class CreditCardController {

	@Autowired
	CreditCardService creditCardService;
	
	@PostMapping("/creditCard")
	public ResponseEntity<CreditCardDto> addCreditCard(@RequestBody CreditCardDto creditCardDto)
	{
		return new ResponseEntity<CreditCardDto>(creditCardService.addCreditCard(creditCardDto), HttpStatus.OK);
	}
	
	
	@GetMapping("/creditCard")
	public ResponseEntity<List<CreditCardDto>> getAllCreditCard()
	{
		return new ResponseEntity<List<CreditCardDto>>(creditCardService.getAllCreditCard(), HttpStatus.OK);
	}
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<CreditCardDto> getCreditCardById(@PathVariable  int id)
	{
		return new ResponseEntity<CreditCardDto>(creditCardService.getCreditCardDetailsByCreditCardId(id), HttpStatus.OK);
	}
	

 
	
}
