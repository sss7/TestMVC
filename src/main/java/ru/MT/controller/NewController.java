package ru.MT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.MT.model.Language;
import ru.MT.webservices.Airport;
import ru.MT.webservices.OnlineTimeTableSoap;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * Created by user on 26.12.2017.
 */
@Controller
//@RequestMapping(value = "/new")
public class NewController {
//    @Autowired
    @Resource(name = "OnlineTimeTableSoap")
    OnlineTimeTableSoap service;

    @RequestMapping(value = "/lang", method = RequestMethod.GET)
    public ModelAndView showLangForm() {
        return new ModelAndView("lang","command", new Language());
    }

    @RequestMapping(value = "/showLang", method = RequestMethod.POST)
    public String showAirports(@ModelAttribute("lang") Language lang,
                               @ModelAttribute("airport") Airport airport,
                               ModelMap model) {

        model.addAttribute("lang", lang.getLang());
//        model.addAttribute("name", service.getAirportsList(lang.getLang()).getAirport().get(0).getName());
//        model.addAttribute("IATA", service.getAirportsList(lang.getLang()).getAirport().get(0).getIATA());

        ArrayList<String> list = new ArrayList<String>();
        for (Airport airport1 : service.getAirportsList(lang.getLang()).getAirport()) {
            list.add(airport1.getName());
            list.add(airport1.getIATA());
        }

//        ArrayList<Airport> list = new ArrayList<Airport>();
//        for (Airport airport1 : service.getAirportsList(lang.getLang()).getAirport()) {
//            list.add(airport1);
//        }

//        model.addAttribute("name", service.getAirportsList(lang.getLang()).getAirport());
        model.addAttribute("names", list);

        return "redirect:pages/successLang.jsp";
    }

}
