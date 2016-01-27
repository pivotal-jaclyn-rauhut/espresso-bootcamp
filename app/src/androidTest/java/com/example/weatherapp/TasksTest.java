package com.example.weatherapp;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.weatherapp.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class TasksTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

//    @Test
//    public void task0() {
//        SystemClock.sleep(1000);
//    }

//    @Test
//    public void task1() {
//        openActionBarOverflowOrOptionsMenu( getInstrumentation().getTargetContext());
//        onView(withText(R.string.action_settings)).perform(click());
//        onView(withText(R.string.preference_title)).check(matches(withText("Forecast Preference")));
//    }

    @Test
    public void task2() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());
        onView(withText(R.string.preference_zip_title)).perform(click());
        onView(withText(R.string.preference_zip_default)).perform(replaceText("Waterloo"));
        onView(withText("OK")).perform(click());
        onView(withText(R.string.action_settings)).perform(click());
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());
        onView(withText(R.string.preference_zip_title)).perform(click());
        onView(withText("Waterloo")).check(matches(withText("Waterloo")));
    }


}