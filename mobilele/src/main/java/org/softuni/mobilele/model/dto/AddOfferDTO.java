package org.softuni.mobilele.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.softuni.mobilele.model.entity.enums.Engine;
import org.softuni.mobilele.model.entity.enums.Transmission;

public class AddOfferDTO {
    @NotNull
    @Min(1)
    private Long modelId;
    @NotNull(message = "Engine type is required.")
    private Engine engine;
    @NotEmpty
    private String imageUrl;
    @NotNull
    private Double price;
    @NotNull(message = "Transmission type is required.")
    private Transmission transmission;
    @NotNull
    private Integer year;
    @NotNull
    private Integer mileage;
    @NotEmpty
    private String description;

    public Long getModelId() {
        return modelId;
    }

    public AddOfferDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public AddOfferDTO setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public AddOfferDTO setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public AddOfferDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public AddOfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddOfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AddOfferDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public AddOfferDTO setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
}
