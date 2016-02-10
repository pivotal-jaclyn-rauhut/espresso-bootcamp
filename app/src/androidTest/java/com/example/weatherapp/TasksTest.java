package com.example.weatherapp;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.CheckedTextView;
import android.widget.ListView;

import com.example.weatherapp.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasFocus;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class TasksTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    //    @Test
//    public void task0() {
//        SystemClock.sleep(1000);
//    }
//
//    @Test
//    public void task1() {
//        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
//        onView(withText(R.string.action_settings)).perform(click());
//        onView(withText(R.string.preference_title)).check(matches(withText("Forecast Preference")));
//    }

//    @Test
//    public void task2() {
//        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
//        onView(withText(R.string.action_settings)).perform(click());
//        onView(withText(R.string.preference_zip_title)).perform(click());
//        onView(withText(R.string.preference_zip_default)).perform(replaceText("Waterloo"));
//        onView(withText("OK")).perform(click());
//        onView(withText("Waterloo")).check(matches(withText("Waterloo")));
//    }
//}

//    @Test
//    public void task3() {
//        onView(withText("Tomorrow")).perform(swipeUp());
//        onView(withId(R.id.snackbar_text)).check(matches(isDisplayed()));
//    }
//}


    @Test
    public void task4() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());
        onView(withText("Temperature Units")).perform(click());
        onData(hasToString("Imperial")).perform(click());
    }
}
