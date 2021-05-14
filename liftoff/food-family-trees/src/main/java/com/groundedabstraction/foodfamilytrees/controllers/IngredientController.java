package com.groundedabstraction.foodfamilytrees.controllers;

import com.groundedabstraction.foodfamilytrees.models.data.IngredientRepository;
import com.groundedabstraction.foodfamilytrees.models.data.NaturalResourceRepository;
import com.groundedabstraction.foodfamilytrees.models.data.ProcessedFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
@CrossOrigin(origins = "*")
public class IngredientController {

    @Autowired
    private ProcessedFoodRepository processedFoodRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private NaturalResourceRepository naturalResourceRepository;
}
