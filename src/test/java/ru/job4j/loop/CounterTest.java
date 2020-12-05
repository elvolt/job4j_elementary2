package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void testSum() {
        assertEquals(15, Counter.sum(1, 5));
    }

    @Test
    public void testSumByEven() {
        assertEquals(30, Counter.sumByEven(1, 10));
    }
}