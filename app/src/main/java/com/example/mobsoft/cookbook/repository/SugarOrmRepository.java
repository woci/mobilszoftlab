package com.example.mobsoft.cookbook.repository;

import android.content.Context;

import com.example.mobsoft.cookbook.model.Recipe;
import com.orm.SugarContext;

import java.util.List;

/**
 * Created by woci on 2017. 04. 07..
 */

public class SugarOrmRepository implements Repository {
    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {

    }

    @Override
    public List<Recipe> getRecipes() {
        return null;
    }

    @Override
    public void saveRecipe(Recipe recipe) {

    }

    @Override
    public void uploadRecipes(List<Recipe> recipes) {

    }
}
