package com.axis.repository;

import java.util.List;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.dto.CreditCardDto;
import com.axis.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long>{

	//List<CreditCardDto> getAllActiveByConsumerId(Long consumerId);

	//Optional<CreditCard> getActiveById(Long id);
	
	// CreditCard getById(Long id);

	//boolean changeDailyLimit(CreditCard creditCard);

	//boolean activate(Long id);

	//boolean deactivate(Long id);
	
	


	
}
