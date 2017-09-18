package android.tokainum.baseproject.di;

import android.tokainum.baseproject.model.ElectricHeater;
import android.tokainum.baseproject.model.Heater;
import android.tokainum.baseproject.model.Pump;
import android.tokainum.baseproject.model.Thermosiphon;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Justin on 9/17/2017.
 */

@Module
public class DripCoffeeModule {

    @Singleton
    @Provides
    static Heater providesHeater() {
        return new ElectricHeater();
    }

    @Singleton @Provides
    static Pump providesPump(Thermosiphon pump) {
        return pump;
    }
}
