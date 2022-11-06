package com.uniandes.vynilsapp

import android.os.SystemClock
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.allOf
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
    fun findByIdAlbumViewIsDisplayed() {
        onView(withId(R.id.albumsView))
            .check(matches(isDisplayed()));
    }

    @Test
    fun findByIdAlbumViewIsEnabled() {
        onView(withId(R.id.albumsView))
            .check(matches(isEnabled()));
    }

    @Test
    fun findByIdAlbumViewSwipeDownAndClick() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());
    }

    @Test
    fun findByIdAlbumViewSwipeDownAndLongClick() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), longClick());
    }

    @Test
    fun findByIdAlbumViewSwipeDownAndDoubleClick() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), doubleClick());
    }

    @Test
    fun findByContentDescription() {
        onView(withContentDescription(R.id.album_name));
    }

    @Test
    fun findAllByAlbumNameAllClickable() {
        onView(allOf(withId(R.id.album_name), isClickable()));
    }

    @Test
    fun findAllByAlbumNameAllEnabled() {
        onView(allOf(withId(R.id.album_name), isEnabled()));
    }

    @Test
    fun findAllByAlbumDescriptionAllClickable() {
        onView(allOf(withId(R.id.album_description), isClickable()));
    }

    @Test
    fun findAllByAlbumDescriptionAllEnabled() {
        onView(allOf(withId(R.id.album_name), isEnabled()));
    }

    @Test
    fun findAllByAlbumUniAndesNameAllClickable() {
        onView(allOf(withId(com.uniandes.vynilsapp.R.id.album_name), isClickable()));
    }

    @Test
    fun findAllByAlbumUniAndesNameAllEnable() {
        onView(allOf(withId(com.uniandes.vynilsapp.R.id.album_name), isEnabled()));
    }

    @Test
    fun checkIffAllParentHaveChildDetail() {
        onView(allOf(withId(R.id.albumsView), withChild(withId(R.id.album_name))));
    }

    @Test
    fun checkRealeaseDateIsEnabled() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.release_date_text)).check(matches(isEnabled()));
    }

    @Test
    fun checkCoverImageIsEnabled() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.cover_image)).check(matches(isEnabled()));
    }

    @Test
    fun checkCoverImageIsDisplayed() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.cover_image)).check(matches(isDisplayed()));
    }

    @Test
    fun checkGenreTextIsEnabled() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.genre_text)).check(matches(isEnabled()));
    }

    @Test
    fun checkGenreTextIsDisplayed() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.genre_text)).check(matches(isDisplayed()));
    }

    @Test
    fun checkRecordLabelTextIsEnabled() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.record_label_text)).check(matches(isEnabled()));
    }

    @Test
    fun checkRecordLabelTextIsDisplayed() {
        onView(withId(R.id.albumsView))
            .perform(swipeDown(), click());

        onView(withId(R.id.record_label_text)).check(matches(isDisplayed()));
    }

    @Test
    fun openFirstItemAfterApiCall() {
        onView(withId(R.id.albumsView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<ViewHolder>(0, click()));
    }

    @Test
    fun findByTitleIsDisplayed() {
        onView(withText("Albums"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun findByTitleIsEnabled() {
        onView(withText("Albums"))
            .check(matches(isEnabled()))
    }

    @Test
    fun findByTitleSwipeDownAndClick() {
        onView(withText("Albums"))
            .perform(swipeDown(), click())
    }

    @Test
    fun findByTitleSwipeDownAndLongClick() {
        onView(withText("Albums"))
            .perform(swipeDown(), longClick())
    }

    @Test
    fun findByTitleSwipeDownAndDoubleClick() {
        onView(withText("Albums"))
            .perform(swipeDown(), doubleClick())
    }

}