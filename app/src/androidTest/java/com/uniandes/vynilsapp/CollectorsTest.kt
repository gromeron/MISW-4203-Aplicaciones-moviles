package com.uniandes.vynilsapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.uniandes.vynilsapp.view.collector.CollectorListActivity
import org.hamcrest.Matchers.allOf
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
class CollectorsTest {

    @get:Rule
    var activityRule = ActivityTestRule(CollectorListActivity::class.java)

    val timeout : Long = 500;
    val timeoutInicial : Long = 1500;
    val timeoutDisplay : Long = 2500;

    @Test
    fun findByIdCollectorListViewIsDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .check(matches(isDisplayed()));
    }

    @Test
    fun findByIdCollectorListViewIsEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_collector))
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
    fun findAllByCollectorNameAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_collector_name), isClickable()));
    }

    @Test
    fun findAllByCollectorNameAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_collector_name), isEnabled()));
    }

    @Test
    fun findAllByCollectorNameAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_collector_name), isDisplayed()));
    }

    @Test
    fun checkCollectorDetailNameTitleDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_name_title), withText("Coleccionista"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailNameTitleEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_name_title), withText("Coleccionista"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailNameDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_collector_name)).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailNameEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_collector_name)).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailTelephoneTitleDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_telephone_title), withText("Número telefónico"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailTelephoneTitleEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_telephone_title), withText("Número telefónico"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailTelephoneDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_collector_telephone)).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailTelephoneEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_collector_telephone)).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailEmailTitleDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_email_title), withText("email"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailEmailTitleEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_email_title), withText("email"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailEmailDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_collector_email)).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailEmailEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_collector_email)).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailCommentTitleDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_comments_title), withText("Comentarios"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailCommentTitleEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_comments_title), withText("Comentarios"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailArtistasPreferidosTitleDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_favoriteperformers_title), withText("Artistas Preferidos"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailArtistasPreferidosTitleEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_favoriteperformers_title), withText("Artistas Preferidos"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkCollectorDetailAlbumesPreferidosTitleDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_albums_title), withText("Albumes del coleccionista"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkCollectorDetailAlbumesPreferidosTitleEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_collector))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(
            allOf(
                withId(R.id.tv_collector_albums_title), withText("Albumes del coleccionista"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        ).check(matches(isEnabled()))
    }

}