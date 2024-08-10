package com.learnspring.framwork_app_11;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuisnessCalculationService {
	
	private DataService dataService;
	
	@Autowired
	public BuisnessCalculationService(DataService dataService)
	{
		super();
		this.dataService=dataService;
	}
	public int findMax()
	{
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

	

}
