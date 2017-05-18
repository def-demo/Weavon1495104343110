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

public class Driver  {
  
  
   
   
  
  private String licenseNo = null;
  
   
   
  
  private String driverAddress = null;
  
   
   
  
  private String driverLastName = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private Integer driverSsn = null;
  
   
   
  
  private String driverEmail = null;
  
   
   
  
  private String driverMobile = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String lastUpdatedDt = null;
  
   
   
  
  private String driverFirstName = null;

  
  /**
   * {}
   **/
  public String getLicenseNo() {
    return licenseNo;
  }
  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }

  
  /**
   * {}
   **/
  public String getDriverAddress() {
    return driverAddress;
  }
  public void setDriverAddress(String driverAddress) {
    this.driverAddress = driverAddress;
  }

  
  /**
   * {}
   **/
  public String getDriverLastName() {
    return driverLastName;
  }
  public void setDriverLastName(String driverLastName) {
    this.driverLastName = driverLastName;
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
  public Integer getDriverSsn() {
    return driverSsn;
  }
  public void setDriverSsn(Integer driverSsn) {
    this.driverSsn = driverSsn;
  }

  
  /**
   * {}
   **/
  public String getDriverEmail() {
    return driverEmail;
  }
  public void setDriverEmail(String driverEmail) {
    this.driverEmail = driverEmail;
  }

  
  /**
   * {}
   **/
  public String getDriverMobile() {
    return driverMobile;
  }
  public void setDriverMobile(String driverMobile) {
    this.driverMobile = driverMobile;
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
  public String getDriverFirstName() {
    return driverFirstName;
  }
  public void setDriverFirstName(String driverFirstName) {
    this.driverFirstName = driverFirstName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(licenseNo, driver.licenseNo) &&
        Objects.equals(driverAddress, driver.driverAddress) &&
        Objects.equals(driverLastName, driver.driverLastName) &&
        Objects.equals(lastUpdatedUserId, driver.lastUpdatedUserId) &&
        Objects.equals(driverSsn, driver.driverSsn) &&
        Objects.equals(driverEmail, driver.driverEmail) &&
        Objects.equals(driverMobile, driver.driverMobile) &&
        Objects.equals(id, driver.id) &&
        Objects.equals(lastUpdatedDt, driver.lastUpdatedDt) &&
        Objects.equals(driverFirstName, driver.driverFirstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseNo, driverAddress, driverLastName, lastUpdatedUserId, driverSsn, driverEmail, driverMobile, id, lastUpdatedDt, driverFirstName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
    
    sb.append("  licenseNo: ").append(licenseNo).append("\n");
    sb.append("  driverAddress: ").append(driverAddress).append("\n");
    sb.append("  driverLastName: ").append(driverLastName).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  driverSsn: ").append(driverSsn).append("\n");
    sb.append("  driverEmail: ").append(driverEmail).append("\n");
    sb.append("  driverMobile: ").append(driverMobile).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  driverFirstName: ").append(driverFirstName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

