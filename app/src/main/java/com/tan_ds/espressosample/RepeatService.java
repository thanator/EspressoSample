package com.tan_ds.espressosample;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**
 * Created by Tan-DS on 6/20/2017.
 */

public class RepeatService extends IntentService {

    public RepeatService(String name) {
        super(RepeatService.class.getName());
    }

    public static final String INTENT_REPEAT = "com.sqisland.espresso.idling_resource.intent_service.REPEAT";
    public static final String KEY_INPUT = "input";
    public static final String KEY_OUTPUT = "output";

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        SystemClock.sleep(1000);

        String query = intent.getStringExtra(KEY_INPUT);

    }
}
