package android.tokainum.baseproject.di;

import android.tokainum.baseproject.activity.BaseActivity;
import android.tokainum.baseproject.activity.ItemDetailActivity;
import android.tokainum.baseproject.activity.ItemListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Justin on 9/17/2017.
 */

@Module
public abstract class BaseActivityModule {

    @ContributesAndroidInjector()
    abstract BaseActivity contributeBaseActivityInjector();

    @ContributesAndroidInjector()
    abstract ItemListActivity contributeItemListActivityInjector();

    @ContributesAndroidInjector()
    abstract ItemDetailActivity contributeItemDetailActivityInjector();
}
