package com.demobank.accountmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.accountmanagement.dtos.BenificiaryDTO;
import com.demobank.accountmanagement.repositories.BenificiaryRepository;

@Service
public class BenificiaryService {
	@Autowired
	BenificiaryRepository benificiaryRepository;
	
	public void createBenificiary(BenificiaryDTO benificiaryDTO)
	{
		
	}
	

}
