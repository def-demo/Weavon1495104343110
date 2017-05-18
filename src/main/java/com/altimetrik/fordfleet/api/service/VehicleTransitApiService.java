package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.VehicleTransit;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface VehicleTransitApiService {
  
      List<VehicleTransit> findAllVehicleTransit()
      throws NotFoundException;
  
      VehicleTransit updateVehicleTransit(VehicleTransit vehicleTransit)
      throws NotFoundException;
  
      VehicleTransit addVehicleTransit(VehicleTransit vehicleTransit)
      throws NotFoundException;
  
      VehicleTransit findByIdVehicleTransit(Long id)
      throws NotFoundException;
  
      void deleteVehicleTransit(Long id)
      throws NotFoundException;
  
}

