package com.example.mobsoft.cookbook.ui.editRecipe;

import com.example.mobsoft.cookbook.ui.BaseScreen;
import com.example.mobsoft.cookbook.ui.Presenter;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class EditRecipePresenter extends Presenter<EditRecipeScreen> {
    public  EditRecipePresenter(){

    }

    public void attachScreen(BaseScreen screen) {
        super.attachScreen((EditRecipeScreen)screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void btnSavePressed(){

    }
}
