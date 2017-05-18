package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.VehicleFare;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class VehicleFareApiServiceImpl implements VehicleFareApiService {
		  	  
	  @Autowired
	
  	  private VehicleFareRepository  vehicleFareRepository ;
	   
  
  
				
			
      @Override
      public List<VehicleFare> findAllVehicleFare()
      throws NotFoundException {
      
        
  		
  		
  			return vehicleFareRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleFare updateVehicleFare(VehicleFare vehicleFare)
      throws NotFoundException {
      
         
        	return vehicleFareRepository.save(vehicleFare);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleFare addVehicleFare(VehicleFare vehicleFare)
      throws NotFoundException {
      
         
        	return vehicleFareRepository.save(vehicleFare);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleFare findByIdVehicleFare(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return vehicleFareRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteVehicleFare(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

