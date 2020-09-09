package ru.job4j.inheritance;

public class Engineer extends Profession {
    public boolean makeTask(Task task) {
        task.getSpec();
        return task.isExecute();
    }
}
