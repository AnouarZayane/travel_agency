package fr.lernejo.travelsite;

public record Registre ( String userEmail, String userName ,String userCountry, String weatherExpectation, int minimumTemperatureDistance) {
    public Registre(String userEmail, String userName, String userCountry, String weatherExpectation, int minimumTemperatureDistance) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userCountry = userCountry;
        this.minimumTemperatureDistance = minimumTemperatureDistance;
        this.weatherExpectation = weatherExpectation;

    }
}
