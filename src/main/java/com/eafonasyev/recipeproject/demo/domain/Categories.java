package com.eafonasyev.recipeproject.demo.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idl;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Integer getIdl() {
        return idl;
    }

    public void setIdl(Integer idl) {
        this.idl = idl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
