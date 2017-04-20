package com.example.mobsoft.cookbook.interactor.recipes.events;

import com.example.mobsoft.cookbook.model.Recipe;

import java.util.List;

/**
 * Created by woci on 2017. 04. 20..
 */

public class GetRecipesEvent {
    private int code;
    private List<Recipe> recipes;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public GetRecipesEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setTodos(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
