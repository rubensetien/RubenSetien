package com.progra.flights;

public class Airline {
	private int id; // Unique OpenFlights identifier for this airline.
	private String name; // Name of the airline.
	private String alias; // Alias of the airline. For example, All Nippon Airways is commonly known as
							// "ANA".
	private String iata; // 2-letter IATA code, if available.
	private String icao; // 3-letter ICAO code, if available.
	private String callsign; // Airline callsign.
	private String country; // Country or territory where airport is located. See Countries to
							// cross-reference to
	// ISO 3166-1 codes.
	private boolean active; // "Y" if the airline is or has until recently been operational, "N" if it is
							// defunct.
	// This field is not reliable: in particular, major airlines that stopped flying
	// long ago, but have not had their
	// IATA code reassigned (eg. Ansett/AN), will incorrectly show as "Y".

	public Airline(String datos) {
		String informacion[] = datos.split(",");
		this.id = Integer.parseInt(informacion[0]);
		this.name = informacion[1];
		this.alias = informacion[2];
		this.iata = informacion[3];
		this.icao = informacion[4];
		this.callsign = informacion[5];
		this.country = informacion[6];
		if (informacion[7] == "Y") {
			this.active = true;
		} else {
			if (informacion[7] == "N") {
				this.active = false;
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
