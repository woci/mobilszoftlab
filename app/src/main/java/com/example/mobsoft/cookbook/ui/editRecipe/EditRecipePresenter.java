package com.example.mobsoft.cookbook.ui.editRecipe;

import android.util.Log;

import com.example.mobsoft.cookbook.interactor.recipes.RecipesInteractor;
import com.example.mobsoft.cookbook.interactor.recipes.events.GetRecipesEvent;
import com.example.mobsoft.cookbook.model.Recipe;
import com.example.mobsoft.cookbook.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class EditRecipePresenter extends Presenter<EditRecipeScreen> {

    @Inject
    RecipesInteractor recipesInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    Recipe recipe;

    public  EditRecipePresenter(){

    }

    public void attachScreen(EditRecipeScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void btnSavePressed(){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                recipesInteractor.saveRecipe(recipe);
            }
        });
    }

    public void onEventMainThread(GetRecipesEvent event) {
        Log.d("test","test");
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                screen.navigateBack();
            }
        }
    }

}
