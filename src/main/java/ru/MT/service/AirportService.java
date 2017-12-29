package ru.MT.service;

import ru.MT.model.AirportDto;
import ru.MT.model.Language;

import java.util.List;

/**
 * Created by user on 29.12.2017.
 */
public interface AirportService {
    List<AirportDto> getAirports(String lang);
}
