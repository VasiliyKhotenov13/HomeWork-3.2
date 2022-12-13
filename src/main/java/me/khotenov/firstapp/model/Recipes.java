package me.khotenov.firstapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
public class Recipes {
    private String nameRecipe;
    private int cookingTime;
    private List<Ingredients> ingredientsList = new ArrayList<>();
    private LinkedList<String> steps = new LinkedList<>();
}
