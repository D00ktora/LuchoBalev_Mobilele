package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.AllBrandsDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BrandService {
    List<BrandsDTO> getAllBrands();
    List<BrandsDTO> getAllBrandsWithModels();
}
