package com.groundedabstraction.foodfamilytrees.models.data;

import com.groundedabstraction.foodfamilytrees.models.ProcessedFood;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessedFoodRepository extends CrudRepository<ProcessedFood, Integer> {
}
