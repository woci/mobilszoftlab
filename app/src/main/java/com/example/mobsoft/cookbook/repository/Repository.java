package com.example.mobsoft.cookbook.repository;

import android.content.Context;

import com.example.mobsoft.cookbook.model.Recipe;

import java.util.List;

/**
 * Created by woci on 2017. 04. 07..
 */

public interface Repository {
    void open(Context context);
    void close();
    List<Recipe> getRecipes();
    Recipe getRecipe(Integer id);
    void saveRecipe(Recipe recipe);
    void updateRecipe(Recipe recipe);
    Long getNextMinId();
    void removeRecipe(Recipe recipe);
}
