package com.example.mobsoft.cookbook.interactor.recipes.events;

import com.example.mobsoft.cookbook.model.Recipe;

/**
 * Created by woci on 2017. 04. 20..
 */

public class RemoveRecipeEvent {
    private int code;
    private Recipe recipe;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public RemoveRecipeEvent() {
    }

    public RemoveRecipeEvent(int code, Recipe recipe, Throwable throwable) {
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

    public Recipe getTodos() {
        return recipe;
    }

    public void setTodos(Recipe todos) {
        this.recipe = todos;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
