package com.groundedabstraction.foodfamilytrees.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class ProcessedFood extends AbstractEntity{

    @ManyToMany
    private List<Ingredient> ingredients;

    public ProcessedFood(){};

    public ProcessedFood(List<Ingredient> someIngredients){
        super();
        this.ingredients = someIngredients;
    }

}
