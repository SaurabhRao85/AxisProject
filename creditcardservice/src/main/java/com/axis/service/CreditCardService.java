package com.axis.service;

import java.util.List;
import java.util.Optional;

import com.axis.dto.CreditCardDto;
import com.axis.model.CreditCard;

public interface CreditCardService {

	 public CreditCardDto addCreditCard(CreditCardDto creditCardDto);
	
	  public List<CreditCardDto> getAllCreditCard();
	
	  public CreditCardDto getCreditCardDetailsByCreditCardId(long id);
	  
	  public CreditCardDto updateDailyLimitByCreditCardId(long id, CreditCardDto creditCardDto);
	  
	  public boolean activatebyCreditCardId(Long id);
	  
	  public boolean deactivatebyCreditCardId(Long id);
	        


	  
	  
	
	

	
	
	
}
