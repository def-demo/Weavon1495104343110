package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.DriverMaster;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class DriverMasterApiServiceImpl implements DriverMasterApiService {
		  	  
	  @Autowired
	
  	  private DriverMasterRepository  driverMasterRepository ;
	   
  
  
				
			
      @Override
      public List<DriverMaster> findAllDriverMaster()
      throws NotFoundException {
      
        
  		
  		
  			return driverMasterRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public DriverMaster updateDriverMaster(DriverMaster driverMaster)
      throws NotFoundException {
      
         
        	return driverMasterRepository.save(driverMaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public DriverMaster addDriverMaster(DriverMaster driverMaster)
      throws NotFoundException {
      
         
        	return driverMasterRepository.save(driverMaster);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public DriverMaster findByIdDriverMaster(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return driverMasterRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteDriverMaster(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

