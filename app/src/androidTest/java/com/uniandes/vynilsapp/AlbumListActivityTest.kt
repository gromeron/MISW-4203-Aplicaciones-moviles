package com.uniandes.vynilsapp

import android.os.SystemClock
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class AlbumListActivityTest {

    @get:Rule
    var activityRule = ActivityTestRule(AlbumListActivity::class.java)

    @Test
    fun checkTitleIsAlbums() {
        onView(withText("Albums")).check(matches(isDisplayed()))
    }

    @Test
    fun openFirstItemAfterApiCall() {
        SystemClock.sleep(2000);
        onView(withId(R.id.albumsView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<ViewHolder>(0, click()));
    }

}