package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.DriverBehaviour;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface DriverBehaviourApiService {
  
      List<DriverBehaviour> findAllDriverBehaviour()
      throws NotFoundException;
  
      DriverBehaviour updateDriverBehaviour(DriverBehaviour driverBehaviour)
      throws NotFoundException;
  
      DriverBehaviour addDriverBehaviour(DriverBehaviour driverBehaviour)
      throws NotFoundException;
  
      DriverBehaviour findByIdDriverBehaviour(Long id)
      throws NotFoundException;
  
      void deleteDriverBehaviour(Long id)
      throws NotFoundException;
  
}

