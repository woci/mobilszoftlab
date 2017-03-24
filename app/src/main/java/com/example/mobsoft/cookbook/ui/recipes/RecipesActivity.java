package com.example.mobsoft.cookbook.ui.recipes;

import android.os.Bundle;

import com.example.mobsoft.cookbook.MobSoftApplication;
import com.example.mobsoft.cookbook.R;
import com.example.mobsoft.cookbook.data.Recipe;
import com.example.mobsoft.cookbook.ui.BaseActivity;
import com.example.mobsoft.cookbook.ui.BaseScreen;

import java.util.List;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class RecipesActivity extends BaseActivity implements RecipesScreen {
    RecipesPresenter recipesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //injecting the presenter
        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        recipesPresenter.attachScreen((BaseScreen) this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        recipesPresenter.detachScreen();
    }

    @Override
    public void showRecipes(List<Recipe> recipeList) {

    }
}
