package org.softuni.mobilele.model.dto;

public class OfferDTO {
    private ModelDTO model;
    private Integer year;
    private Integer mileage;
    private Double price;
    private String  engine;
    private String  transmission;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public OfferDTO setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public OfferDTO setPrice(Double price) {
        this.price = price;
        return this;
    }

    public ModelDTO getModel() {
        return model;
    }

    public OfferDTO setModel(ModelDTO model) {
        this.model = model;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public OfferDTO setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getTransmission() {
        return transmission;
    }

    public OfferDTO setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }
    public String title() {
        return this.model.getBrand().getName() +
                " " +
                this.model.getName() +
                " - " +
                this.year;
    }
}
