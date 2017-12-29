package ru.MT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.MT.model.AirportDto;
import ru.MT.model.Language;
import ru.MT.service.impl.AirportServiceImpl;
import ru.MT.webservices.Airport;
import ru.MT.webservices.OnlineTimeTableSoap;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26.12.2017.
 */
@Controller
//@RequestMapping(value = "/new")
public class NewController {
//    @Autowired

//    @Resource
    AirportServiceImpl airportService;

    @RequestMapping(value = "/lang", method = RequestMethod.GET)
    public ModelAndView showLangForm() {
        return new ModelAndView("lang","command", new Language());
    }

    @RequestMapping(value = "/airports", method = RequestMethod.POST)
    public String showAirports(@ModelAttribute("lang") Language lang,
                               @ModelAttribute("airport") Airport airport,
                               ModelMap model) {

        model.addAttribute("lang", lang.getLang());
//        model.addAttribute("name", service.getAirportsList(lang.getLang()).getAirport().get(0).getName());
//        model.addAttribute("IATA", service.getAirportsList(lang.getLang()).getAirport().get(0).getIATA());
//        AirportServiceImpl airportService = null;
//        final List<Airport> list =
        final List<AirportDto> list = airportService.getAirports(lang.getLang());

//        for (AirportDto airportDto : list) {
//            System.out.println(airportDto.getName());
//        }

//        model.addAttribute("names", list);

        return "successLang";
    }

}
