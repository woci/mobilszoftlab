package com.example.mobsoft.cookbook.ui;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class Presenter<S> {
    S screen;

    public void attachScreen(S screen) {
        this.screen = screen;
    }

    public void detachScreen() {
       this.screen = null;
    }
}
