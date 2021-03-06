package com.stripe.android.view;

import android.os.Build;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
public class ShippingMethodViewJellyBeanTest {

    @Test
    public void testConstructor() {
        new ShippingMethodView(ApplicationProvider.getApplicationContext());
    }
}
