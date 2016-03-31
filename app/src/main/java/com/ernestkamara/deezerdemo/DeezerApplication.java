package com.ernestkamara.deezerdemo;

import android.app.Application;

import com.deezer.sdk.network.connect.DeezerConnect;

import java.util.ArrayList;

/**
 * @author Ernest Saidu Kamara
 * @since 31/03/16.
 */
public class DeezerApplication extends Application {
    protected DeezerConnect mDeezerConnect;

    @Override
    public void onCreate() {
        super.onCreate();
        mDeezerConnect = new DeezerConnect(this, getString(R.string.deezer_app_id));
    }

    public DeezerConnect getDeezerConnect() {
        return mDeezerConnect;
    }
}
