package ru.job4j.inheritance;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private LocalDateTime executionTime;
    private boolean isExecute;
    private Specification spec;

    public String getName() {
        return name;
    }

    public LocalDateTime getExecutionTime() {
        return executionTime;
    }

    public boolean isExecute() {
        return isExecute;
    }

    public Specification getSpec() {
        return spec;
    }
}
