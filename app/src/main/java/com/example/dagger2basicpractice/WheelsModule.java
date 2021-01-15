package com.example.dagger2basicpractice;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    static  Rims providerRims(){
        return  new Rims();
    }
    @Provides
    static Tires providerTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    static Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }
}
