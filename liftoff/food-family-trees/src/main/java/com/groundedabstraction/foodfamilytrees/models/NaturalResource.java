package com.groundedabstraction.foodfamilytrees.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NaturalResource extends AbstractEntity {

    @ManyToMany(mappedBy = "naturalResources")
    private List<Ingredient> ingredients = new ArrayList<>();

    public NaturalResource() {}
}
