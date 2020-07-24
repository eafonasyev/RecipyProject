package com.eafonasyev.recipeproject.demo.reposytories;

import com.eafonasyev.recipeproject.demo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public abstract class RecipyReposytory implements CrudRepository<Recipe,Integer> {
}
