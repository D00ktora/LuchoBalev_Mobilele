package org.softuni.mobilele.model.dto;

import java.util.ArrayList;
import java.util.List;

public class BrandsDTO {
    private String name;
    private List<AllBrandsDTO> allBrandsDTOList;
    private List<ModelDTO> models = new ArrayList<>();

    public List<ModelDTO> getModels() {
        return models;
    }

    public BrandsDTO setModels(List<ModelDTO> models) {
        this.models = models;
        return this;
    }

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

    public BrandsDTO addModel(ModelDTO modelDTO) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelDTO);
        return this;
    }
}
