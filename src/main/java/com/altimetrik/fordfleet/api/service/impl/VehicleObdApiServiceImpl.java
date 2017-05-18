package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.VehicleObd;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class VehicleObdApiServiceImpl implements VehicleObdApiService {
		  	  
	  @Autowired
	
  	  private VehicleObdRepository  vehicleObdRepository ;
	   
  
  
				
			
      @Override
      public List<VehicleObd> findAllVehicleObd()
      throws NotFoundException {
      
        
  		
  		
  			return vehicleObdRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleObd updateVehicleObd(VehicleObd vehicleObd)
      throws NotFoundException {
      
         
        	return vehicleObdRepository.save(vehicleObd);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleObd addVehicleObd(VehicleObd vehicleObd)
      throws NotFoundException {
      
         
        	return vehicleObdRepository.save(vehicleObd);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleObd findByIdVehicleObd(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return vehicleObdRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteVehicleObd(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

