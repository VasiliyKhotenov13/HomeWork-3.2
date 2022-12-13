package me.khotenov.firstapp.service.impl;

import me.khotenov.firstapp.model.Ingredients;
import me.khotenov.firstapp.service.IngredientsService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    private Map<Integer, Ingredients> ingredientsMap = new HashMap<>();

    @Override
    public void addIngredient(Integer id, Ingredients ingredient) {
        ingredientsMap.put(id, ingredient);
    }

    @Override
    public void getIngredient() {
        for (Map.Entry<Integer, Ingredients> entry : ingredientsMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
