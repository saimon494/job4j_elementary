package ru.job4j.set;

import org.junit.Test;
import ru.job4j.set.Jackpot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JackpotTest {
    @Test
    public void checkYourWinTrue() {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(true));
    }

    @Test
    public void checkYourWinFalse() {
        String[] strings = {"&&", "&", "&&&", "&&&&"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(false));
    }

    @Test
    public void checkStringTrue() {
        String s = "uncopyrightables";
        boolean b = Jackpot.checkString(s);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringFalse() {
        String s = "javascript";
        boolean b = Jackpot.checkString(s);
        assertThat(b, is(false));
    }
}