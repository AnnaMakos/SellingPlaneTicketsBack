package com.plane.tickets.project.sellingplanetickets.controllers;

import com.plane.tickets.project.sellingplanetickets.services.JsonReader;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WeatherController {

    @RequestMapping("/weather")
    public String getWeather() throws IOException {
        return JsonReader.readJsonFromUrl("http://api.openweathermap.org/data/2.5/weather?q=Warsaw&APPID=b049057ea04811ad1827614c45659a74").toString();
    }

}
