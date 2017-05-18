package com.altimetrik.fordfleet.api.service.impl;

import com.altimetrik.fordfleet.api.service.*;
import com.altimetrik.fordfleet.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.fordfleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.fordfleet.models.Login;


import java.util.List;
import com.altimetrik.fordfleet.exception.NotFoundException;


@Service
@Transactional
public class LoginApiServiceImpl implements LoginApiService {
		  	  
	  @Autowired
	
  	  private LoginRepository  loginRepository ;
	   
  
  
				
			
      @Override
      public List<Login> findAllLogin()
      throws NotFoundException {
      
        
  		
  		
  			return loginRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Login updateLogin(Login login)
      throws NotFoundException {
      
         
        	return loginRepository.save(login);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Login addLogin(Login login)
      throws NotFoundException {
      
         
        	return loginRepository.save(login);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Login findByIdLogin(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return loginRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteLogin(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

