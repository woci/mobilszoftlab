package com.example.mobsoft.cookbook.ui.recipeDetails;

import android.os.Bundle;

import com.example.mobsoft.cookbook.MobSoftApplication;
import com.example.mobsoft.cookbook.R;
import com.example.mobsoft.cookbook.data.Recipe;
import com.example.mobsoft.cookbook.ui.BaseActivity;
import com.example.mobsoft.cookbook.ui.BaseScreen;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class RecipeDetailsActivity extends BaseActivity implements RecipeDetailsScreen {
    RecipeDetailsPresenter recipeDetailsPresenter;

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
        recipeDetailsPresenter.attachScreen((BaseScreen) this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        recipeDetailsPresenter.detachScreen();
    }
    @Override
    public void showRecipeDetails(Recipe recipe) {

    }
}
