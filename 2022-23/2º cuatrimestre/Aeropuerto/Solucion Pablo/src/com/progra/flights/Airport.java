package com.progra.flights;

public class Airport {
	// Unique OpenFlights identifier for this airport.
	private int id;
	// Name of airport. May or may not contain the City name.
	private String name;
	private String iata;
	private String icao;
	// Main city served by airport. May be spelled differently from Name.
	private String city;
	// Country or territory where airport is located. See Countries to
	// cross-reference to ISO 3166-1 codes.
	private String country;
	private Coordinates position;

	public Airport(int id, String name, String iata, String icao, String city, String country, Coordinates position) {
		this.id = id;
		this.name = name;
		this.iata = iata;
		this.icao = icao;
		this.city = city;
		this.country = country;
		this.position = position;
	}

	public Airport() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Coordinates getPosition() {
		return position;
	}

	public void setPosition(Coordinates position) {
		this.position = position;
	}
}
