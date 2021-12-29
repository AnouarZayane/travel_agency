package fr.lernejo.travelsite;

    public record Pays(String pays , Float temperature)
    {
        public Pays(String pays, Float temperature)
        {
            this.pays=pays;
            this.temperature=temperature;
        }
    }

