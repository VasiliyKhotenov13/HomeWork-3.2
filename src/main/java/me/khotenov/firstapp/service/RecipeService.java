package me.khotenov.firstapp.service;

import me.khotenov.firstapp.model.Recipes;

public interface RecipeService {
    void addRecipe(Integer id, Recipes recipe);

    void getRecipe();
}
