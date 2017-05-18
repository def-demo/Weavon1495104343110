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

public class DriverBehaviour  {
  
  
   
   
  
  private String driverId = null;
  
   
   
  
  private String tripId = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private String driveTimeWithoutBreaks = null;
  
   
   
  
  private String overSpeeding = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String lastUpdatedDt = null;
  
   
   
  
  private String vehicleId = null;
  
   
   
  
  private String excessiveBraking = null;
  
   
   
  
  private String excessiveAcceleration = null;
  
   
   
  
  private String safeDriverStatus = null;

  
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
  public String getTripId() {
    return tripId;
  }
  public void setTripId(String tripId) {
    this.tripId = tripId;
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
  public String getDriveTimeWithoutBreaks() {
    return driveTimeWithoutBreaks;
  }
  public void setDriveTimeWithoutBreaks(String driveTimeWithoutBreaks) {
    this.driveTimeWithoutBreaks = driveTimeWithoutBreaks;
  }

  
  /**
   * {}
   **/
  public String getOverSpeeding() {
    return overSpeeding;
  }
  public void setOverSpeeding(String overSpeeding) {
    this.overSpeeding = overSpeeding;
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

  
  /**
   * {}
   **/
  public String getExcessiveBraking() {
    return excessiveBraking;
  }
  public void setExcessiveBraking(String excessiveBraking) {
    this.excessiveBraking = excessiveBraking;
  }

  
  /**
   * {}
   **/
  public String getExcessiveAcceleration() {
    return excessiveAcceleration;
  }
  public void setExcessiveAcceleration(String excessiveAcceleration) {
    this.excessiveAcceleration = excessiveAcceleration;
  }

  
  /**
   * {}
   **/
  public String getSafeDriverStatus() {
    return safeDriverStatus;
  }
  public void setSafeDriverStatus(String safeDriverStatus) {
    this.safeDriverStatus = safeDriverStatus;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverBehaviour driverBehaviour = (DriverBehaviour) o;
    return Objects.equals(driverId, driverBehaviour.driverId) &&
        Objects.equals(tripId, driverBehaviour.tripId) &&
        Objects.equals(lastUpdatedUserId, driverBehaviour.lastUpdatedUserId) &&
        Objects.equals(driveTimeWithoutBreaks, driverBehaviour.driveTimeWithoutBreaks) &&
        Objects.equals(overSpeeding, driverBehaviour.overSpeeding) &&
        Objects.equals(id, driverBehaviour.id) &&
        Objects.equals(lastUpdatedDt, driverBehaviour.lastUpdatedDt) &&
        Objects.equals(vehicleId, driverBehaviour.vehicleId) &&
        Objects.equals(excessiveBraking, driverBehaviour.excessiveBraking) &&
        Objects.equals(excessiveAcceleration, driverBehaviour.excessiveAcceleration) &&
        Objects.equals(safeDriverStatus, driverBehaviour.safeDriverStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, tripId, lastUpdatedUserId, driveTimeWithoutBreaks, overSpeeding, id, lastUpdatedDt, vehicleId, excessiveBraking, excessiveAcceleration, safeDriverStatus);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverBehaviour {\n");
    
    sb.append("  driverId: ").append(driverId).append("\n");
    sb.append("  tripId: ").append(tripId).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  driveTimeWithoutBreaks: ").append(driveTimeWithoutBreaks).append("\n");
    sb.append("  overSpeeding: ").append(overSpeeding).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  excessiveBraking: ").append(excessiveBraking).append("\n");
    sb.append("  excessiveAcceleration: ").append(excessiveAcceleration).append("\n");
    sb.append("  safeDriverStatus: ").append(safeDriverStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

