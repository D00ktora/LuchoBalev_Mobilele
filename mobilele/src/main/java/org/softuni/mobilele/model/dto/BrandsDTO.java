package org.softuni.mobilele.model.dto;

import java.util.List;

public class BrandsDTO {
    private String name;
    private List<AllBrandsDTO> allBrandsDTOList;

    public String getName() {
        return name;
    }

    public BrandsDTO setName(String name) {
        this.name = name;
        return this;
    }

    public List<AllBrandsDTO> getAllBrandsDTOList() {
        return allBrandsDTOList;
    }

    public BrandsDTO setAllBrandsDTOList(List<AllBrandsDTO> allBrandsDTOList) {
        this.allBrandsDTOList = allBrandsDTOList;
        return this;
    }
}
