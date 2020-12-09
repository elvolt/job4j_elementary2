package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2.0;
        double result = point1.distance(point2);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenIn3dPoint1NotEqualsPoint2ThenMoreThanZero() {
        Point point1 = new Point(1, 4, 2);
        Point point2 = new Point(2, -1, 5);
        double expected = 5.92;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}