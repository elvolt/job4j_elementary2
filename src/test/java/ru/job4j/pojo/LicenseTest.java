package ru.job4j.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertEquals(first, second);
    }
}