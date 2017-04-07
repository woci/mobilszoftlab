package com.example.mobsoft.cookbook.repository;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by woci on 2017. 04. 07..
 */

public class RepositoryModule {
    @Singleton
    @Provides
    public Repository provideRepository() {
        return new SugarOrmRepository();
    }
}
