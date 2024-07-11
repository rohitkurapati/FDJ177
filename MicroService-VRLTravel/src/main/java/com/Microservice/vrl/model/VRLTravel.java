package com.Microservice.vrl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class VRLTravel {
	@Id
	private int busId;
	private String busName;
	private String journeyDate;
	private String journeyTime;
	private float price;
	private String source;
	private String destination;
	

}
