package com.progra.flights;

import java.util.List;

/*
 * Esta interfaz solamente se ha creado con fines ilustrativos
 */
public interface Manageable {
    public void start();
    public List<String> searchByCode(String code);
    public List<String> searchByName(String name);
    public List<Airline> searchByCountry(String country);
}
