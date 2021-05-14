package com.groundedabstraction.foodfamilytrees.models.data;

import com.groundedabstraction.foodfamilytrees.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
