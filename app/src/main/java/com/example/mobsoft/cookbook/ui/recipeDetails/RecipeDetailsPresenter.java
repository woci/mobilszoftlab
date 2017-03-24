package com.example.mobsoft.cookbook.ui.recipeDetails;

import com.example.mobsoft.cookbook.ui.Presenter;
import com.example.mobsoft.cookbook.ui.main.MainScreen;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class RecipeDetailsPresenter extends Presenter<RecipeDetailsScreen> {
        public  RecipeDetailsPresenter(){

        }

        public void attachScreen(MainScreen screen) {
            super.attachScreen((RecipeDetailsScreen) screen);
        }

        @Override
        public void detachScreen() {
            super.detachScreen();
        }
}
