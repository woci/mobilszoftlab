package com.example.mobsoft.cookbook.interactor.recipes.events;

import com.example.mobsoft.cookbook.model.Recipe;

/**
 * Created by woci on 2017. 04. 20..
 */

public class SaveRecipeEvent {
    private int code;
    private Recipe recipe;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public SaveRecipeEvent() {
    }

    public SaveRecipeEvent(int code, Recipe recipe, Throwable throwable) {
        this.code = code;
        this.recipe = recipe;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Recipe getTodo() {
        return recipe;
    }

    public void setTodo(Recipe recipe) {
        this.recipe = recipe;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
