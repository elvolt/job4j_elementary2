package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.Month;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan Ivanovich");
        student.setGroup(1234);
        student.setDateOfAdmission(LocalDate.of(2013, Month.SEPTEMBER, 2));
        System.out.println(
                "Student: " + student.getName()
                + ", group: " + student.getGroup()
                + ", date: " + student.getDateOfAdmission()
        );
    }
}
