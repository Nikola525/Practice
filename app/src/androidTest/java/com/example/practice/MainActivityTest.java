package com.example.practice;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import android.support.test.espresso.Espresso;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
       mainActivity = mainActivityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG", "onCreate()");
    }

    @Test
    public void onCreate1() {
        Log.d("TAG", "onCreate()");
    }

    @Test
    public void btn_click() {
        Log.d("TAG", "btn was clicked.");
        Espresso.onView(withId(R.id.edt_Text)).perform(typeText("Hello."), closeSoftKeyboard());
        onView(withId(R.id.edt_Text)).check(matches(withText("Hello.")));
        mainActivity.findViewById(R.id.invoke);
        Espresso.onView(withId(R.id.invoke)).perform(click());

    }
}