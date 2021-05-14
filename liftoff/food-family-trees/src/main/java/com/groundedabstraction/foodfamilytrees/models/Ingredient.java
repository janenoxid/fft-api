package com.groundedabstraction.foodfamilytrees.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredient extends AbstractEntity {

    @ManyToMany(mappedBy = "ingredients")
    private List<ProcessedFood> processedFoods = new ArrayList<>();

    @ManyToMany
    private List<NaturalResource> naturalResources;


    public Ingredient(){}

}
