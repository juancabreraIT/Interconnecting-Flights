package com.ryanair.jmcr.service.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Leg implements Serializable {

	private static final long serialVersionUID = -1378577773269353637L;

	private final String departureAirport;
	private final String arrivalAirport;
	private final String departureDateTime;
	private final String arrivalDateTime;
}
