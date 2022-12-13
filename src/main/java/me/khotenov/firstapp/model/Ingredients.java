package me.khotenov.firstapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredients {

    private String nameIngredient;
    private int quantity;
    private String unit;
}
