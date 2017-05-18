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

public class Trip  {
  
  
   
   
  
  private Integer tripEndTime = null;
  
   
   
  
  private String tripEndingAddress = null;
  
   
   
  
  private String tripStatus = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private String passengerId = null;
  
   
   
  
  private String tripDestinationLat = null;
  
   
   
  
  private Integer lastUpdatedDt = null;
  
   
   
  
  private String tripAssignedVehicle = null;
  
   
   
  
  private String tripStartingAddress = null;
  
   
   
  
  private String tripAssignedDriver = null;
  
   
   
  
  private String tripSourceLong = null;
  
   
   
  
  private String tripDestinationLong = null;
  
   
   
  
  private Integer tripTotalDistance = null;
  
   
   
  
  private String tripCost = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private Integer tripStartTime = null;
  
   
   
  
  private String tripSourceLat = null;

  
  /**
   * {}
   **/
  public Integer getTripEndTime() {
    return tripEndTime;
  }
  public void setTripEndTime(Integer tripEndTime) {
    this.tripEndTime = tripEndTime;
  }

  
  /**
   * {}
   **/
  public String getTripEndingAddress() {
    return tripEndingAddress;
  }
  public void setTripEndingAddress(String tripEndingAddress) {
    this.tripEndingAddress = tripEndingAddress;
  }

  
  /**
   * {}
   **/
  public String getTripStatus() {
    return tripStatus;
  }
  public void setTripStatus(String tripStatus) {
    this.tripStatus = tripStatus;
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
  public String getPassengerId() {
    return passengerId;
  }
  public void setPassengerId(String passengerId) {
    this.passengerId = passengerId;
  }

  
  /**
   * {}
   **/
  public String getTripDestinationLat() {
    return tripDestinationLat;
  }
  public void setTripDestinationLat(String tripDestinationLat) {
    this.tripDestinationLat = tripDestinationLat;
  }

  
  /**
   * {}
   **/
  public Integer getLastUpdatedDt() {
    return lastUpdatedDt;
  }
  public void setLastUpdatedDt(Integer lastUpdatedDt) {
    this.lastUpdatedDt = lastUpdatedDt;
  }

  
  /**
   * {}
   **/
  public String getTripAssignedVehicle() {
    return tripAssignedVehicle;
  }
  public void setTripAssignedVehicle(String tripAssignedVehicle) {
    this.tripAssignedVehicle = tripAssignedVehicle;
  }

  
  /**
   * {}
   **/
  public String getTripStartingAddress() {
    return tripStartingAddress;
  }
  public void setTripStartingAddress(String tripStartingAddress) {
    this.tripStartingAddress = tripStartingAddress;
  }

  
  /**
   * {}
   **/
  public String getTripAssignedDriver() {
    return tripAssignedDriver;
  }
  public void setTripAssignedDriver(String tripAssignedDriver) {
    this.tripAssignedDriver = tripAssignedDriver;
  }

  
  /**
   * {}
   **/
  public String getTripSourceLong() {
    return tripSourceLong;
  }
  public void setTripSourceLong(String tripSourceLong) {
    this.tripSourceLong = tripSourceLong;
  }

  
  /**
   * {}
   **/
  public String getTripDestinationLong() {
    return tripDestinationLong;
  }
  public void setTripDestinationLong(String tripDestinationLong) {
    this.tripDestinationLong = tripDestinationLong;
  }

  
  /**
   * {}
   **/
  public Integer getTripTotalDistance() {
    return tripTotalDistance;
  }
  public void setTripTotalDistance(Integer tripTotalDistance) {
    this.tripTotalDistance = tripTotalDistance;
  }

  
  /**
   * {}
   **/
  public String getTripCost() {
    return tripCost;
  }
  public void setTripCost(String tripCost) {
    this.tripCost = tripCost;
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
  public Integer getTripStartTime() {
    return tripStartTime;
  }
  public void setTripStartTime(Integer tripStartTime) {
    this.tripStartTime = tripStartTime;
  }

  
  /**
   * {}
   **/
  public String getTripSourceLat() {
    return tripSourceLat;
  }
  public void setTripSourceLat(String tripSourceLat) {
    this.tripSourceLat = tripSourceLat;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(tripEndTime, trip.tripEndTime) &&
        Objects.equals(tripEndingAddress, trip.tripEndingAddress) &&
        Objects.equals(tripStatus, trip.tripStatus) &&
        Objects.equals(lastUpdatedUserId, trip.lastUpdatedUserId) &&
        Objects.equals(passengerId, trip.passengerId) &&
        Objects.equals(tripDestinationLat, trip.tripDestinationLat) &&
        Objects.equals(lastUpdatedDt, trip.lastUpdatedDt) &&
        Objects.equals(tripAssignedVehicle, trip.tripAssignedVehicle) &&
        Objects.equals(tripStartingAddress, trip.tripStartingAddress) &&
        Objects.equals(tripAssignedDriver, trip.tripAssignedDriver) &&
        Objects.equals(tripSourceLong, trip.tripSourceLong) &&
        Objects.equals(tripDestinationLong, trip.tripDestinationLong) &&
        Objects.equals(tripTotalDistance, trip.tripTotalDistance) &&
        Objects.equals(tripCost, trip.tripCost) &&
        Objects.equals(id, trip.id) &&
        Objects.equals(tripStartTime, trip.tripStartTime) &&
        Objects.equals(tripSourceLat, trip.tripSourceLat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tripEndTime, tripEndingAddress, tripStatus, lastUpdatedUserId, passengerId, tripDestinationLat, lastUpdatedDt, tripAssignedVehicle, tripStartingAddress, tripAssignedDriver, tripSourceLong, tripDestinationLong, tripTotalDistance, tripCost, id, tripStartTime, tripSourceLat);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");
    
    sb.append("  tripEndTime: ").append(tripEndTime).append("\n");
    sb.append("  tripEndingAddress: ").append(tripEndingAddress).append("\n");
    sb.append("  tripStatus: ").append(tripStatus).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  passengerId: ").append(passengerId).append("\n");
    sb.append("  tripDestinationLat: ").append(tripDestinationLat).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  tripAssignedVehicle: ").append(tripAssignedVehicle).append("\n");
    sb.append("  tripStartingAddress: ").append(tripStartingAddress).append("\n");
    sb.append("  tripAssignedDriver: ").append(tripAssignedDriver).append("\n");
    sb.append("  tripSourceLong: ").append(tripSourceLong).append("\n");
    sb.append("  tripDestinationLong: ").append(tripDestinationLong).append("\n");
    sb.append("  tripTotalDistance: ").append(tripTotalDistance).append("\n");
    sb.append("  tripCost: ").append(tripCost).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tripStartTime: ").append(tripStartTime).append("\n");
    sb.append("  tripSourceLat: ").append(tripSourceLat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

