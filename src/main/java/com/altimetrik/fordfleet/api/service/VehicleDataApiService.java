package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.VehicleData;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface VehicleDataApiService {
  
      List<VehicleData> findAllVehicleData()
      throws NotFoundException;
  
      VehicleData updateVehicleData(VehicleData vehicleData)
      throws NotFoundException;
  
      VehicleData addVehicleData(VehicleData vehicleData)
      throws NotFoundException;
  
      VehicleData findByIdVehicleData(Long id)
      throws NotFoundException;
  
      void deleteVehicleData(Long id)
      throws NotFoundException;
  
}

