package org.lessons.pizzery.springlamiapizzeriacrud.service;

import org.lessons.pizzery.springlamiapizzeriacrud.model.Ingredient;
import org.lessons.pizzery.springlamiapizzeriacrud.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAll(){
        return ingredientRepository.findAll(Sort.by("name"));
    }

    public Ingredient create(Ingredient formIngredient) {
        Ingredient ingredientToCreate = new Ingredient();
        ingredientToCreate.setName(formIngredient.getName());
        return ingredientRepository.save(ingredientToCreate);
    }
}
