package com.example.android.smartWeather.app.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class SmartWeatherAuthenticatorService extends Service {
     private SmartWeatherAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
         mAuthenticator = new SmartWeatherAuthenticator(this);
    }


    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
