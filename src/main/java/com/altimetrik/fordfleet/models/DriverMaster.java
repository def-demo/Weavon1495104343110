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

public class DriverMaster  {
  
  
   
   
  
  private String licenseNo = null;
  
   
   
  
  private String driverAddress = null;
  
   
   
  
  private String driverLastName = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private String driverSsn = null;
  
   
   
  
  private String driverMobile = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String lastUpdatedDt = null;
  
   
   
  
  private String driverFirstName = null;
  
   
   
  
  private String driverEmailId = null;

  
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
  public String getDriverSsn() {
    return driverSsn;
  }
  public void setDriverSsn(String driverSsn) {
    this.driverSsn = driverSsn;
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

  
  /**
   * {}
   **/
  public String getDriverEmailId() {
    return driverEmailId;
  }
  public void setDriverEmailId(String driverEmailId) {
    this.driverEmailId = driverEmailId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverMaster driverMaster = (DriverMaster) o;
    return Objects.equals(licenseNo, driverMaster.licenseNo) &&
        Objects.equals(driverAddress, driverMaster.driverAddress) &&
        Objects.equals(driverLastName, driverMaster.driverLastName) &&
        Objects.equals(lastUpdatedUserId, driverMaster.lastUpdatedUserId) &&
        Objects.equals(driverSsn, driverMaster.driverSsn) &&
        Objects.equals(driverMobile, driverMaster.driverMobile) &&
        Objects.equals(id, driverMaster.id) &&
        Objects.equals(lastUpdatedDt, driverMaster.lastUpdatedDt) &&
        Objects.equals(driverFirstName, driverMaster.driverFirstName) &&
        Objects.equals(driverEmailId, driverMaster.driverEmailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseNo, driverAddress, driverLastName, lastUpdatedUserId, driverSsn, driverMobile, id, lastUpdatedDt, driverFirstName, driverEmailId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverMaster {\n");
    
    sb.append("  licenseNo: ").append(licenseNo).append("\n");
    sb.append("  driverAddress: ").append(driverAddress).append("\n");
    sb.append("  driverLastName: ").append(driverLastName).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  driverSsn: ").append(driverSsn).append("\n");
    sb.append("  driverMobile: ").append(driverMobile).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  driverFirstName: ").append(driverFirstName).append("\n");
    sb.append("  driverEmailId: ").append(driverEmailId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

