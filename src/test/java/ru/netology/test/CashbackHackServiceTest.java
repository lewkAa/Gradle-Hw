package ru.netology.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemainWhenAmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        int expected = 800;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}