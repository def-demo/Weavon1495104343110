package com.altimetrik.fordfleet.models;


import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class VehicleData  {
  
  
   
   
  
  private String vehicleMake = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private String vehicleClass = null;
  
   
   
  
  private String vehicleDescription = null;
  
   
   
  
  private String vehicleModel = null;
  
   
   
  
  private Integer vehicleMaxTankCapacity = null;
  
   
   
  
  private String vehicleStatus = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String lastUpdatedDt = null;

  
  /**
   * {}
   **/
  public String getVehicleMake() {
    return vehicleMake;
  }
  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  
  /**
   * {}
   **/
  public String getLastUpdatedUserId() {
    return lastUpdatedUserId;
  }
  public void setLastUpdatedUserId(String lastUpdatedUserId) {
    this.lastUpdatedUserId = lastUpdatedUserId;
  }

  
  /**
   * {}
   **/
  public String getVehicleClass() {
    return vehicleClass;
  }
  public void setVehicleClass(String vehicleClass) {
    this.vehicleClass = vehicleClass;
  }

  
  /**
   * {}
   **/
  public String getVehicleDescription() {
    return vehicleDescription;
  }
  public void setVehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
  }

  
  /**
   * {}
   **/
  public String getVehicleModel() {
    return vehicleModel;
  }
  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  
  /**
   * {}
   **/
  public Integer getVehicleMaxTankCapacity() {
    return vehicleMaxTankCapacity;
  }
  public void setVehicleMaxTankCapacity(Integer vehicleMaxTankCapacity) {
    this.vehicleMaxTankCapacity = vehicleMaxTankCapacity;
  }

  
  /**
   * {}
   **/
  public String getVehicleStatus() {
    return vehicleStatus;
  }
  public void setVehicleStatus(String vehicleStatus) {
    this.vehicleStatus = vehicleStatus;
  }

  
  /**
   * {}
   **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getLastUpdatedDt() {
    return lastUpdatedDt;
  }
  public void setLastUpdatedDt(String lastUpdatedDt) {
    this.lastUpdatedDt = lastUpdatedDt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleData vehicleData = (VehicleData) o;
    return Objects.equals(vehicleMake, vehicleData.vehicleMake) &&
        Objects.equals(lastUpdatedUserId, vehicleData.lastUpdatedUserId) &&
        Objects.equals(vehicleClass, vehicleData.vehicleClass) &&
        Objects.equals(vehicleDescription, vehicleData.vehicleDescription) &&
        Objects.equals(vehicleModel, vehicleData.vehicleModel) &&
        Objects.equals(vehicleMaxTankCapacity, vehicleData.vehicleMaxTankCapacity) &&
        Objects.equals(vehicleStatus, vehicleData.vehicleStatus) &&
        Objects.equals(id, vehicleData.id) &&
        Objects.equals(lastUpdatedDt, vehicleData.lastUpdatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleMake, lastUpdatedUserId, vehicleClass, vehicleDescription, vehicleModel, vehicleMaxTankCapacity, vehicleStatus, id, lastUpdatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleData {\n");
    
    sb.append("  vehicleMake: ").append(vehicleMake).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  vehicleClass: ").append(vehicleClass).append("\n");
    sb.append("  vehicleDescription: ").append(vehicleDescription).append("\n");
    sb.append("  vehicleModel: ").append(vehicleModel).append("\n");
    sb.append("  vehicleMaxTankCapacity: ").append(vehicleMaxTankCapacity).append("\n");
    sb.append("  vehicleStatus: ").append(vehicleStatus).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

