package org.example.Entities;

public class Drink {
    private Integer id;
    private String name;
    private String description;
    private Double productionCost;
    private Double sellCost;

    public Drink(){

    }
    public Drink(Integer id, String name, String description, Double productionCost, Double sellCost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productionCost = productionCost;
        this.sellCost = sellCost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(Double productionCost) {
        this.productionCost = productionCost;
    }

    public Double getSellCost() {
        return sellCost;
    }

    public void setSellCost(Double sellCost) {
        this.sellCost = sellCost;
    }
}
