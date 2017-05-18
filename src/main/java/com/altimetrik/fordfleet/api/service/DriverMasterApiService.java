package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.DriverMaster;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface DriverMasterApiService {
  
      List<DriverMaster> findAllDriverMaster()
      throws NotFoundException;
  
      DriverMaster updateDriverMaster(DriverMaster driverMaster)
      throws NotFoundException;
  
      DriverMaster addDriverMaster(DriverMaster driverMaster)
      throws NotFoundException;
  
      DriverMaster findByIdDriverMaster(Long id)
      throws NotFoundException;
  
      void deleteDriverMaster(Long id)
      throws NotFoundException;
  
}

