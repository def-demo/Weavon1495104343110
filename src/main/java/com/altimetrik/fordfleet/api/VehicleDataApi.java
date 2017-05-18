package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.VehicleDataApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.VehicleData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class VehicleDataApi {

   @Autowired
   private VehicleDataApiService service;
  

  @RequestMapping(value = "/vehicle_data", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<VehicleData>> findAllVehicleData()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<VehicleData>>(service.findAllVehicleData(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_data", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< VehicleData> updateVehicleData(@RequestBody VehicleData vehicleData
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleData>(service.updateVehicleData(vehicleData), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_data", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< VehicleData> addVehicleData(@RequestBody VehicleData vehicleData
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleData>(service.addVehicleData(vehicleData), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_data/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< VehicleData> findByIdVehicleData(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleData>(service.findByIdVehicleData(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_data/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteVehicleData(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteVehicleData(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

