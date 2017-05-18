package com.altimetrik.fordfleet.models;

import java.util.Date;

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

public class Login  {
  
  
   
   
  
  private String password = null;
  
   
   
  
  private String accountType = null;
  
   
   
  
  private String lastUpdatedUserId = null;
  
   
   
  
  private String id = null;
  
   
   
  
  private Date lastUpdatedDt = null;
  
   
   
  
  private String username = null;

  
  /**
   * {}
   **/
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * {}
   **/
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public Date getLastUpdatedDt() {
    return lastUpdatedDt;
  }
  public void setLastUpdatedDt(Date lastUpdatedDt) {
    this.lastUpdatedDt = lastUpdatedDt;
  }

  
  /**
   * {}
   **/
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(password, login.password) &&
        Objects.equals(accountType, login.accountType) &&
        Objects.equals(lastUpdatedUserId, login.lastUpdatedUserId) &&
        Objects.equals(id, login.id) &&
        Objects.equals(lastUpdatedDt, login.lastUpdatedDt) &&
        Objects.equals(username, login.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, accountType, lastUpdatedUserId, id, lastUpdatedDt, username);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("  accountType: ").append(accountType).append("\n");
    sb.append("  lastUpdatedUserId: ").append(lastUpdatedUserId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastUpdatedDt: ").append(lastUpdatedDt).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

