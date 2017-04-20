package com.example.mobsoft.cookbook.ui.recipes;

import com.example.mobsoft.cookbook.model.Recipe;
import com.example.mobsoft.cookbook.ui.BaseScreen;

import java.util.List;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public interface RecipesScreen extends BaseScreen {
    void showRecipes(List<Recipe> recipeList);
}
