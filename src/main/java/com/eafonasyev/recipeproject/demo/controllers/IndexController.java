package com.eafonasyev.recipeproject.demo.controllers;

import com.eafonasyev.recipeproject.demo.domain.Categories;
import com.eafonasyev.recipeproject.demo.domain.UnitOfMesure;
import com.eafonasyev.recipeproject.demo.reposytories.CategoryReposytory;
import com.eafonasyev.recipeproject.demo.reposytories.UnitOfMesureReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryReposytory  categoryReposytory;

    private UnitOfMesureReposytory unitOfMesureReposytory;

    @Autowired
    public IndexController(CategoryReposytory categoryReposytory, UnitOfMesureReposytory unitOfMesureReposytory) {
        this.categoryReposytory = categoryReposytory;
        this.unitOfMesureReposytory = unitOfMesureReposytory;
    }

    @GetMapping({"","/","/index"})
public String getIndexPage(){
        Optional<Categories> categories = categoryReposytory.findByDescription("Russian");
        Optional<UnitOfMesure> unitOfMesure = unitOfMesureReposytory.findByDescription("gr");
        System.out.println(categories.get().getIdl());
        System.out.println(unitOfMesure.get().getId());
    return "index";
}
}
