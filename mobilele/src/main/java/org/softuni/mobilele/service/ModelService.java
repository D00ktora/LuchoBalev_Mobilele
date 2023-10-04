package org.softuni.mobilele.service;

import org.softuni.mobilele.model.entity.Model;

import java.util.List;

public interface ModelService {
    List<Model> getAll();
    List<Model> getAllById(Long id);
    Model findById(Long id);
}
