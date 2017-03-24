package com.example.mobsoft.cookbook;

import android.app.Application;

import com.example.mobsoft.cookbook.ui.UIModule;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class MobSoftApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}
