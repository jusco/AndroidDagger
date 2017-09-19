package android.tokainum.baseproject.di;

import android.tokainum.baseproject.application.BaseApplication;
import android.tokainum.baseproject.model.CoffeeMaker;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Justin on 9/17/2017.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, BaseApplicationModule.class, BaseActivityModule.class, BaseFragmentModule.class})
public interface BaseApplicationComponent {
    CoffeeMaker maker();
    void inject(BaseApplication application);
}
