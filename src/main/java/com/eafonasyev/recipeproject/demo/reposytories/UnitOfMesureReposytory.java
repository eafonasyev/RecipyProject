package com.eafonasyev.recipeproject.demo.reposytories;

import com.eafonasyev.recipeproject.demo.domain.UnitOfMesure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMesureReposytory extends CrudRepository<UnitOfMesure, Integer> {

    Optional<UnitOfMesure> findByDescription(String desc);
}

