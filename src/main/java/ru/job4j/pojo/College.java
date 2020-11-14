package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup(13135);
        student.setAdmission(new Date());

        System.out.println(student.getFio() + ", "
                + student.getGroup() + ", " + student.getAdmission());
    }
}
