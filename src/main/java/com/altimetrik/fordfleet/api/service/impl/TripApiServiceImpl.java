package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.Trip;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class TripApiServiceImpl implements TripApiService {
		  	  
	  @Autowired
	
  	  private TripRepository  tripRepository ;
	   
  
  
				
			
      @Override
      public List<Trip> findAllTrip()
      throws NotFoundException {
      
        
  		
  		
  			return tripRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Trip updateTrip(Trip trip)
      throws NotFoundException {
      
         
        	return tripRepository.save(trip);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Trip addTrip(Trip trip)
      throws NotFoundException {
      
         
        	return tripRepository.save(trip);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Trip findByIdTrip(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return tripRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTrip(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

