package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class Controller {
    final ArrayList<Registre> signingup = new ArrayList<>();

    @PostMapping(value = "/api/inscription")
    public ArrayList<Registre> signup(@RequestBody Registre registre )
    {
        signingup.add(registre);
        return signingup;
    }

    @GetMapping(value="/api/travels")
    public ArrayList<Pays> destination(@RequestParam String userName)
    {
        ArrayList<Pays> pays = new ArrayList<>();

        for (Registre registre:signingup)
        {
            if (registre.userName().equals(userName))
            {
                return pays;
            }
        }
        return new ArrayList<>();
    }

}
