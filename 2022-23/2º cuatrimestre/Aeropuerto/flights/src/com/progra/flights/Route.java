package com.progra.flights;

public class Route {
    int id;                         //Unique OpenFlights identifier for airline (see Airline).
    String airline;                 //2-letter (IATA) or 3-letter (ICAO) code of the airline.
    String Source;                  //airport	3-letter (IATA) or 4-letter (ICAO) code of the source airport.
    String SourceAirportID;         //Unique OpenFlights identifier for source airport (see Airport)
    String DestinationAirport;      //3-letter (IATA) or 4-letter (ICAO) code of the destination airport.
    String DestinationAirportID;    //Unique OpenFlights identifier for destination airport (see Airport)
    boolean Codeshare;              //"Y" if this flight is a codeshare (that is, not operated by Airline, but another carrier), empty otherwise.
    int Stops;                      //Number of stops on this flight ("0" for direct)
    String Equipment;               //3-letter codes for plane type(s) generally used on this flight, separated by spaces
}
