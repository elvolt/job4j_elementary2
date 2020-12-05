package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class FitTest {
    @Test
    public void whenHeight200ManWeight115() {
        short height = 200;
        double expected = 115;
        double result = Fit.manWeight(height);
        assertEquals(expected, result, 0.1);
    }

    @Test
    public void whenHeight190WomanWeight92() {
        short height = 190;
        double expected = 92;
        double result = Fit.womanWeight(height);
        assertEquals(expected, result, 0.1);
    }
}