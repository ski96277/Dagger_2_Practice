package com.example.dagger2basicpractice;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEnginModule {
    @Provides
    Engine providerEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }

}
