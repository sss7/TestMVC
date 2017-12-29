package ru.MT.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import ru.MT.model.AirportDto;
import ru.MT.model.Language;
import ru.MT.service.AirportService;
import ru.MT.webservices.Airport;
import ru.MT.webservices.OnlineTimeTableSoap;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 29.12.2017.
 */
//@Service
public class AirportServiceImpl implements AirportService {

    @Resource(name = "OnlineTimeTableSoap")
    OnlineTimeTableSoap service;

    public static void main(String[] args) {
//        System.out.println("qqqqqqqqqqqqqqqq");
        AirportServiceImpl airportService = new AirportServiceImpl();
//        System.out.println(airportService.getAirports("ru").get(0).getName());
        System.out.println(airportService.service);
        System.out.println(airportService.service.getAirportsList("ru"));
        System.out.println(airportService.service.getAirportsList("ru").getAirport());
        System.out.println(airportService.service.getAirportsList("ru").getAirport().get(0));
        System.out.println(airportService.service.getAirportsList("ru").getAirport().get(0).getName());
    }

    public List<AirportDto> getAirports(String lang) {
        final List<AirportDto> result = new ArrayList<>();
        //CollectionUtils.isEmpty()
        List<Airport> list = service.getAirportsList(lang).getAirport();
        if (!CollectionUtils.isEmpty(list))
            list.forEach(a -> result.add(new AirportDto(a.getName())));
        return result;
    }
}
