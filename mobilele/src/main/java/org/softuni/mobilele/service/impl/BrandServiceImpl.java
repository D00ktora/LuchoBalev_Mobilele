package org.softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.softuni.mobilele.model.dto.AllBrandsDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.softuni.mobilele.model.entity.Model;
import org.softuni.mobilele.repository.ModelRepository;
import org.softuni.mobilele.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class BrandServiceImpl implements BrandService {
    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    public BrandServiceImpl(ModelRepository modelRepository, ModelMapper modelMapper) {
        this.modelRepository = modelRepository;
        this.modelMapper = modelMapper;
    }

    public List<BrandsDTO> getAllBrands() {
        //TODO: To check whats happen in this.
        List<BrandsDTO> separatedByBrand = new ArrayList<>();
        List<AllBrandsDTO> allBrands = new ArrayList<>();
        List<Model> allBy = modelRepository.getAllBy();
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
}
