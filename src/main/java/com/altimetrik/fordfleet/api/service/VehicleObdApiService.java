package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.VehicleObd;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface VehicleObdApiService {
  
      List<VehicleObd> findAllVehicleObd()
      throws NotFoundException;
  
      VehicleObd updateVehicleObd(VehicleObd vehicleObd)
      throws NotFoundException;
  
      VehicleObd addVehicleObd(VehicleObd vehicleObd)
      throws NotFoundException;
  
      VehicleObd findByIdVehicleObd(Long id)
      throws NotFoundException;
  
      void deleteVehicleObd(Long id)
      throws NotFoundException;
  
}

