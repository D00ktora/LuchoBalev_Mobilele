package org.softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.softuni.mobilele.model.dto.AllBrandsDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.softuni.mobilele.model.dto.ModelDTO;
import org.softuni.mobilele.model.entity.Brand;
import org.softuni.mobilele.model.entity.Model;
import org.softuni.mobilele.repository.BrandRepository;
import org.softuni.mobilele.repository.ModelRepository;
import org.softuni.mobilele.service.BrandService;
import org.softuni.mobilele.service.ModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    private final ModelService modelService;
    private final ModelMapper modelMapper;

    public BrandServiceImpl(BrandRepository brandRepository, ModelService modelService, ModelMapper modelMapper) {
        this.brandRepository = brandRepository;
        this.modelService = modelService;
        this.modelMapper = modelMapper;
    }

    public List<BrandsDTO> getAllBrands() {
        List<BrandsDTO> separatedByBrand = new ArrayList<>();
        List<AllBrandsDTO> allBrands = new ArrayList<>();
        List<Model> allBy = modelService.getAll();
        Set<String> brands = new LinkedHashSet<>();

        for (Model model : allBy) {
            AllBrandsDTO map = modelMapper.map(model, AllBrandsDTO.class);
            allBrands.add(map.setBrand(model.getBrand().getName()));
            brands.add(model.getBrand().getName());
        }

        for (String brand : brands) {
            BrandsDTO brandsDTO = new BrandsDTO();
            List<AllBrandsDTO> collect = allBrands.stream().filter(br -> br.getBrand().equals(brand)).toList();
            separatedByBrand.add(brandsDTO.setName(brand).setAllBrandsDTOList(collect));
        }

        return separatedByBrand;
    }

    @Override
    public List<BrandsDTO> getAllBrandsWithModels() {
        List<Brand> allBrands = brandRepository.getAllBy();
        List<BrandsDTO> brandsDTOS = allBrands.stream().map(brand ->{
            BrandsDTO map = modelMapper.map(brand, BrandsDTO.class);
            List<Model> models = modelService.getAllById(brand.getId());
            List<ModelDTO> mappedModels = models.stream().map(model -> modelMapper.map(model, ModelDTO.class)).toList();
            map.setModels(mappedModels);
            return map;
        }).toList();

        return brandsDTOS;
    }


}
