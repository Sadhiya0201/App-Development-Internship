package com.example.advancedfeaturesapp2

@RunWith(AndroidJUnit4::class)
class AuthActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(AuthActivity::class.java)

    @Test
    fun testLoginButtonVisible() {
        onView(withId(R.id.btnLogin)).check(matches(isDisplayed()))
    }

    @Test
    fun testEmailAndPasswordFieldsVisible() {
        onView(withId(R.id.etEmail)).check(matches(isDisplayed()))
        onView(withId(R.id.etPassword)).check(matches(isDisplayed()))
    }
}