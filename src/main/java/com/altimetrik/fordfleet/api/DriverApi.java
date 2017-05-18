package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.DriverApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.Driver;


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

public class DriverApi {

   @Autowired
   private DriverApiService service;
  

  @RequestMapping(value = "/driver", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Driver>> findAllDriver()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Driver>>(service.findAllDriver(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Driver> updateDriver(@RequestBody Driver driver
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Driver>(service.updateDriver(driver), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Driver> addDriver(@RequestBody Driver driver
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Driver>(service.addDriver(driver), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Driver> findByIdDriver(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Driver>(service.findByIdDriver(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/driver/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteDriver(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteDriver(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

