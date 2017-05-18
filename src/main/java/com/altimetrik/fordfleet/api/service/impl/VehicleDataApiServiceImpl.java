package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.VehicleData;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class VehicleDataApiServiceImpl implements VehicleDataApiService {
		  	  
	  @Autowired
	
  	  private VehicleDataRepository  vehicleDataRepository ;
	   
  
  
				
			
      @Override
      public List<VehicleData> findAllVehicleData()
      throws NotFoundException {
      
        
  		
  		
  			return vehicleDataRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleData updateVehicleData(VehicleData vehicleData)
      throws NotFoundException {
      
         
        	return vehicleDataRepository.save(vehicleData);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleData addVehicleData(VehicleData vehicleData)
      throws NotFoundException {
      
         
        	return vehicleDataRepository.save(vehicleData);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public VehicleData findByIdVehicleData(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return vehicleDataRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteVehicleData(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

