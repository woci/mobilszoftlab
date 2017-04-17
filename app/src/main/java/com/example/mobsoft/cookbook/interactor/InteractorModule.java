package com.example.mobsoft.cookbook.interactor;

import com.example.mobsoft.cookbook.interactor.recipes.RecipesInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by woci on 2017. 04. 07..
 */
@Module
public class InteractorModule {
    @Provides
    public RecipesInteractor provideFavourites() {
        return new RecipesInteractor();
    }
}
