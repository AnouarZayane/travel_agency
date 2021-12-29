package fr.lernejo.prediction;

import java.util.ArrayList;

public record EnglobingTemperature(String country , ArrayList<Temperature> englobingtemperature)
{
    public EnglobingTemperature(String country,ArrayList<Temperature> englobingtemperature)
    {
        this.country=country;
        this.englobingtemperature=englobingtemperature;
    }
}
