package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.TripApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.Trip;


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

public class TripApi {

   @Autowired
   private TripApiService service;
  

  @RequestMapping(value = "/trip", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Trip>> findAllTrip()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Trip>>(service.findAllTrip(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/trip", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Trip> updateTrip(@RequestBody Trip trip
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Trip>(service.updateTrip(trip), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/trip", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Trip> addTrip(@RequestBody Trip trip
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Trip>(service.addTrip(trip), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/trip/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Trip> findByIdTrip(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Trip>(service.findByIdTrip(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/trip/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTrip(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteTrip(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

