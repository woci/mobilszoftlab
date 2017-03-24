package com.example.mobsoft.cookbook;

import com.example.mobsoft.cookbook.ui.BaseActivity;
import com.example.mobsoft.cookbook.ui.UIModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mobsoft on 2017. 03. 24..
 */

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(BaseActivity mainActivity);

}
