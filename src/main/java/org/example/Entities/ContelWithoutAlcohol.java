package org.example.Entities;

import java.time.LocalTime;

public class ContelWithoutAlcohol extends Coctel{
    private String soda;

    public ContelWithoutAlcohol() {
    }

    @Override
    public Boolean calculateExpiring(LocalTime hourMade, LocalTime hourSold) {
        return null;
    }

    public ContelWithoutAlcohol(Integer id, String name, String description, Double productionCost, Double sellCost, String alcoholPercentage, Presentation presentation, String soda) {
        super(id, name, description, productionCost, sellCost, alcoholPercentage, presentation);
        this.soda = soda;
    }

    public String getSoda() {
        return soda;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }
}
