package com.example.mobsoft.cookbook.ui.recipes;

import android.util.Log;

import com.example.mobsoft.cookbook.interactor.recipes.RecipesInteractor;
import com.example.mobsoft.cookbook.interactor.recipes.events.GetRecipesEvent;
import com.example.mobsoft.cookbook.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class RecipesPresenter extends Presenter<RecipesScreen> {
    @Inject
    RecipesInteractor recipesInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    public  RecipesPresenter(){

    }

    public void attachScreen(RecipesScreen screen) {
        super.attachScreen(screen);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }

    public void cellRecipePressed(){

    }

    public void getRecipes(){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                recipesInteractor.getRecipes();
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
                screen.showRecipes(event.getRecipes());
            }
        }
    }
}
