package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class Controller
{
    final TemperatureService ts = new TemperatureService();

    @GetMapping(value="/api/temperature")
    public Object getTemperature(@RequestParam String country)
    {
        EnglobingTemperature t = new EnglobingTemperature(country,new ArrayList<Temperature>());
        LocalDate ld = LocalDate.now();
        try
        {
            t.englobingtemperature().add(new Temperature(ld.minusDays(1).toString(),ts.getTemperature(country)));
            t.englobingtemperature().add(new Temperature(ld.minusDays(2).toString(),ts.getTemperature(country)));
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        return t;
    }

}
