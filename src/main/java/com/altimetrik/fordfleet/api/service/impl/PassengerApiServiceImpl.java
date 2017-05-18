package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.Passenger;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class PassengerApiServiceImpl implements PassengerApiService {
		  	  
	  @Autowired
	
  	  private PassengerRepository  passengerRepository ;
	   
  
  
				
			
      @Override
      public List<Passenger> findAllPassenger()
      throws NotFoundException {
      
        
  		
  		
  			return passengerRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Passenger updatePassenger(Passenger passenger)
      throws NotFoundException {
      
         
        	return passengerRepository.save(passenger);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Passenger addPassenger(Passenger passenger)
      throws NotFoundException {
      
         
        	return passengerRepository.save(passenger);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Passenger findByIdPassenger(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return passengerRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePassenger(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

