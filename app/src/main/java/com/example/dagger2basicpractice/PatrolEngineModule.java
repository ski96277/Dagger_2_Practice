package com.example.dagger2basicpractice;

import dagger.Module;
import dagger.Provides;

@Module
public class PatrolEngineModule {
    @Provides
    Engine providerEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
}
