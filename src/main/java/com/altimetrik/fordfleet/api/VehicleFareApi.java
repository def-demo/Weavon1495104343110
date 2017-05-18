package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.VehicleFareApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.VehicleFare;


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

public class VehicleFareApi {

   @Autowired
   private VehicleFareApiService service;
  

  @RequestMapping(value = "/vehicle_fare", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<VehicleFare>> findAllVehicleFare()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<VehicleFare>>(service.findAllVehicleFare(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_fare", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< VehicleFare> updateVehicleFare(@RequestBody VehicleFare vehicleFare
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleFare>(service.updateVehicleFare(vehicleFare), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_fare", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< VehicleFare> addVehicleFare(@RequestBody VehicleFare vehicleFare
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleFare>(service.addVehicleFare(vehicleFare), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_fare/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< VehicleFare> findByIdVehicleFare(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleFare>(service.findByIdVehicleFare(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_fare/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteVehicleFare(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteVehicleFare(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

