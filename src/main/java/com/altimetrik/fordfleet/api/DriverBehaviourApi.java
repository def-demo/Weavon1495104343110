package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.DriverBehaviourApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.DriverBehaviour;


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

public class DriverBehaviourApi {

   @Autowired
   private DriverBehaviourApiService service;
  

  @RequestMapping(value = "/driver_behaviour", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<DriverBehaviour>> findAllDriverBehaviour()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<DriverBehaviour>>(service.findAllDriverBehaviour(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_behaviour", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< DriverBehaviour> updateDriverBehaviour(@RequestBody DriverBehaviour driverBehaviour
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<DriverBehaviour>(service.updateDriverBehaviour(driverBehaviour), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_behaviour", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< DriverBehaviour> addDriverBehaviour(@RequestBody DriverBehaviour driverBehaviour
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<DriverBehaviour>(service.addDriverBehaviour(driverBehaviour), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_behaviour/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< DriverBehaviour> findByIdDriverBehaviour(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<DriverBehaviour>(service.findByIdDriverBehaviour(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver_behaviour/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteDriverBehaviour(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteDriverBehaviour(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

