package org.softuni.mobilele.repository;

import org.softuni.mobilele.model.dto.ModelDTO;
import org.softuni.mobilele.model.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> getAllBy();
    List<Model> getAllByBrand_Id(Long id);

}
