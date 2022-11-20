package com.uniandes.vynilsapp

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.uniandes.vynilsapp.view.album.AlbumListActivity
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.not
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class AlbumTest {

    @get:Rule
    var activityRule = ActivityTestRule(AlbumListActivity::class.java)

    val timeout : Long = 500;
    val timeoutInicial : Long = 1500;
    val timeoutDisplay : Long = 2500;

    @Test
    fun findByIdAlbumViewIsDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .check(matches(isDisplayed()));
    }

    @Test
    fun findByIdAlbumViewIsEnabled() {
        Thread.sleep(timeout);
        onView(withId(R.id.recycler_album))
            .check(matches(isEnabled()));
    }

    @Test
    fun checkBtCollectorsIsClickable() {
        Thread.sleep(timeout);
        onView(
            allOf(
                withId(R.id.bt_collectors), withText("COLLECTORS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isClickable()))
    }

    @Test
    fun checkBtCollectorsIsEnabled() {
        Thread.sleep(timeout);
        onView(
            allOf(
                withId(R.id.bt_collectors), withText("COLLECTORS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkBtCollectorsIsDisplayed() {
        Thread.sleep(timeout);
        onView(
            allOf(
                withId(R.id.bt_collectors), withText("COLLECTORS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }


    @Test
    fun checkBtArtistIsClickable() {
        Thread.sleep(timeout);
        onView(
            allOf(
                withId(R.id.bt_artists), withText("ARTISTS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isClickable()))
    }

    @Test
    fun checkBtArtistIsEnabled() {
        Thread.sleep(timeout);
        onView(
            allOf(
                withId(R.id.bt_artists), withText("ARTISTS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkBtArtistIsDisplayed() {
        Thread.sleep(timeout);
        onView(
            allOf(
                withId(R.id.bt_artists), withText("ARTISTS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun findByIdAlbumViewSwipeDownAndClick() {
        Thread.sleep(timeoutDisplay);
        Thread.sleep(timeout);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
    }

    @Test
    fun findByIdAlbumViewSwipeDownAndLongClick() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), longClick());
    }

    @Test
    fun findByIdAlbumViewSwipeDownAndDoubleClick() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), doubleClick());
    }

    @Test
    fun findByPosition1() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
    }

    @Test
    fun findByPosition2() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()));
    }

    @Test
    fun findByPosition3() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()));
    }

    @Test
    fun findAllByAlbumNameAllClickable() {
        onView(allOf(withId(R.id.tv_album_name), isClickable()));
    }

    @Test
    fun findAllByAlbumNameAllEnabled() {
        onView(allOf(withId(R.id.tv_album_name), isEnabled()));
    }

    @Test
    fun findAllByAlbumNameAllDisplayed() {
        onView(allOf(withId(R.id.tv_album_name), isDisplayed()));
    }

    @Test
    fun findAllByAlbumGeneroAllClickable() {
        onView(allOf(withId(R.id.tv_album_genre), isClickable()));
    }

    @Test
    fun findAllByAlbumGeneroAllEnabled() {
        onView(allOf(withId(R.id.tv_album_genre), isEnabled()));
    }

    @Test
    fun findAllByAlbumGeneroAllDisplayed() {
        onView(allOf(withId(R.id.tv_album_genre), isDisplayed()));
    }

    @Test
    fun findAllByAlbumIconAllClickable() {
        onView(allOf(withId(R.id.iv_album_icon), isClickable()));
    }

    @Test
    fun findAllByAlbumIconAllEnable() {
        onView(allOf(withId(R.id.iv_album_icon), isEnabled()));
    }

    @Test
    fun findAllByAlbumIconAllDisplayed() {
        onView(allOf(withId(R.id.iv_album_icon), isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildCoverImage() {
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.iv_album_cover))));
    }

    @Test
    fun checkDetailCoverImageIsEnabled() {
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.iv_album_cover)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailCoverImageIsDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.iv_album_cover)).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildNameDate() {
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_name))));
    }

    @Test
    fun checkDetailNameIsEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_name)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailNameIsDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_name)).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildRealeaseDate() {
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_release))));
    }

    @Test
    fun checkDetailRealeaseDateIsEnabled() {
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_release)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailRealeaseDateIsDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_release)).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildDescription() {
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_description))));
    }

    @Test
    fun checkDetailDescriptionEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_description)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailDescriptionNotDisplayedInit() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())

        onView(withId(R.id.tv_album_description)).check(matches(not(isDisplayed())));
    }

    @Test
    fun checkDetailDescriptionDisplayed() {
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())

        onView(withId(R.id.tv_album_description)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildGenre() {
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_genre))));
    }

    @Test
    fun checkDetailGenreEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_genre)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailGenreNotDisplayedInit() {
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())

        onView(withId(R.id.tv_album_genre)).check(matches(not(isDisplayed())));
    }

    @Test
    fun checkDetailGenreDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())

        onView(withId(R.id.tv_album_genre)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildRecordLabel() {
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_recordlabel))));
    }

    @Test
    fun checkDetailRecordLabelEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());

        onView(withId(R.id.tv_album_recordlabel)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailRecordLabelNotDisplayedInit() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())

        onView(withId(R.id.tv_album_recordlabel)).check(matches(not(isDisplayed())));
    }

    @Test
    fun checkDetailRecordLabelDisplayed() {
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())

        onView(withId(R.id.tv_album_recordlabel)).perform(scrollTo()).check(matches(isDisplayed()));
    }


}