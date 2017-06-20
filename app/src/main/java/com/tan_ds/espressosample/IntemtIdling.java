package com.tan_ds.espressosample;

import android.app.ActivityManager;
import android.content.Context;
import android.support.test.espresso.IdlingResource;

/**
 * Created by Tan-DS on 6/20/2017.
 */

public class IntemtIdling implements IdlingResource {


    private final Context context;

    public IntemtIdling(Context context){
        this.context = context;
    }

    @Override
    public String getName() {
        return IntemtIdling.class.getName();
    }

    @Override
    public boolean isIdleNow() {
        boolean idle = !isIntentServiceRunning();
        return false;
    }

    @Override
    public void registerIdleTransitionCallback(ResourceCallback callback) {

    }

    private boolean isIntentServiceRunning(){

        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo info: manager.getRunningServices(Integer.MAX_VALUE)){
           // if (RepeatService)
                return  true;
        }

        return false;
    }

}
