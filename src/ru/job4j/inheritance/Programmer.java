package ru.job4j.inheritance;

public class Programmer extends Engineer {
    public boolean refactorCode(Program program) {
        program.getSpec();
        return program.isExecute();
    }
}
