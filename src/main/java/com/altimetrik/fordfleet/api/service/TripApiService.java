package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.Trip;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface TripApiService {
  
      List<Trip> findAllTrip()
      throws NotFoundException;
  
      Trip updateTrip(Trip trip)
      throws NotFoundException;
  
      Trip addTrip(Trip trip)
      throws NotFoundException;
  
      Trip findByIdTrip(Long id)
      throws NotFoundException;
  
      void deleteTrip(Long id)
      throws NotFoundException;
  
}

