package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.Passenger;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface PassengerApiService {
  
      List<Passenger> findAllPassenger()
      throws NotFoundException;
  
      Passenger updatePassenger(Passenger passenger)
      throws NotFoundException;
  
      Passenger addPassenger(Passenger passenger)
      throws NotFoundException;
  
      Passenger findByIdPassenger(Long id)
      throws NotFoundException;
  
      void deletePassenger(Long id)
      throws NotFoundException;
  
}

