package ru.netology.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldTestIfAmountLess1000(){
        int actual=service.remain(850);
        int expected=150;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldTestIfAmountMore1000(){
        int actual=service.remain(2500);
        int expected=500;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldTestIfAmount1000(){
        int actual=service.remain(1000);
        int expected=0;
        assertEquals(actual,expected);
    }

}