package org.example.Entities;

import java.time.LocalTime;

public class ContelWithAlcohol extends Coctel{

    public ContelWithAlcohol() {
    }

    public ContelWithAlcohol(Integer id, String name, String description, Double productionCost, Double sellCost, String alcoholPercentage, Presentation presentation) {
        super(id, name, description, productionCost, sellCost, alcoholPercentage, presentation);
    }



    @Override
    public Boolean calculateExpiring(LocalTime hourMade, LocalTime hourSold) {
        return null;
    }
}
