package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.softuni.mobilele.model.entity.enums.Category;

import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {
    @NotNull
    private String name;
    @NotNull
    @Enumerated(value = EnumType.ORDINAL)
    private Category category;
    @NotNull
    private String imageUrl;
    @NotNull
    private Integer startYear;
    private Integer endYear;
    @NotNull
    private LocalDateTime created;
    @NotNull
    private LocalDateTime modified;
    @NotNull
    @ManyToOne
    Brand brand;

    public String getName() {
        return name;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Model setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Model setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public Model setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Model setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Model setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Model setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }
}
