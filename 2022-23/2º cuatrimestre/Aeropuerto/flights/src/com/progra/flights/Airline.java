package com.progra.flights;

public class Airline {
    private int id;         //Unique OpenFlights identifier for this airline.
    private String name;    //Name of the airline.
    private String alias;   //Alias of the airline. For example, All Nippon Airways is commonly known as "ANA".
    private String iata;        //2-letter IATA code, if available.
    private String icao;        //3-letter ICAO code, if available.
    private String callsign;    //Airline callsign.
    private String country;     //Country or territory where airport is located. See Countries to cross-reference to
    // ISO 3166-1 codes.
    private boolean active;      //"Y" if the airline is or has until recently been operational, "N" if it is defunct.
    // This field is not reliable: in particular, major airlines that stopped flying long ago, but have not had their
    // IATA code reassigned (eg. Ansett/AN), will incorrectly show as "Y".


    public Airline() {
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
