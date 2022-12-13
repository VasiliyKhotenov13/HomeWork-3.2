package me.khotenov.firstapp.controllers;

import me.khotenov.firstapp.model.Ingredients;
import me.khotenov.firstapp.service.impl.IngredientsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private IngredientsServiceImpl ingredientsService;

    @GetMapping("/homePageIngredients")
    public void homePage() {
        System.out.println("Домашняя страничка ингредиентов.");
    }

    @GetMapping("/addIngredients")
    public void addIngredient(@RequestParam Integer id,
                              @RequestParam Ingredients ingredient) {
        ingredientsService.addIngredient(id, ingredient);
    }

    @GetMapping("/allIngredients")
    public void getIngredient() {
        ingredientsService.getIngredient();
    }
}
