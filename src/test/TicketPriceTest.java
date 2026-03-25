package src.test;

import org.junit.jupiter.api.Test;
import src.main.MovieTicket;

import static org.junit.jupiter.api.Assertions.*;

public class TicketPriceTest {
    MovieTicket movieTicket = new MovieTicket();

    @Test
    void testChildLowerZero_AgeBoundary(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-1, "weekday", false));
    }

    @Test
    void testChildLowerZero1_AgeBoundary(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-1, "weekday", true));
    }

    @Test
    void testChildLowerZero2_AgeBoundary(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-1, "weekend", false));
    }

    @Test
    void testChildLowerZero3_AgeBoundary(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-1, "weekend", true));
    }

    @Test
    void testChildEqualZero_AgeBoundary(){
        assertEquals(0, movieTicket.CaculateTicketPrice(0, "weekday", false));
    }

    @Test
    void testChildEqualZero1_AgeBoundary(){
        assertEquals(20000, movieTicket.CaculateTicketPrice(0, "weekday", true));
    }

    @Test
    void testChildEqualZero2_AgeBoundary(){
        assertEquals(10000, movieTicket.CaculateTicketPrice(0, "weekend", false));
    }

    @Test
    void testChildEqualZero3_AgeBoundary(){
        assertEquals(30000, movieTicket.CaculateTicketPrice(0, "weekend", true));
    }

    @Test
    void testChild_AgeBoundary(){
        assertEquals(0, movieTicket.CaculateTicketPrice(9, "weekday", false));
    }

    @Test
    void testChild1_AgeBoundary(){
        assertEquals(20000, movieTicket.CaculateTicketPrice(9, "weekday", true));
    }

    @Test
    void testChild2_AgeBoundary(){
        assertEquals(10000, movieTicket.CaculateTicketPrice(9, "weekend", false));
    }

    @Test
    void testChild3_AgeBoundary(){
        assertEquals(30000, movieTicket.CaculateTicketPrice(9, "weekend", true));
    }

    @Test
    void testChild11_AgeBoundary(){
        assertEquals(0, movieTicket.CaculateTicketPrice(10, "weekday", false));
    }

    @Test
    void testChild12_AgeBoundary(){
        assertEquals(20000, movieTicket.CaculateTicketPrice(10, "weekday", true));
    }

    @Test
    void testChild13_AgeBoundary(){
        assertEquals(10000, movieTicket.CaculateTicketPrice(10, "weekend", false));
    }

    @Test
    void testChild14_AgeBoundary(){
        assertEquals(30000, movieTicket.CaculateTicketPrice(10, "weekend", true));
    }

    @Test
    void testBiggerChild_AgeBoundary(){
        assertEquals(60000, movieTicket.CaculateTicketPrice(11, "weekday", false));
    }

    @Test
    void testBiggerChild1_AgeBoundary(){
        assertEquals(80000, movieTicket.CaculateTicketPrice(11, "weekday", true));
    }

    @Test
    void testBiggerChild2_AgeBoundary(){
        assertEquals(70000, movieTicket.CaculateTicketPrice(11, "weekend", false));
    }

    @Test
    void testBiggerChild3_AgeBoundary(){
        assertEquals(90000, movieTicket.CaculateTicketPrice(11, "weekend", true));
    }


    @Test
    void testBiggerChild11_AgeBoundary(){
        assertEquals(60000, movieTicket.CaculateTicketPrice(21, "weekday", false));
    }

    @Test
    void testBiggerChild12_AgeBoundary(){
        assertEquals(80000, movieTicket.CaculateTicketPrice(21, "weekday", true));
    }

    @Test
    void testBiggerChild13_AgeBoundary(){
        assertEquals(70000, movieTicket.CaculateTicketPrice(21, "weekend", false));
    }

    @Test
    void testBiggerChild14_AgeBoundary(){
        assertEquals(90000, movieTicket.CaculateTicketPrice(21, "weekend", true));
    }

    @Test
    void testMoreBiggerChild_AgeBoundary(){
        assertEquals(60000, movieTicket.CaculateTicketPrice(22, "weekday", false));
    }

    @Test
    void testMoreBiggerChild1_AgeBoundary(){
        assertEquals(80000, movieTicket.CaculateTicketPrice(22, "weekday", true));
    }

    @Test
    void testMoreBiggerChild2_AgeBoundary(){
        assertEquals(70000, movieTicket.CaculateTicketPrice(22, "weekend", false));
    }

    @Test
    void testMoreBiggerChild3_AgeBoundary(){
        assertEquals(90000, movieTicket.CaculateTicketPrice(22, "weekend", true));
    }

    @Test
    void testNotAChild_AgeBoundary(){
        assertEquals(100000, movieTicket.CaculateTicketPrice(23, "weekday", false));
    }

    @Test
    void testNotAChild1_AgeBoundary(){
        assertEquals(120000, movieTicket.CaculateTicketPrice(23, "weekday", true));
    }
    @Test
    void testNotAChild2_AgeBoundary(){
        assertEquals(110000, movieTicket.CaculateTicketPrice(23, "weekend", false));
    }
    @Test
    void testNotAChild3_AgeBoundary(){
        assertEquals(130000, movieTicket.CaculateTicketPrice(23, "weekend", true));
    }

}
