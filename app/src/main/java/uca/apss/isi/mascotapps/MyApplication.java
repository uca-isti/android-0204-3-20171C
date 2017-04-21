package uca.apss.isi.mascotapps;

import android.app.Application;

import com.tumblr.remember.Remember;

import io.realm.Realm;

/**
 * Created by usuario on 7/4/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Remember.init(getApplicationContext(), getApplicationContext().getPackageName());

        Realm.init(this);

    }
}
