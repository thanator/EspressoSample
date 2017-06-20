package com.tan_ds.espressosample;

import android.content.Intent;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.intent.Intents.intended;

/**
 * Created by Tan-DS on 6/20/2017.
 */

public class MainActUiTest {


    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void MainActivityTest(){
        onView(withText(R.string.hello_world)).check(matches(withText(R.string.hello_world)));
    }


    @Test
    public void ButtonPressedTest(){
        onView(withId(R.id.button_id)).perform(click()).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_id)).check(matches(withText(R.string.hell_world)));
    }

    @Test
    public void TestIntentEspresso(){
        Intents.init();
        rule.launchActivity(new Intent());
        onView(withId(R.id.button_new_intent)).perform(click());
        intended(hasComponent(MainActivity.class.getName()));
        Intents.release();

    }
    @Ignore
    @Test
    public void TestIdlingEspresso(){
       // onView(withId(R.id.idling_done)).check(matches())
    }

}
