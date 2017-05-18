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

public class VehicleObd  {
  
  
   
   
  
  private String driverId = null;
  
   
   
  
  private String fuelLevel = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private Integer engineSpeedRpm = null;
  
   
   
  
  private String highBeam = null;
  
   
   
  
  private String latitude = null;
  
   
   
  
  private String vehicleSpeed = null;
  
   
   
  
  private String ignitionStatus = null;
  
   
   
  
  private Integer fuelTankCapacity = null;
  
   
   
  
  private String currentFeulLevel = null;
  
   
   
  
  private String windshieldWiper = null;
  
   
   
  
  private String steeringWheel = null;
  
   
   
  
  private String tirePressure = null;
  
   
   
  
  private String vehicleId = null;
  
   
   
  
  private Integer fuelTankMinimumThreshold = null;
  
   
   
  
  private String longitude = null;
  
   
   
  
  private String fuelValue = null;
  
   
   
  
  private String odometer = null;
  
   
   
  
  private String steeringAngle = null;
  
   
   
  
  private String headLamp = null;
  
   
   
  
  private String lastUpdatedDt = null;
  
   
   
  
  private String acceleratorPedal = null;
  
   
   
  
  private String parkingBrake = null;
  
   
   
  
  private Integer sleepHours = null;
  
   
   
  
  private String transmissionTorque = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private String brakePedal = null;
  
   
   
  
  private String transmissionGear = null;

  
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
  public String getFuelLevel() {
    return fuelLevel;
  }
  public void setFuelLevel(String fuelLevel) {
    this.fuelLevel = fuelLevel;
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
  public Integer getEngineSpeedRpm() {
    return engineSpeedRpm;
  }
  public void setEngineSpeedRpm(Integer engineSpeedRpm) {
    this.engineSpeedRpm = engineSpeedRpm;
  }

  
  /**
   * {}
   **/
  public String getHighBeam() {
    return highBeam;
  }
  public void setHighBeam(String highBeam) {
    this.highBeam = highBeam;
  }

  
  /**
   * {}
   **/
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * {}
   **/
  public String getVehicleSpeed() {
    return vehicleSpeed;
  }
  public void setVehicleSpeed(String vehicleSpeed) {
    this.vehicleSpeed = vehicleSpeed;
  }

  
  /**
   * {}
   **/
  public String getIgnitionStatus() {
    return ignitionStatus;
  }
  public void setIgnitionStatus(String ignitionStatus) {
    this.ignitionStatus = ignitionStatus;
  }

  
  /**
   * {}
   **/
  public Integer getFuelTankCapacity() {
    return fuelTankCapacity;
  }
  public void setFuelTankCapacity(Integer fuelTankCapacity) {
    this.fuelTankCapacity = fuelTankCapacity;
  }

  
  /**
   * {}
   **/
  public String getCurrentFeulLevel() {
    return currentFeulLevel;
  }
  public void setCurrentFeulLevel(String currentFeulLevel) {
    this.currentFeulLevel = currentFeulLevel;
  }

  
  /**
   * {}
   **/
  public String getWindshieldWiper() {
    return windshieldWiper;
  }
  public void setWindshieldWiper(String windshieldWiper) {
    this.windshieldWiper = windshieldWiper;
  }

  
  /**
   * {}
   **/
  public String getSteeringWheel() {
    return steeringWheel;
  }
  public void setSteeringWheel(String steeringWheel) {
    this.steeringWheel = steeringWheel;
  }

  
  /**
   * {}
   **/
  public String getTirePressure() {
    return tirePressure;
  }
  public void setTirePressure(String tirePressure) {
    this.tirePressure = tirePressure;
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
  public Integer getFuelTankMinimumThreshold() {
    return fuelTankMinimumThreshold;
  }
  public void setFuelTankMinimumThreshold(Integer fuelTankMinimumThreshold) {
    this.fuelTankMinimumThreshold = fuelTankMinimumThreshold;
  }

  
  /**
   * {}
   **/
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * {}
   **/
  public String getFuelValue() {
    return fuelValue;
  }
  public void setFuelValue(String fuelValue) {
    this.fuelValue = fuelValue;
  }

  
  /**
   * {}
   **/
  public String getOdometer() {
    return odometer;
  }
  public void setOdometer(String odometer) {
    this.odometer = odometer;
  }

  
  /**
   * {}
   **/
  public String getSteeringAngle() {
    return steeringAngle;
  }
  public void setSteeringAngle(String steeringAngle) {
    this.steeringAngle = steeringAngle;
  }

  
  /**
   * {}
   **/
  public String getHeadLamp() {
    return headLamp;
  }
  public void setHeadLamp(String headLamp) {
    this.headLamp = headLamp;
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
  public String getAcceleratorPedal() {
    return acceleratorPedal;
  }
  public void setAcceleratorPedal(String acceleratorPedal) {
    this.acceleratorPedal = acceleratorPedal;
  }

  
  /**
   * {}
   **/
  public String getParkingBrake() {
    return parkingBrake;
  }
  public void setParkingBrake(String parkingBrake) {
    this.parkingBrake = parkingBrake;
  }

  
  /**
   * {}
   **/
  public Integer getSleepHours() {
    return sleepHours;
  }
  public void setSleepHours(Integer sleepHours) {
    this.sleepHours = sleepHours;
  }

  
  /**
   * {}
   **/
  public String getTransmissionTorque() {
    return transmissionTorque;
  }
  public void setTransmissionTorque(String transmissionTorque) {
    this.transmissionTorque = transmissionTorque;
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
  public String getBrakePedal() {
    return brakePedal;
  }
  public void setBrakePedal(String brakePedal) {
    this.brakePedal = brakePedal;
  }

  
  /**
   * {}
   **/
  public String getTransmissionGear() {
    return transmissionGear;
  }
  public void setTransmissionGear(String transmissionGear) {
    this.transmissionGear = transmissionGear;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleObd vehicleObd = (VehicleObd) o;
    return Objects.equals(driverId, vehicleObd.driverId) &&
        Objects.equals(fuelLevel, vehicleObd.fuelLevel) &&
        Objects.equals(lastUpdatedUserId, vehicleObd.lastUpdatedUserId) &&
        Objects.equals(engineSpeedRpm, vehicleObd.engineSpeedRpm) &&
        Objects.equals(highBeam, vehicleObd.highBeam) &&
        Objects.equals(latitude, vehicleObd.latitude) &&
        Objects.equals(vehicleSpeed, vehicleObd.vehicleSpeed) &&
        Objects.equals(ignitionStatus, vehicleObd.ignitionStatus) &&
        Objects.equals(fuelTankCapacity, vehicleObd.fuelTankCapacity) &&
        Objects.equals(currentFeulLevel, vehicleObd.currentFeulLevel) &&
        Objects.equals(windshieldWiper, vehicleObd.windshieldWiper) &&
        Objects.equals(steeringWheel, vehicleObd.steeringWheel) &&
        Objects.equals(tirePressure, vehicleObd.tirePressure) &&
        Objects.equals(vehicleId, vehicleObd.vehicleId) &&
        Objects.equals(fuelTankMinimumThreshold, vehicleObd.fuelTankMinimumThreshold) &&
        Objects.equals(longitude, vehicleObd.longitude) &&
        Objects.equals(fuelValue, vehicleObd.fuelValue) &&
        Objects.equals(odometer, vehicleObd.odometer) &&
        Objects.equals(steeringAngle, vehicleObd.steeringAngle) &&
        Objects.equals(headLamp, vehicleObd.headLamp) &&
        Objects.equals(lastUpdatedDt, vehicleObd.lastUpdatedDt) &&
        Objects.equals(acceleratorPedal, vehicleObd.acceleratorPedal) &&
        Objects.equals(parkingBrake, vehicleObd.parkingBrake) &&
        Objects.equals(sleepHours, vehicleObd.sleepHours) &&
        Objects.equals(transmissionTorque, vehicleObd.transmissionTorque) &&
        Objects.equals(id, vehicleObd.id) &&
        Objects.equals(brakePedal, vehicleObd.brakePedal) &&
        Objects.equals(transmissionGear, vehicleObd.transmissionGear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, fuelLevel, lastUpdatedUserId, engineSpeedRpm, highBeam, latitude, vehicleSpeed, ignitionStatus, fuelTankCapacity, currentFeulLevel, windshieldWiper, steeringWheel, tirePressure, vehicleId, fuelTankMinimumThreshold, longitude, fuelValue, odometer, steeringAngle, headLamp, lastUpdatedDt, acceleratorPedal, parkingBrake, sleepHours, transmissionTorque, id, brakePedal, transmissionGear);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleObd {\n");
    
    sb.append("  driverId: ").append(driverId).append("\n");
    sb.append("  fuelLevel: ").append(fuelLevel).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  engineSpeedRpm: ").append(engineSpeedRpm).append("\n");
    sb.append("  highBeam: ").append(highBeam).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  vehicleSpeed: ").append(vehicleSpeed).append("\n");
    sb.append("  ignitionStatus: ").append(ignitionStatus).append("\n");
    sb.append("  fuelTankCapacity: ").append(fuelTankCapacity).append("\n");
    sb.append("  currentFeulLevel: ").append(currentFeulLevel).append("\n");
    sb.append("  windshieldWiper: ").append(windshieldWiper).append("\n");
    sb.append("  steeringWheel: ").append(steeringWheel).append("\n");
    sb.append("  tirePressure: ").append(tirePressure).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  fuelTankMinimumThreshold: ").append(fuelTankMinimumThreshold).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  fuelValue: ").append(fuelValue).append("\n");
    sb.append("  odometer: ").append(odometer).append("\n");
    sb.append("  steeringAngle: ").append(steeringAngle).append("\n");
    sb.append("  headLamp: ").append(headLamp).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  acceleratorPedal: ").append(acceleratorPedal).append("\n");
    sb.append("  parkingBrake: ").append(parkingBrake).append("\n");
    sb.append("  sleepHours: ").append(sleepHours).append("\n");
    sb.append("  transmissionTorque: ").append(transmissionTorque).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  brakePedal: ").append(brakePedal).append("\n");
    sb.append("  transmissionGear: ").append(transmissionGear).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

