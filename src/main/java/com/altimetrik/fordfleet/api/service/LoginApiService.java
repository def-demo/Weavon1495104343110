package com.altimetrik.fordfleet.api.service;

import com.altimetrik.fordfleet.models.Login;


import com.altimetrik.fordfleet.exception.NotFoundException;
import java.util.List;

public interface LoginApiService {
  
      List<Login> findAllLogin()
      throws NotFoundException;
  
      Login updateLogin(Login login)
      throws NotFoundException;
  
      Login addLogin(Login login)
      throws NotFoundException;
  
      Login findByIdLogin(Long id)
      throws NotFoundException;
  
      void deleteLogin(Long id)
      throws NotFoundException;
  
}

