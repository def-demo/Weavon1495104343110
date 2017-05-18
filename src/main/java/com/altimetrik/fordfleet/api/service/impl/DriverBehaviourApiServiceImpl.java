package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.DriverBehaviour;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class DriverBehaviourApiServiceImpl implements DriverBehaviourApiService {
		  	  
	  @Autowired
	
  	  private DriverBehaviourRepository  driverBehaviourRepository ;
	   
  
  
				
			
      @Override
      public List<DriverBehaviour> findAllDriverBehaviour()
      throws NotFoundException {
      
        
  		
  		
  			return driverBehaviourRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public DriverBehaviour updateDriverBehaviour(DriverBehaviour driverBehaviour)
      throws NotFoundException {
      
         
        	return driverBehaviourRepository.save(driverBehaviour);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public DriverBehaviour addDriverBehaviour(DriverBehaviour driverBehaviour)
      throws NotFoundException {
      
         
        	return driverBehaviourRepository.save(driverBehaviour);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public DriverBehaviour findByIdDriverBehaviour(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return driverBehaviourRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteDriverBehaviour(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

