package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double result = point1.distance(point2);
        assertEquals(expected, result, 0.01);
    }
}