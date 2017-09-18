package android.tokainum.baseproject.application;

import android.app.Activity;
import android.app.Application;
import android.tokainum.baseproject.activity.BaseActivity;
import android.tokainum.baseproject.di.DaggerCoffeeShop;
import android.tokainum.baseproject.model.CoffeeMaker;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Justin on 9/17/2017.
 */

public class BaseApplication extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerCoffeeShop.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
