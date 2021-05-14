package com.groundedabstraction.foodfamilytrees.models.data;

import com.groundedabstraction.foodfamilytrees.models.Ingredient;
import com.groundedabstraction.foodfamilytrees.models.NaturalResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaturalResourceRepository extends CrudRepository<NaturalResource, Integer> {
}
