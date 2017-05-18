package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.Driver;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class DriverApiServiceImpl implements DriverApiService {
		  	  
	  @Autowired
	
  	  private DriverRepository  driverRepository ;
	   
  
  
				
			
      @Override
      public List<Driver> findAllDriver()
      throws NotFoundException {
      
        
  		
  		
  			return driverRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Driver updateDriver(Driver driver)
      throws NotFoundException {
      
         
        	return driverRepository.save(driver);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Driver addDriver(Driver driver)
      throws NotFoundException {
      
         
        	return driverRepository.save(driver);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Driver findByIdDriver(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return driverRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteDriver(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

