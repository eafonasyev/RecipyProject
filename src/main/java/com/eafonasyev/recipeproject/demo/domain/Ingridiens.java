package com.eafonasyev.recipeproject.demo.domain;

import javax.persistence.*;

@Entity
public class Ingridiens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;
    private Integer amount;
    @ManyToOne
    private Recipe recipe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
