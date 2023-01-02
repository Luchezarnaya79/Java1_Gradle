package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCashBackLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2_000;

        int expected = 1_000;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }
}
