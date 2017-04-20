package com.example.mobsoft.cookbook.repository;

import android.content.Context;

import com.example.mobsoft.cookbook.model.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by woci on 2017. 04. 20..
 */

public class MemoryRepository implements Repository {
    private static final long MINUTE = 60 * 1000;

    public static List<Recipe> recipes;

    @Override
    public void open(Context context) {
        ArrayList<String> ing1 = new ArrayList<String>();
        ing1.add("Pacal - 1kg");
        ing1.add("Paradicsom - 25 dkg");
        ing1.add("Só");
        Recipe recipe1 = new Recipe(new Long(-1), "Pacal", ing1, "Csinljuk ezt és ezt", null);
        ArrayList<String> ing2 = new ArrayList<String>();
        ing2.add("Borsó - 1 kg");
        ing2.add("Tejföl - 10 dkg");
        ing2.add("Liszt - 5 dkg");
        Recipe recipe2 = new Recipe(new Long(-2), "Pacal", ing2, "Csinljuk ezt és azt", null);

        recipes = new ArrayList<>();
        recipes.add(recipe1);
        recipes.add(recipe2);
    }

    @Override
    public void close() {

    }

    @Override
    public List<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public Recipe getRecipe(Integer id) {
        return null;
    }

    @Override
    public void saveRecipe(Recipe recipe) {
        recipe.setId(getNextMinId());
        recipes.add(recipe);
    }

    @Override
    public void updateRecipe(Recipe recipe) {
        int index = 0;
        for (Recipe origin: recipes){
            if (origin.getId() == recipe.getId()){
                recipes.set(index,recipe);
            }
            index++;
        }
    }

    @Override
    public Long getNextMinId() {
        Long nextMin = new Long(0);
        for (Recipe recipe :recipes){
            if ( recipe.getId() < nextMin){
                nextMin = recipe.getId();
            }
        }
        return nextMin--;
    }

    @Override
    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }
}
