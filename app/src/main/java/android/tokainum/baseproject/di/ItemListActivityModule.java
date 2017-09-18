package android.tokainum.baseproject.di;

import android.app.Activity;
import android.tokainum.baseproject.activity.BaseActivity;
import android.tokainum.baseproject.activity.ItemListActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Justin on 9/17/2017.
 */

@Module
public abstract class ItemListActivityModule {

    @ContributesAndroidInjector()
    abstract ItemListActivity contributeItemListActivityInjector();

}
