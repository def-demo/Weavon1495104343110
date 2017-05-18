package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.VehicleFare;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface VehicleFareApiService {
  
      List<VehicleFare> findAllVehicleFare()
      throws NotFoundException;
  
      VehicleFare updateVehicleFare(VehicleFare vehicleFare)
      throws NotFoundException;
  
      VehicleFare addVehicleFare(VehicleFare vehicleFare)
      throws NotFoundException;
  
      VehicleFare findByIdVehicleFare(Long id)
      throws NotFoundException;
  
      void deleteVehicleFare(Long id)
      throws NotFoundException;
  
}

