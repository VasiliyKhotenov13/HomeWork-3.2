package me.khotenov.firstapp.service.impl;

import me.khotenov.firstapp.model.Recipes;
import me.khotenov.firstapp.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipesServiceImpl implements RecipeService {
    private Map<Integer, Recipes> recipesMap = new HashMap<>();

    @Override
    public void addRecipe(Integer id, Recipes recipe) {
        recipesMap.put(id, recipe);
    }

    @Override
    public void getRecipe() {
        for (Map.Entry<Integer, Recipes> entry : recipesMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
