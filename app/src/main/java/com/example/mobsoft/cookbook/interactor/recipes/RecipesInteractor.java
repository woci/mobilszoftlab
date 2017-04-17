package com.example.mobsoft.cookbook.interactor.recipes;

import com.example.mobsoft.cookbook.repository.Repository;
import com.google.common.eventbus.EventBus;

import javax.inject.Inject;

/**
 * Created by woci on 2017. 04. 17..
 */

public class RecipesInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;
}
