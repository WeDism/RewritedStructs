package com.wedin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;

public class MyArrayListTest {

    private MyArrayList<Integer> integers;

    @Before
    public void setUp() throws Exception {
        integers = new MyArrayList<>(1, 2, 4);
    }

    @Test
    public void addInMiddleStruct() {
        integers.add(2, 3);
        Assert.assertThat(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), is(integers));
    }
}
