package org.softuni.mobilele.service.impl;

import org.softuni.mobilele.model.entity.Model;
import org.softuni.mobilele.repository.ModelRepository;
import org.softuni.mobilele.service.ModelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public List<Model> getAll() {
        return modelRepository.getAllBy();
    }

    @Override
    public List<Model> getAllById(Long id) {
        return modelRepository.getAllByBrand_Id(id);
    }

    @Override
    public Model findById(Long id) {
        return modelRepository.findById(id).orElse(null);
    }
}
