package android.tokainum.baseproject.model;

import javax.inject.Inject;

/**
 * Created by Justin on 9/17/2017.
 */

public class CoffeeMaker {
    @Inject
    public Heater heater;

    @Inject
    Pump pump;

    @Inject
    CoffeeMaker(){

    }
}
