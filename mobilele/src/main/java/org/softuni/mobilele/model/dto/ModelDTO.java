package org.softuni.mobilele.model.dto;

public class ModelDTO {
    private String name;
    private BrandsDTO brand;

    public BrandsDTO getBrand() {
        return brand;
    }

    public ModelDTO setBrand(BrandsDTO brand) {
        this.brand = brand;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModelDTO setName(String name) {
        this.name = name;
        return this;
    }
}
