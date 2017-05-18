package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.Driver;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface DriverApiService {
  
      List<Driver> findAllDriver()
      throws NotFoundException;
  
      Driver updateDriver(Driver driver)
      throws NotFoundException;
  
      Driver addDriver(Driver driver)
      throws NotFoundException;
  
      Driver findByIdDriver(Long id)
      throws NotFoundException;
  
      void deleteDriver(Long id)
      throws NotFoundException;
  
}

