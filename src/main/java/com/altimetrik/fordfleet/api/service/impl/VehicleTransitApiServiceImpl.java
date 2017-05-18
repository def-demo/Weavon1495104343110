package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.VehicleTransit;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class VehicleTransitApiServiceImpl implements VehicleTransitApiService {
		  	  
	  @Autowired
	
  	  private VehicleTransitRepository  vehicleTransitRepository ;
	   
  
  
				
			
      @Override
      public List<VehicleTransit> findAllVehicleTransit()
      throws NotFoundException {
      
        
  		
  		
  			return vehicleTransitRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleTransit updateVehicleTransit(VehicleTransit vehicleTransit)
      throws NotFoundException {
      
         
        	return vehicleTransitRepository.save(vehicleTransit);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleTransit addVehicleTransit(VehicleTransit vehicleTransit)
      throws NotFoundException {
      
         
        	return vehicleTransitRepository.save(vehicleTransit);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleTransit findByIdVehicleTransit(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return vehicleTransitRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteVehicleTransit(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

