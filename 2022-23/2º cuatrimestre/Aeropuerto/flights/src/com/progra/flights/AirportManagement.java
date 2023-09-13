package com.progra.flights;

import java.io.FileNotFoundException;
import java.util.*;

public class AirportManagement implements Manageable{

    /*
     * IMPORTANTE buscar un mejor tipo de dato para manejar estos datos
     */
    ArrayList<Airport> airports;
    ArrayList<Airline> airlines;
    ArrayList<Route> routes;

    public AirportManagement() {
        airports = new ArrayList<Airport>();
        airlines = new ArrayList<Airline>();
        routes = new ArrayList<Route>();
    }

    private void loadAirports() {

        ReadFile readFile = new ReadFile();
        List<String> listAirports;

        try{
            listAirports = readFile.loadSource("flights-class.txt");

            Airport airport;
            int id;
            String name;
            String iata;
            String icao;
            String city;
            String country;
            Coordinates position;
            double lat, lon;

            for(String line : listAirports){
                System.out.println(line);

                //Buscar una mejor manera de separar la data
                // IMPORTANTE en esta línea al momento de leer la data es posible que haya un error
                String[] lineData = line.split(",");

                /*
                * Controlar si los datos existen o si son el tipo de dato adecuado
                * */
                id = Integer.parseInt(lineData[0]);
                name = lineData[1];
                city = lineData[2];
                country = lineData[3];
                iata = lineData[4].compareTo("\\N") == 0  ? "": lineData[4];
                icao = lineData[5].compareTo("\\N") == 0  ? "": lineData[5];
                lat = lineData[6].compareTo("\\N") == 0  ? 0 : Double.parseDouble(lineData[6]);
                lon = lineData[7].compareTo("\\N") == 0  ? 0 : Double.parseDouble(lineData[7]);
                position = new Coordinates(lat, lon);
                airport = new Airport(id, name, iata, icao, city, country, position);
                this.airports.add(airport);
            }

        }catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }


    /*
    * Implementar la carga de aerolineas
    * */
    private void loadAirlines() {
        ReadFile readFile = new ReadFile();
        List<String> listAirlines;

        try {

            listAirlines = readFile.loadSource("data/airlines.dat");
            int id;
            String name;
            String alias;
            String iata;
            String icao;
            String callsign;
            String country;
            boolean active;

            for (String line : listAirlines) {
                //System.out.println(line);

                String[] lineData = line.split(",");

                id = Integer.parseInt(lineData[0]);
                name = lineData[1];
                alias = lineData[2];
                iata = lineData[3];
                icao = lineData[4];
                callsign = lineData[5];
                country = lineData[6];
                if (lineData[7] == "Y") {
                    active = true;
                } else {
                    if (lineData[7] == "N") {
                        active = false;
                    }

                }
                Airline airline = new Airline();
                airlines.add(airline);
            }

        }

        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
    /*
     * Implementar la carga de rutas
     * */
    private void loadRoutes() {
        ReadFile readFile= new ReadFile();
        List<String> listRoutes;
        try {
            listRoutes= readFile.loadSource("src/data/routes.dat");
            Route routes1;

            int id;
            String airline;
            String source;
            String sourceAirportId;
            String destination;
            String destinationId;
            boolean codeShare;
            String equip;
            int stops;
            for (String line: listRoutes){
                System.out.println(line);
                String [] lineData=line.split(",");
                try {
                    id=Integer.parseInt(lineData[0]);
                }catch (NumberFormatException e){
                    id=0;
                }

                airline= lineData[1];
                source=lineData[2];
                sourceAirportId= lineData[3];;
                destination=lineData[4];
                destinationId=lineData[5];
                codeShare=lineData[6]=="Y"?true:false;
                equip= lineData[7];
                try {
                    stops=Integer.parseInt(lineData[8]);
                }catch (NumberFormatException e){
                    stops=0;

                }catch (ArrayIndexOutOfBoundsException e){
                    stops=0;
                }


                routes1= new Route();
                this.routes.add(routes1);

            }
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }

    public void start(){
        System.out.println("Loading airports...");
        this.loadAirports();
        System.out.println("Loading airlines...");
        this.loadAirlines();
        System.out.println("Loading routes...");
        this.loadRoutes();
    }

    /*
    * code Será el código de la aerolinea
    * */
    @Override
    public List<String> searchByCode(String code) {

      List<String> result= new ArrayList<>();
for (Route route: routes){
    if (String.valueOf(route.id).equalsIgnoreCase(code){
        result.add()
    }
    }

}
}
       }
    }

    /*
     * name Será el nombre de la aerolinea
     *  Retorna un list de String pero puede retornar otro tipo de datos, si es así deben actualizarlo
     * */
    @Override
    public List<String> searchByName(String name) {
        List<String> destiny = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getName().equalsIgnoreCase(name)){
                airline.
            }
        }
    }

    /*
     * country Será el nombre de la ciudad donde esten las aerolineas
     * Retorna un list de String pero puede retornar otro tipo de datos, si es así deben actualizarlo
     * */
    @Override
    public List<Airline> searchByCountry(String country) {

        return null;
    }
}
