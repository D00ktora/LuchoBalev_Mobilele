package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.AllBrandsDTO;
import org.softuni.mobilele.model.dto.BrandsDTO;
import org.softuni.mobilele.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/brands")
@Controller
public class BrandsController {
    private final BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/all")
    public String allBrands(Model model) {
        List<BrandsDTO> allBrands = brandService.getAllBrands();
        model.addAttribute("allBrands", allBrands);
        return "brands";
    }
}
