package com.altimetrik.fordfleet.api;

import com.altimetrik.fordfleet.models.*;

import com.altimetrik.fordfleet.api.service.VehicleObdApiService;

import com.altimetrik.fordfleet.exception.NotFoundException;

import com.altimetrik.fordfleet.models.VehicleObd;


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

public class VehicleObdApi {

   @Autowired
   private VehicleObdApiService service;
  

  @RequestMapping(value = "/vehicle_obd", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<VehicleObd>> findAllVehicleObd()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<VehicleObd>>(service.findAllVehicleObd(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_obd", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< VehicleObd> updateVehicleObd(@RequestBody VehicleObd vehicleObd
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleObd>(service.updateVehicleObd(vehicleObd), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_obd", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< VehicleObd> addVehicleObd(@RequestBody VehicleObd vehicleObd
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleObd>(service.addVehicleObd(vehicleObd), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_obd/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< VehicleObd> findByIdVehicleObd(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<VehicleObd>(service.findByIdVehicleObd(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/vehicle_obd/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteVehicleObd(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteVehicleObd(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

