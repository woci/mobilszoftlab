package com.example.mobsoft.cookbook.ui.editRecipe;

import android.os.Bundle;

import com.example.mobsoft.cookbook.MobSoftApplication;
import com.example.mobsoft.cookbook.R;
import com.example.mobsoft.cookbook.ui.BaseActivity;
import com.example.mobsoft.cookbook.ui.BaseScreen;
import com.example.mobsoft.cookbook.ui.recipes.RecipesPresenter;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class EditRecipeActivity extends BaseActivity implements EditRecipeScreen {

    EditRecipePresenter editRecipePresenter;

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
        editRecipePresenter.attachScreen((BaseScreen) this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        editRecipePresenter.detachScreen();
    }

    @Override
    public void navigateToRecipesActivity() {

    }
}
