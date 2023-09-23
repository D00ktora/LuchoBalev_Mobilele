package org.softuni.mobilele.model.dto;

public class AllBrandsDTO {
    private Long id;
    private String name;
    private String category;
    private Integer startYear;
    private Integer endYear;
    private String imageUrl;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public AllBrandsDTO setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Long getId() {
        return id;
    }

    public AllBrandsDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AllBrandsDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public AllBrandsDTO setCategory(String category) {
        this.category = category;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public AllBrandsDTO setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public AllBrandsDTO setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AllBrandsDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
