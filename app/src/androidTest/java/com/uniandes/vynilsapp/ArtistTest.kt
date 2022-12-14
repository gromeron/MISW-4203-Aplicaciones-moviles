package com.uniandes.vynilsapp

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.uniandes.vynilsapp.view.artist.ArtistListActivity
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
class ArtistTest {

    @get:Rule
    var activityRule = ActivityTestRule(ArtistListActivity::class.java)

    val timeout : Long = 500;
    val timeoutInicial : Long = 1000;
    val timeoutDisplay : Long = 2000;

    @Test
    fun findByIdArtistListViewIsDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_artist))
            .check(matches(isDisplayed()));
    }

    @Test
    fun findByIdArtistListViewIsEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .check(matches(isEnabled()));
    }

    @Test
    fun checkBtAlbumsIsClickable() {
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.bt_albums), withText("ALBUMS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isClickable()))
    }

    @Test
    fun checkBtAlbumsIsEnabled() {
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.bt_albums), withText("ALBUMS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkBtAlbumsIsDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.bt_albums), withText("ALBUMS"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun findAllByArtistIconAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_artist_icon), isClickable()));
    }

    @Test
    fun findAllByArtistIconAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_artist_icon), isEnabled()));
    }

    @Test
    fun findAllByArtistIconAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_artist_icon), isDisplayed()));
    }

    @Test
    fun findAllByArtistNameAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_name), isClickable()));
    }

    @Test
    fun findAllByArtistNameAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_name), isEnabled()));
    }

    @Test
    fun findAllByArtistNameAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_name), isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildArtistImg() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_artist), withChild(withId(R.id.iv_artist_image))));
    }

    @Test
    fun findAllDetailByArtistImgAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_artist_image), isClickable()));
    }

    @Test
    fun findAllDetailByArtistImgAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_artist_image), isEnabled()));
    }

    @Test
    fun findAllDetailByArtistImgAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_artist_image), isDisplayed()));
    }

    //
    @Test
    fun checkIffAllParentHaveChildArtistName() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_artist), withChild(withId(R.id.tv_artist_name))));
    }

    @Test
    fun findAllDetailByArtistNameAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_name), isClickable()));
    }

    @Test
    fun findAllDetailByArtistNameAllEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_name), isEnabled()));
    }

    @Test
    fun findAllDetailByArtistNameAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        onView(allOf(withId(R.id.tv_artist_name), isDisplayed()));
    }

    //
    @Test
    fun checkIffAllParentHaveChildArtistDescription() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_artist), withChild(withId(R.id.tv_artist_description))));
    }

    @Test
    fun findAllDetailByArtistDescriptionAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_description), isClickable()));
    }

    @Test
    fun findAllDetailByArtistDescriptionAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_description), isEnabled()));
    }

    @Test
    fun findAllDetailByArtistDescriptionAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_description), isDisplayed()));
    }

    //
    @Test
    fun checkIffAllParentHaveChildArtistBirthdate() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_artist), withChild(withId(R.id.tv_artist_birthdate))));
    }

    @Test
    fun findAllDetailByArtistBirthdateAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_birthdate), isClickable()));
    }

    @Test
    fun findAllDetailByArtistBirthdateAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_artist_birthdate), isEnabled()));
    }

    @Test
    fun checkDetailArtistBirthdateDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_artist_birthdate)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    fun checkTitleArtistDescriptionDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_artist_description_title), withText("Descripci??n"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkTitleArtistBirthdateDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_artist))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()));
        Thread.sleep(timeoutInicial);
        onView(
            allOf(withId(R.id.tv_artist_birthdate_title), withText("Fecha de nacimiento"))
        ).perform(scrollTo()).check(matches(isDisplayed()))
    }

}