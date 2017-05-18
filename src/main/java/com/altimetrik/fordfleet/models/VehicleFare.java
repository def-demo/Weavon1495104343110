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

public class VehicleFare  {
  
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private String vehicleClass = null;
  
   
   
  
  private Integer vehicleBaseFare = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String lastUpdatedDt = null;
  
   
   
  
  private String vehicleFarePerMile = null;

  
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
  public Integer getVehicleBaseFare() {
    return vehicleBaseFare;
  }
  public void setVehicleBaseFare(Integer vehicleBaseFare) {
    this.vehicleBaseFare = vehicleBaseFare;
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

  
  /**
   * {}
   **/
  public String getVehicleFarePerMile() {
    return vehicleFarePerMile;
  }
  public void setVehicleFarePerMile(String vehicleFarePerMile) {
    this.vehicleFarePerMile = vehicleFarePerMile;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleFare vehicleFare = (VehicleFare) o;
    return Objects.equals(lastUpdatedUserId, vehicleFare.lastUpdatedUserId) &&
        Objects.equals(vehicleClass, vehicleFare.vehicleClass) &&
        Objects.equals(vehicleBaseFare, vehicleFare.vehicleBaseFare) &&
        Objects.equals(id, vehicleFare.id) &&
        Objects.equals(lastUpdatedDt, vehicleFare.lastUpdatedDt) &&
        Objects.equals(vehicleFarePerMile, vehicleFare.vehicleFarePerMile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdatedUserId, vehicleClass, vehicleBaseFare, id, lastUpdatedDt, vehicleFarePerMile);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleFare {\n");
    
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  vehicleClass: ").append(vehicleClass).append("\n");
    sb.append("  vehicleBaseFare: ").append(vehicleBaseFare).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  vehicleFarePerMile: ").append(vehicleFarePerMile).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

