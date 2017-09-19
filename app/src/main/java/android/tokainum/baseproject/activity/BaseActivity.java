package android.tokainum.baseproject.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by Justin on 9/17/2017.
 */

public class BaseActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        configureInjection();
        super.onCreate(savedInstanceState);
    }

    private void configureInjection() {
        AndroidInjection.inject(this);
    }

    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }

}
