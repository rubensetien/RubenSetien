package com.progra.flights;
import java.util.List;
import java.util.Scanner;

import com.progra.flights.AirportManagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("== WELCOME TO AIRPORT MANAGEMENT 3000              ==");
        System.out.println("=====================================================");


        AirportManagement airportManagement = new AirportManagement();
        airportManagement.start();


        Scanner sc = new Scanner(System.in);
        /*
        Pedir al usuario el nombre de un país
        * */
        System.out.println("Nombre pais (ej: \"spain\")");
        String country = sc.nextLine();
        

        List <String> lista = airportManagement.searchByCountry( country );
        
        /*
        Imprimir resultados
        * */
        for(String aerolinea : lista) {
        	System.out.println(aerolinea);
        }

         /*
        Pedir al usuario el nombre de una aerolinea
        * */
        System.out.println("Nombre aerolinia (ej:\"Iberia Airlines\" )");
        String nombreAerolinea = sc.nextLine();
        List<String> datos=airportManagement.searchByName(nombreAerolinea);
        
        /*
        Imprimir resultados
        * */
       
        
        for(String destino : datos) {
        	System.out.println(destino);
        }

         /*
        Pedir al usuario el codigo de una aerolinea
        * */
        System.out.println("Codigo aerolinia (ej:410 )");
        String codigoAerolinea = sc.nextLine();
        datos=airportManagement.searchByCode(codigoAerolinea);

       // airportManagement.searchByName( airlineCode );

        /*
        Imprimir resultados
        * */
        System.out.println("destinos");
        for(String destino : datos) {
        	System.out.print(destino+"  ");
        }
    }
}