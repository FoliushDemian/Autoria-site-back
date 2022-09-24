package com.example.backForLab5.repository;

import com.example.backForLab5.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo  extends CrudRepository<CarEntity, Integer> {
    CarEntity findByName(String name);
}
