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

public class Passenger  {
  
  
   
   
  
  private String passengerAddress = null;
  
   
   
  
  private String passengerLastName = null;
  
   
   
  
  private String passengerFirstName = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String passengerMobile = null;
  
   
   
  
  private String passengerType = null;

  
  /**
   * {}
   **/
  public String getPassengerAddress() {
    return passengerAddress;
  }
  public void setPassengerAddress(String passengerAddress) {
    this.passengerAddress = passengerAddress;
  }

  
  /**
   * {}
   **/
  public String getPassengerLastName() {
    return passengerLastName;
  }
  public void setPassengerLastName(String passengerLastName) {
    this.passengerLastName = passengerLastName;
  }

  
  /**
   * {}
   **/
  public String getPassengerFirstName() {
    return passengerFirstName;
  }
  public void setPassengerFirstName(String passengerFirstName) {
    this.passengerFirstName = passengerFirstName;
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
  public String getPassengerMobile() {
    return passengerMobile;
  }
  public void setPassengerMobile(String passengerMobile) {
    this.passengerMobile = passengerMobile;
  }

  
  /**
   * {}
   **/
  public String getPassengerType() {
    return passengerType;
  }
  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passenger passenger = (Passenger) o;
    return Objects.equals(passengerAddress, passenger.passengerAddress) &&
        Objects.equals(passengerLastName, passenger.passengerLastName) &&
        Objects.equals(passengerFirstName, passenger.passengerFirstName) &&
        Objects.equals(id, passenger.id) &&
        Objects.equals(passengerMobile, passenger.passengerMobile) &&
        Objects.equals(passengerType, passenger.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerAddress, passengerLastName, passengerFirstName, id, passengerMobile, passengerType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passenger {\n");
    
    sb.append("  passengerAddress: ").append(passengerAddress).append("\n");
    sb.append("  passengerLastName: ").append(passengerLastName).append("\n");
    sb.append("  passengerFirstName: ").append(passengerFirstName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  passengerMobile: ").append(passengerMobile).append("\n");
    sb.append("  passengerType: ").append(passengerType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

