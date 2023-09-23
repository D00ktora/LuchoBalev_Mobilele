package org.softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.softuni.mobilele.model.dto.AllBrandsDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.softuni.mobilele.model.entity.Model;
import org.softuni.mobilele.repository.ModelRepository;
import org.softuni.mobilele.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        BrandsDTO brandsDTO = new BrandsDTO();
        List<BrandsDTO> separatedByBrand = new ArrayList<>();
        List<AllBrandsDTO> allBrands = new ArrayList<>();
        List<Model> allBy = modelRepository.getAllBy();
        List<String> brands = new ArrayList<>();

        for (Model model : allBy) {
            AllBrandsDTO map = modelMapper.map(model, AllBrandsDTO.class);
            allBrands.add(map.setName(model.getBrand().getName()));
            brands.add(model.getBrand().getName());
        }

        for (String brand : brands) {
            List<AllBrandsDTO> collect = allBrands.stream().filter(br -> br.getBrand().equals(brand)).toList();
            separatedByBrand.add(brandsDTO.setName(brand).setAllBrandsDTOList(collect));
        }

        return separatedByBrand;
    }
}
