package com.ormuco.technicaltest.questiona;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ormuco.technicaltest.questiona.services.CollinearService;
import com.ormuco.technicaltest.questiona.services.ICollinearService;

import org.junit.jupiter.api.Test;

public class CollinearServiceTest {
    
    private final ICollinearService collinearService = new CollinearService();

    @Test
    void whenValidInput_thenReturnsCollinearResponseTrue() throws Exception {

        final Integer pointX1 = 1;
        final Integer pointX2 = 5;
        final Integer pointX3 = 2;
        final Integer pointX4 = 6;

        Boolean result = collinearService.isOverlapXAxis( pointX1, pointX2, pointX3, pointX4 );
        assertTrue( result, "Lines are overlap." );

    }

    @Test
    void whenValidInput_thenReturnsCollinearResponseFalse() throws Exception {

        final Integer pointX1 = 3;
        final Integer pointX2 = 5;
        final Integer pointX3 = 2;
        final Integer pointX4 = 6;

        Boolean result = collinearService.isOverlapXAxis( pointX1, pointX2, pointX3, pointX4 );
        assertTrue( result, "Lines are not overlap." );

    }
}
