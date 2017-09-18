package android.tokainum.baseproject.di;

import android.tokainum.baseproject.activity.ItemDetailActivity;
import android.tokainum.baseproject.activity.ItemListActivity;
import android.tokainum.baseproject.fragment.ItemDetailFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Justin on 9/17/2017.
 */

@Module
public abstract class ItemDetailActivityModule {

    @ContributesAndroidInjector()
    abstract ItemDetailActivity contributeItemDetailActivityInjector();
}
