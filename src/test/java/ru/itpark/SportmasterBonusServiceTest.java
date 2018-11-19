package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterBonusServiceTest {

    @Test
    void calculateBonus() {

        {SportmasterBonusService service = new SportmasterBonusService();
        int sportmasterBonus =service.calculateBonus(7_000, 9562);
        assertEquals(450, sportmasterBonus);}

        {SportmasterBonusService service = new SportmasterBonusService();
        int sportmasterBonus =service.calculateBonus(17_000, 9562);
        assertEquals(630, sportmasterBonus);}

        {SportmasterBonusService service = new SportmasterBonusService();
        int sportmasterBonus =service.calculateBonus(177_000, 9562);
        assertEquals(900, sportmasterBonus);}
    }
}