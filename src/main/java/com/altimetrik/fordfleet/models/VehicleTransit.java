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

public class VehicleTransit  {
  
  
   
   
  
  private String currentSpeed = null;
  
   
   
  
  private String tripId = null;
  
   
   
  
  private String driverId = null;
  
   
   
  
  private String currentLat = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private Integer currentTimestamp = null;
  
   
   
  
  private String passengerId = null;
  
   
   
  
  private String currentLong = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String lastUpdatedDt = null;
  
   
   
  
  private String vehicleId = null;

  
  /**
   * {}
   **/
  public String getCurrentSpeed() {
    return currentSpeed;
  }
  public void setCurrentSpeed(String currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  
  /**
   * {}
   **/
  public String getTripId() {
    return tripId;
  }
  public void setTripId(String tripId) {
    this.tripId = tripId;
  }

  
  /**
   * {}
   **/
  public String getDriverId() {
    return driverId;
  }
  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  
  /**
   * {}
   **/
  public String getCurrentLat() {
    return currentLat;
  }
  public void setCurrentLat(String currentLat) {
    this.currentLat = currentLat;
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
  public Integer getCurrentTimestamp() {
    return currentTimestamp;
  }
  public void setCurrentTimestamp(Integer currentTimestamp) {
    this.currentTimestamp = currentTimestamp;
  }

  
  /**
   * {}
   **/
  public String getPassengerId() {
    return passengerId;
  }
  public void setPassengerId(String passengerId) {
    this.passengerId = passengerId;
  }

  
  /**
   * {}
   **/
  public String getCurrentLong() {
    return currentLong;
  }
  public void setCurrentLong(String currentLong) {
    this.currentLong = currentLong;
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
  public String getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTransit vehicleTransit = (VehicleTransit) o;
    return Objects.equals(currentSpeed, vehicleTransit.currentSpeed) &&
        Objects.equals(tripId, vehicleTransit.tripId) &&
        Objects.equals(driverId, vehicleTransit.driverId) &&
        Objects.equals(currentLat, vehicleTransit.currentLat) &&
        Objects.equals(lastUpdatedUserId, vehicleTransit.lastUpdatedUserId) &&
        Objects.equals(currentTimestamp, vehicleTransit.currentTimestamp) &&
        Objects.equals(passengerId, vehicleTransit.passengerId) &&
        Objects.equals(currentLong, vehicleTransit.currentLong) &&
        Objects.equals(id, vehicleTransit.id) &&
        Objects.equals(lastUpdatedDt, vehicleTransit.lastUpdatedDt) &&
        Objects.equals(vehicleId, vehicleTransit.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSpeed, tripId, driverId, currentLat, lastUpdatedUserId, currentTimestamp, passengerId, currentLong, id, lastUpdatedDt, vehicleId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTransit {\n");
    
    sb.append("  currentSpeed: ").append(currentSpeed).append("\n");
    sb.append("  tripId: ").append(tripId).append("\n");
    sb.append("  driverId: ").append(driverId).append("\n");
    sb.append("  currentLat: ").append(currentLat).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  currentTimestamp: ").append(currentTimestamp).append("\n");
    sb.append("  passengerId: ").append(passengerId).append("\n");
    sb.append("  currentLong: ").append(currentLong).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

