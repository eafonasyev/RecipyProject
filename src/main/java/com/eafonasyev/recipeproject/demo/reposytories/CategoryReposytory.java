package com.eafonasyev.recipeproject.demo.reposytories;

import com.eafonasyev.recipeproject.demo.domain.Categories;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryReposytory extends CrudRepository<Categories,Integer> {

    Optional<Categories> findByDescription(String desc);
}
