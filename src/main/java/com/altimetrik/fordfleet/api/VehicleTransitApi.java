package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.VehicleTransitApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.VehicleTransit;


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

public class VehicleTransitApi {

   @Autowired
   private VehicleTransitApiService service;
  

  @RequestMapping(value = "/vehicle_transit", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<VehicleTransit>> findAllVehicleTransit()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<VehicleTransit>>(service.findAllVehicleTransit(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_transit", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< VehicleTransit> updateVehicleTransit(@RequestBody VehicleTransit vehicleTransit
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleTransit>(service.updateVehicleTransit(vehicleTransit), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_transit", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< VehicleTransit> addVehicleTransit(@RequestBody VehicleTransit vehicleTransit
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleTransit>(service.addVehicleTransit(vehicleTransit), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_transit/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< VehicleTransit> findByIdVehicleTransit(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleTransit>(service.findByIdVehicleTransit(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_transit/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteVehicleTransit(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteVehicleTransit(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

