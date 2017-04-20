package com.example.mobsoft.cookbook.interactor.recipes;

import com.example.mobsoft.cookbook.MobSoftApplication;
import com.example.mobsoft.cookbook.interactor.recipes.events.GetRecipesEvent;
import com.example.mobsoft.cookbook.interactor.recipes.events.RemoveRecipeEvent;
import com.example.mobsoft.cookbook.interactor.recipes.events.SaveRecipeEvent;
import com.example.mobsoft.cookbook.model.Recipe;
import com.example.mobsoft.cookbook.repository.Repository;
import com.google.common.eventbus.EventBus;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by woci on 2017. 04. 17..
 */

public class RecipesInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public RecipesInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void getRecipes() {
        GetRecipesEvent event = new GetRecipesEvent();
        try {
            List<Recipe> recipes = repository.getRecipes();
            event.setTodos(recipes);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void saveRecipe(Recipe recipe) {

        SaveRecipeEvent event = new SaveRecipeEvent();
        event.setTodo(recipe);
        try {
            repository.saveRecipe(recipe);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updateRecipe(Recipe recipe) {
        try {
            repository.updateRecipe(recipe);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeRecipe(Recipe recipe) {
        RemoveRecipeEvent event = new RemoveRecipeEvent();
        event.setTodos(recipe);
        try {
            repository.removeRecipe(recipe);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
