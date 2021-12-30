package fr.lernejo.prediction;
import org.springframework.http.ResponseEntity;
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
    public Object get(@RequestParam String country)
    {
        LocalDate ld = LocalDate.now();
        Temperatures t = new Temperatures(country,new ArrayList<Temperature>());
        try
        {
            t.temperatures().add(new Temperature(ld.minusDays(1).toString(),ts.getTemperature(country)));
            t.temperatures().add(new Temperature(ld.minusDays(2).toString(),ts.getTemperature(country)));
        }
        catch (UnknownCountryException e)
        {
            return ResponseEntity.status(417).body("Error");
        }
        return t;
    }

}
