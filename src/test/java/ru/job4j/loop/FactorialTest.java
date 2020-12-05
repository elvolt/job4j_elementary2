package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialFor5Then120() {
        assertEquals(120, Factorial.calc(5));
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        assertEquals(1, Factorial.calc(0));
    }
}