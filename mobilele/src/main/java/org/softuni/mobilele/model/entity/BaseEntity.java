package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;


@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    public long getId() {
        return Id;
    }

    public BaseEntity setId(long id) {
        Id = id;
        return this;
    }
}
