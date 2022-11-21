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


}