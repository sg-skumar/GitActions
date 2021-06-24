package com.example.demo;

import dagger.Component;
//jsr 330 we don't have to change these annotation when we switch to other dependency injection framework
@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
