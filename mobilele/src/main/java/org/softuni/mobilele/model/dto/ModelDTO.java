package org.softuni.mobilele.model.dto;

public class ModelDTO {
    private Long id;
    private String name;
    private BrandsDTO brand;

    public Long getId() {
        return id;
    }

    public ModelDTO setId(Long id) {
        this.id = id;
        return this;
    }

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
