package com.example.weatherapp;

import android.os.SystemClock;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.weatherapp.activities.MainActivity;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.object.HasToString.hasToString;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class TasksTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Ignore
    public void task0() {
        SystemClock.sleep(1000);
    }

    @Ignore
    public void task1() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());
        onView(withText(R.string.preference_title)).check(matches(withText("Forecast Preference")));
    }

    @Ignore
    public void task2() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());
        onView(withText(R.string.preference_zip_title)).perform(click());
        onView(withText(R.string.preference_zip_default)).perform(replaceText("Waterloo"));
        onView(withText("OK")).perform(click());
        onView(withText("Waterloo")).check(matches(withText("Waterloo")));
    }


    @Ignore
    public void task3() {
        onView(withText("Tomorrow")).perform(swipeUp());
        onView(withId(R.id.snackbar_text)).check(matches(isDisplayed()));
    }


    @Ignore
    public void task4() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());
        onView(withText("Temperature Units")).perform(click());
        onData(hasToString("Imperial")).perform(click());
    }


    @Test
    public void task5() {
        onView(withId(R.id.recyclerview_forecast)).perform(RecyclerViewActions.actionOnItemAtPosition(6, click()));
    }
}