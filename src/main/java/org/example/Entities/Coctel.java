package org.example.Entities;

import java.time.LocalTime;

public abstract class Coctel extends Drink{
    String alcoholPercentage;

    Presentation presentation;

    public Coctel() {

    }

    public Coctel(Integer id, String name, String description, Double productionCost, Double sellCost, String alcoholPercentage, Presentation presentation) {
        super(id, name, description, productionCost, sellCost);
        this.alcoholPercentage = alcoholPercentage;
        this.presentation = presentation;
    }

    public String getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(String alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public abstract Boolean calculateExpiring(LocalTime hourMade, LocalTime hourSold);
}
