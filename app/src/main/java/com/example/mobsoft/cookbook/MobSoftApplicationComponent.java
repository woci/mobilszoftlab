package com.example.mobsoft.cookbook;

import com.example.mobsoft.cookbook.ui.BaseActivity;
import com.example.mobsoft.cookbook.ui.UIModule;
import com.example.mobsoft.cookbook.ui.editRecipe.EditRecipePresenter;
import com.example.mobsoft.cookbook.ui.main.MainPresenter;
import com.example.mobsoft.cookbook.ui.recipeDetails.RecipeDetailsPresenter;
import com.example.mobsoft.cookbook.ui.recipes.RecipesPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(BaseActivity mainActivity);
    void inject(MobSoftApplication mobSoftApplication);
    void inject(MainPresenter mainPresenter);
    void inject(EditRecipePresenter editRecipePresenter);
    void inject(RecipeDetailsPresenter recipeDetailsPresenter);
    void inject(RecipesPresenter recipesPresenter);

}
