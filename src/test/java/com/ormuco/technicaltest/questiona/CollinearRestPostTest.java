package com.ormuco.technicaltest.questiona;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ormuco.technicaltest.questiona.controllers.CollinearController;
import com.ormuco.technicaltest.questiona.dto.CollinearRequest;
import com.ormuco.technicaltest.questiona.services.ICollinearService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith( SpringExtension.class )
@WebMvcTest( controllers = CollinearController.class)
public class CollinearRestPostTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ICollinearService collinearService;

    @Test
    void whenValidInput_thenReturns200() throws Exception {

        CollinearRequest request = new CollinearRequest();
        request.setPointX1( 1 );
        request.setPointX2( 5 );
        request.setPointX3( 2 );
        request.setPointX4( 6 );

        mockMvc.perform(
            post( "/collinear/isOverlapXAxis" )
            .contentType( "application/json" )
            .content( objectMapper.writeValueAsString( request ) )
        )
        .andExpect( status().isOk() );

    }

    @Test
    void whenInvalidInput_thenReturns400() throws Exception {

        CollinearRequest request = new CollinearRequest();
        request.setPointX1( null );
        request.setPointX2( 5 );
        request.setPointX3( 2 );
        request.setPointX4( 6 );

        mockMvc.perform(
            post( "/collinear/isOverlapXAxis" )
            .contentType( "application/json" )
            .content( objectMapper.writeValueAsString( request ) )
        )
        .andExpect( status().isBadRequest() );

    }

}
