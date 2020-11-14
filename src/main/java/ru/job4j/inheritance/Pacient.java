package ru.job4j.inheritance;

public class Pacient {
    private String name;
    private String surname;
    private String birthday;
    private boolean isSick;
    private Diagnosis diagnosis;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean isSick() {
        return isSick;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
