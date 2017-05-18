package com.altimetrik.fordfleet.models.repository;

import com.altimetrik.fordfleet.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DriverBehaviourRepository extends JpaRepository<DriverBehaviour, Long>{

}



