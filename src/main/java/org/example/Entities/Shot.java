package org.example.Entities;

public class Shot extends Drink{

    private String alcoholType;
    private String alcoholBrand;
    public Shot() {

    }

    public Shot(Integer id, String name, String description, Double productionCost, Double sellCost, String alcoholType, String alcoholBrand) {
        super(id, name, description, productionCost, sellCost);
        this.alcoholType = alcoholType;
        this.alcoholBrand=alcoholType;
    }

    public String getAlcoholType() {
        return alcoholType;
    }

    public void setAlcoholType(String alcoholType) {
        this.alcoholType = alcoholType;
    }

    public String getAlcoholBrand() {
        return alcoholBrand;
    }

    public void setAlcoholBrand(String alcoholBrand) {
        this.alcoholBrand = alcoholBrand;
    }
}
