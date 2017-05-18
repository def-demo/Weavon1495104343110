package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.LoginApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.Login;


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

public class LoginApi {

   @Autowired
   private LoginApiService service;
  

  @RequestMapping(value = "/login", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Login>> findAllLogin()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Login>>(service.findAllLogin(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/login", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Login> updateLogin(@RequestBody Login login
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Login>(service.updateLogin(login), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/login", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Login> addLogin(@RequestBody Login login
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Login>(service.addLogin(login), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/login/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Login> findByIdLogin(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Login>(service.findByIdLogin(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/login/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteLogin(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteLogin(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

