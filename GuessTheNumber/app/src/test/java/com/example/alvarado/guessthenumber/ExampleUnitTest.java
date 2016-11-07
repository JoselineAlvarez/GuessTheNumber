package com.example.alvarado.guessthenumber;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertFalse;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void random_number_is_in_range() {
        Random randy = new Random();
        for (int i = 0; i <= 1000; i++) {
            int value =  randy.nextInt(MainActivity.RandomNumberRange.MAX.getValue()) + MainActivity.RandomNumberRange.MIN.getValue();
            assertFalse("value is " + value, value == 0);
            assertFalse("value is " + value, value > 1000);
        }
    }
}