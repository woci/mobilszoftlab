package com.example.mobsoft.cookbook.ui.recipes;

import com.example.mobsoft.cookbook.ui.BaseScreen;
import com.example.mobsoft.cookbook.ui.Presenter;
import com.example.mobsoft.cookbook.ui.main.MainScreen;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class RecipesPresenter extends Presenter<RecipesScreen> {
    public  RecipesPresenter(){

    }

    public void attachScreen(BaseScreen screen) {
        super.attachScreen((RecipesScreen) screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void cellRecipePressed(){

    }

    public void getRecipes(){

    }
}
