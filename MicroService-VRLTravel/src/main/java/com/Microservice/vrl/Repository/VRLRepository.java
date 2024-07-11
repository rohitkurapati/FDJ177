package com.Microservice.vrl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservice.vrl.model.VRLTravel;

public interface VRLRepository extends JpaRepository<VRLTravel, Integer> {

}
