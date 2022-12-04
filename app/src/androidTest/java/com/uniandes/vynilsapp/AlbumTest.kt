package com.uniandes.vynilsapp

import android.widget.DatePicker
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario.ActivityAction
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.PickerActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.UiDevice
import com.uniandes.vynilsapp.view.album.AlbumListActivity
import junit.framework.Assert.assertTrue
import org.hamcrest.Matchers
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
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .check(matches(isEnabled()));
    }

    @Test
    fun checkBtCollectorsIsClickable() {
        Thread.sleep(timeoutInicial);
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
        Thread.sleep(timeoutInicial);
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
        Thread.sleep(timeoutInicial);
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
        Thread.sleep(timeoutInicial);
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
        Thread.sleep(timeoutInicial);
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
        Thread.sleep(timeoutInicial);
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
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_album_name), isClickable()));
    }

    @Test
    fun findAllByAlbumNameAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_album_name), isEnabled()));
    }

    @Test
    fun findAllByAlbumNameAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_album_name), isDisplayed()));
    }

    @Test
    fun findAllByAlbumGeneroAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_album_genre), isClickable()));
    }

    @Test
    fun findAllByAlbumGeneroAllEnabled() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_album_genre), isEnabled()));
    }

    @Test
    fun findAllByAlbumGeneroAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.tv_album_genre), isDisplayed()));
    }

    @Test
    fun findAllByAlbumIconAllClickable() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_album_icon), isClickable()));
    }

    @Test
    fun findAllByAlbumIconAllEnable() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_album_icon), isEnabled()));
    }

    @Test
    fun findAllByAlbumIconAllDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.iv_album_icon), isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildCoverImage() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.iv_album_cover))));
    }

    @Test
    fun checkDetailCoverImageIsEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.iv_album_cover)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailCoverImageIsDisplayed() {
        Thread.sleep(timeoutInicial);
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.iv_album_cover)).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildNameDate() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_name))));
    }

    @Test
    fun checkDetailNameIsEnabled() {
        Thread.sleep(timeoutInicial);
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_name)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailNameIsDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_name)).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildRealeaseDate() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_release))));
    }

    @Test
    fun checkDetailRealeaseDateIsEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_release)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailRealeaseDateIsDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_release)).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildDescription() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_description))));
    }

    @Test
    fun checkDetailDescriptionEnabled() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_description)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailDescriptionDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_description)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildGenre() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_genre))));
    }

    @Test
    fun checkDetailGenreEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_genre)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailGenreDisplayed() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_genre)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    fun checkIffAllParentHaveChildRecordLabel() {
        Thread.sleep(timeoutInicial);
        onView(allOf(withId(R.id.recycler_album), withChild(withId(R.id.tv_album_recordlabel))));
    }

    @Test
    fun checkDetailRecordLabelEnabled() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_recordlabel)).check(matches(isEnabled()));
    }

    @Test
    fun checkDetailRecordLabelNotDisplayedInit() {
        Thread.sleep(timeoutDisplay);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_recordlabel)).check(matches(not(isDisplayed())));
    }

    @Test
    fun checkDetailRecordLabelDisplayed() {
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.recycler_album))
            .perform(swipeDown(), click())
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.tv_album_recordlabel)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    fun checkButtonCreateAlbumDisplayed() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.check(matches(isDisplayed()))
    }

    @Test
    fun checkButtonCreateAlbumIsClickable() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.check(matches(isClickable()))
    }

    @Test
    fun checkFormCreateAlbumNameDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.tilName)
            ).check(matches(isDisplayed()))
    }

    @Test
    fun checkFormCreateAlbumNameisEnabled() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.tilName)
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkFormCreateAlbumTypingNameAndDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.nameAlbum)).perform(typeText("nombre"), closeSoftKeyboard());

        val editText = onView(
            allOf(
                withId(R.id.nameAlbum), withText("nombre"),
                withParent(withParent(withId(R.id.tilName))),
                isDisplayed()
            )
        )
        editText.check(matches(withText("nombre")))
    }

    @Test
    fun checkFormCreateAlbumCoverUrlDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.tilCover)
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkFormCreateAlbumCoverUrlisEnabled() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.tilCover)
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkFormCreateAlbumTypingCoverUrlAndDisplay() {

        val coverUrlLink = "https://www.discogs.com/release/10412583-Arctic-Monkeys-Covers-Through-The-Years/image/SW1hZ2U6Mjg5MDgzNjg="
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.coverAlbum)).perform(typeText(coverUrlLink), closeSoftKeyboard());

        val editText = onView(
            allOf(
                withId(R.id.coverAlbum), withText(coverUrlLink),
                withParent(withParent(withId(R.id.tilCover))),
                isDisplayed()
            )
        )
        editText.check(matches(withText(coverUrlLink)))
    }

    @Test
    fun checkFormCreateAlbumReleaseDateisDisplayed() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.releaseDateAlbum)
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkFormCreateAlbumReleaseDateisEnabled() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.releaseDateAlbum)
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkFormCreateAlbumReleaseDateisClickable() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.releaseDateAlbum)
        ).check(matches(isClickable()))
    }

    @Test
    fun checkFormCreateAlbumSelectReleaseDate() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.releaseDateAlbum)
        ).perform(click());
    }

    @Test
    fun checkFormCreateAlbumDescriptionDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.tilDescription)
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkFormCreateAlbumDescriptionisEnabled() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.tilDescription)
        ).check(matches(isEnabled()))
    }

    @Test
    fun checkFormCreateAlbumTypingDescriptionAndDisplay() {

        val descriptionText = "este es uno de los mejores albumes de la historia"
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView(withId(R.id.descriptionAlbum)).perform(typeText(descriptionText), closeSoftKeyboard());

        val editText = onView(
            allOf(
                withId(R.id.descriptionAlbum), withText(descriptionText),
                withParent(withParent(withId(R.id.tilDescription))),
                isDisplayed()
            )
        )
        editText.check(matches(withText(descriptionText)))
    }

    @Test
    fun checkFormCreateAlbumGeneroDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.genreAlbum)
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkFormCreateAlbumGeneroisClickable() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.genreAlbum)
        ).check(matches(isClickable()))
    }

    @Test
    fun checkFormCreateAlbumSelectGeneroAndDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.genreAlbum)
        ).perform(click());
        onView(withText("Salsa")).perform(scrollTo(), click()).check(matches(isDisplayed()));
    }

    @Test
    fun checkFormCreateAlbumRecordedLabelDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.labelAlbum)
        ).check(matches(isDisplayed()))
    }

    @Test
    fun checkFormCreateAlbumRecordedLabelisClickable() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.labelAlbum)
        ).check(matches(isClickable()))
    }

    @Test
    fun checkFormCreateAlbumSelectRecordedLabelAndDisplay() {
        val imageButton = onView(
            allOf(
                withId(R.id.buttonCreateAlbum), withContentDescription("Button to add a new album"),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.FrameLayout::class.java))),
                isDisplayed()
            )
        )
        imageButton.perform(click());
        Thread.sleep(timeoutInicial);
        onView( withId(R.id.labelAlbum)
        ).perform(click());
        onView(withText("Sony Music")).perform(scrollTo(), click()).check(matches(isDisplayed()));
    }

}