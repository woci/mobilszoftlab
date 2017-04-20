package com.example.mobsoft.cookbook;

import android.app.Application;

import com.example.mobsoft.cookbook.repository.Repository;
import com.example.mobsoft.cookbook.ui.UIModule;

import javax.inject.Inject;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

public class MobSoftApplication extends Application {

    @Inject
    Repository repository;

    public static MobSoftApplicationComponent injector;

    public void setInjector(MobSoftApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

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
