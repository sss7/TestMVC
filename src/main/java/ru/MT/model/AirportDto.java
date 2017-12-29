package ru.MT.model;

/**
 * Created by user on 29.12.2017.
 */
public class AirportDto {
    private String name;
//    private String iata;


    public AirportDto() {
    }

    public AirportDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
