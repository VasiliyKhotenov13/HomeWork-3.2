package me.khotenov.firstapp.service;

import me.khotenov.firstapp.model.Ingredients;
import org.springframework.stereotype.Service;


public interface IngredientsService {
    void addIngredient(Integer id, Ingredients ingredient);

    void getIngredient();
}

