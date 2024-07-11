package com.Microservice.vrl.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Microservice.vrl.Repository.VRLRepository;
import com.Microservice.vrl.model.VRLTravel;
import com.Microservice.vrl.serviceI.vrlServiceI;
@Service
public class VrlServiceImp implements vrlServiceI{
@Autowired VRLRepository vr;
	@Override
	public VRLTravel saveBus(VRLTravel v) {
		return vr.save(v);
	}

}
