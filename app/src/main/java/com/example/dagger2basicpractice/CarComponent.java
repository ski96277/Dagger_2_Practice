package com.example.dagger2basicpractice;

import dagger.Component;

@Component  (modules = {WheelsModule.class,DieselEnginModule.class})
public interface CarComponent {
     Car getCar();
    void inject(MainActivity mainActivity);
}
