package com.altimetrik.fordfleet.models.repository;

import com.altimetrik.fordfleet.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{

}



