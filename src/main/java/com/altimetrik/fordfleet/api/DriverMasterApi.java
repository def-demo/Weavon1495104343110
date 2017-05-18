package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.DriverMasterApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.DriverMaster;


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

public class DriverMasterApi {

   @Autowired
   private DriverMasterApiService service;
  

  @RequestMapping(value = "/driver_master", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<DriverMaster>> findAllDriverMaster()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<DriverMaster>>(service.findAllDriverMaster(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_master", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< DriverMaster> updateDriverMaster(@RequestBody DriverMaster driverMaster
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<DriverMaster>(service.updateDriverMaster(driverMaster), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_master", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< DriverMaster> addDriverMaster(@RequestBody DriverMaster driverMaster
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<DriverMaster>(service.addDriverMaster(driverMaster), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_master/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< DriverMaster> findByIdDriverMaster(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<DriverMaster>(service.findByIdDriverMaster(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_master/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteDriverMaster(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteDriverMaster(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

