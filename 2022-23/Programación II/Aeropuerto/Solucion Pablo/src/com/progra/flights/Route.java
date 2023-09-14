package com.progra.flights;

public class Route {
	String id; // Unique OpenFlights identifier for airline (see Airline).
	String airline; // 2-letter (IATA) or 3-letter (ICAO) code of the airline.
	String Source; // airport 3-letter (IATA) or 4-letter (ICAO) code of the source airport.
	String SourceAirportID; // Unique OpenFlights identifier for source airport (see Airport)
	String DestinationAirport; // 3-letter (IATA) or 4-letter (ICAO) code of the destination airport.
	String DestinationAirportID; // Unique OpenFlights identifier for destination airport (see Airport)
	boolean Codeshare; // "Y" if this flight is a codeshare (that is, not operated by Airline, but
						// another carrier), empty otherwise.
	int Stops; // Number of stops on this flight ("0" for direct)
	String Equipment; // 3-letter codes for plane type(s) generally used on this flight, separated by
						// spaces

	public Route(String datos) {
		String informacion[] = datos.split(",");
		this.id = informacion[0];
		this.airline = informacion[1];
		this.Source = informacion[2];
		this.SourceAirportID = informacion[3];
		this.DestinationAirport = informacion[4];
		this.DestinationAirportID = informacion[5];
		if (informacion[6] == "Y") {
			this.Codeshare = true;
		} else {
			if (informacion[6] == "N") {
				this.Codeshare = false;
			}
		}
		this.Stops = Integer.parseInt(informacion[7]);
	//	this.Equipment = informacion[8];
	}
	
	public String getID() {
		return this.id;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDestinationAirport() {
		return DestinationAirport;
	}
	public String getDestinationAirportID() {
		return DestinationAirportID;
	}

	public void setDestinationAirport(String destinationAirport) {
		DestinationAirport = destinationAirport;
	}

}
