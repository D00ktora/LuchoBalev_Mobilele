package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.softuni.mobilele.model.entity.enums.Engine;
import org.softuni.mobilele.model.entity.enums.Transmission;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "offers")

public class Offer extends BaseEntity {
    @NotNull
    @Column(columnDefinition = "text")
    private String description;
    @NotNull
    @Enumerated(value = EnumType.ORDINAL)
    private Engine engine;
    private String imageUrl;
    @NotNull
    private int mileage;
    @NotNull
    private BigDecimal price;
    @NotNull
    @Enumerated(value = EnumType.ORDINAL)
    private Transmission transmission;
    @NotNull
    private int year;
    @NotNull
    private LocalDateTime created;
    @NotNull
    private LocalDateTime modified;
    @NotNull
    @ManyToOne
    private Model model;
    @NotNull
    @ManyToOne
    private UserEntity user;

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Offer setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Offer setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public Offer setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Offer setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Offer setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Offer setYear(int year) {
        this.year = year;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Offer setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Offer setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Model getModel() {
        return model;
    }

    public Offer setModel(Model model) {
        this.model = model;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public Offer setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}
