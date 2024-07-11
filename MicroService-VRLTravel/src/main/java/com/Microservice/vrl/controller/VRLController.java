package com.Microservice.vrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Microservice.vrl.model.VRLTravel;
import com.Microservice.vrl.serviceI.vrlServiceI;

@RestController
public class VRLController {
	@Autowired vrlServiceI vs;
	
	@PostMapping("/save")
	public VRLTravel saveBus(@RequestBody VRLTravel v) {
		return vs.saveBus(v);
	}
	

}
