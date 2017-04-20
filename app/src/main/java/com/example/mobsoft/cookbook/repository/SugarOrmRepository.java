package com.example.mobsoft.cookbook.repository;

import android.content.Context;

import com.example.mobsoft.cookbook.model.Recipe;
import com.orm.SugarContext;
import com.orm.SugarRecord;

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
        SugarContext.terminate();
    }

    @Override
    public List<Recipe> getRecipes() {
        return SugarRecord.listAll(Recipe.class);
    }

    @Override
    public void saveRecipe(Recipe recipe) {
        recipe.setId(getNextMinId());
        SugarRecord.saveInTx(recipe);
    }

    @Override
    public Recipe getRecipe(Integer id){
        return SugarRecord.findById(Recipe.class, id);
    }

    @Override
    public Long getNextMinId(){
        List<Recipe> recipes = SugarRecord.findWithQuery(Recipe.class, "SELECT * FROM Recipe ORDER BY id", null);
        if (recipes.size() == 0) {
            return new Long(-1);
        }else{
            return new Long(recipes.get(0).getId() - 1);
        }
    }

    @Override
    public void updateRecipe(Recipe recipe) {
        SugarRecord.saveInTx(recipe);
    }

    public void removeRecipe(Recipe recipe){
        SugarRecord.deleteInTx(recipe);
    }
}
