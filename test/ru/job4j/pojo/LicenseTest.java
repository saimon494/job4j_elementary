package ru.job4j.pojo;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void notEqName() {
        License first = new License();
        first.setOwner("Petrov I.I.");
        License second = new License();
        second.setOwner("Ivanov I.I.");
        assertThat(first, not(second));
    }
}