package org.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void testSum() {
        Assert.assertEquals(Sum.sum(2,3), 5);
    }
}
