package com.example.mobsoft.cookbook.ui.main;

import com.example.mobsoft.cookbook.ui.Presenter;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class MainPresenter extends Presenter<MainScreen> {
    private static MainPresenter instance = null;

    private MainPresenter() {
    }

    public static MainPresenter getInstance() {
        if (instance == null) {
            instance = new MainPresenter();
        }
        return instance;
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
