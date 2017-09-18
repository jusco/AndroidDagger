package android.tokainum.baseproject.di;

import android.support.v4.app.Fragment;
import android.tokainum.baseproject.activity.ItemListActivity;
import android.tokainum.baseproject.fragment.ItemDetailFragment;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by Justin on 9/17/2017.
 */

//@Module(subcomponents = ItemDetailFragmentSubcomponent.class)
@Module
public abstract class ItemDetailFragmentModule {

//    @Binds
//    @IntoMap
//    @FragmentKey(ItemDetailFragment.class)
//    abstract AndroidInjector.Factory<? extends Fragment> bindItemDetailFragmentInjectorFactory(ItemDetailFragmentSubcomponent.Builder builder);
    @ContributesAndroidInjector()
    abstract ItemDetailFragment contributeItemDetailFragmentInjector();
}
