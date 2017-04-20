package com.example.mobsoft.cookbook.model;

import java.util.ArrayList;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class Recipe {
    private Long id = null;
    private String name;
    private ArrayList<String> ingredients;
    private String description;
    private String imageUrl;

    public Recipe(Long id, String name, ArrayList<String> ingredients, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Recipe() {

    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngridients() {
        return ingredients;
    }

    public void setIngridients(ArrayList<String> ingridients) {
        this.ingredients = ingridients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
