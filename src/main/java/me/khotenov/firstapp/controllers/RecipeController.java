package me.khotenov.firstapp.controllers;

import me.khotenov.firstapp.model.Recipes;
import me.khotenov.firstapp.service.RecipeService;
import me.khotenov.firstapp.service.impl.RecipesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private RecipesServiceImpl recipeService;

    @GetMapping("/homePageRecipes")
    public void homePage() {
        System.out.println("Домашняя страничка рецептов.");
    }

    @GetMapping("/add")
    public void addRecipe(@RequestParam Integer id,
                          @RequestParam Recipes recipe) {
        recipeService.addRecipe(id, recipe);
    }

    @GetMapping("/allRecipe")
    public void getRecipe() {
        recipeService.getRecipe();
    }
}
