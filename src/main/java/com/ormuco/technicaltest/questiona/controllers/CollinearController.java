package com.ormuco.technicaltest.questiona.controllers;

import javax.validation.Valid;

import com.ormuco.technicaltest.questiona.dto.CollinearRequest;
import com.ormuco.technicaltest.questiona.dto.CollinearResponse;
import com.ormuco.technicaltest.questiona.services.ICollinearService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController to Collinear functionality.
 * <p>
 * This controller management all methods about Collinear functionality.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
@RestController
@RequestMapping("/collinear")
public class CollinearController {

    private static final Logger LOGGER = LoggerFactory.getLogger( CollinearController.class );

    /**
     * Spring Dependency injection of service.
     */
    @Autowired
    ICollinearService collinearService;

    
    /** 
     * Allow to know if two lines are overlap.
     * <p>
     * Restful Post method that allow to know if two lines are overlap over X axis. 
     * All fields must to be required. All points Y axis will be set in zero.
     * </p>
     * @param request The four points in x axis that allow to evaluate if two lines are overlap.
     *                All fields are required.
     * @return CollinearResponse: If field isOverlapXAxis is True the two lines are overlap, 
     *         else it's False not.
     */
    @PostMapping( path = "/isOverlapXAxis" )
    public CollinearResponse isOverlapXAxis(@Valid @RequestBody CollinearRequest request) {

        LOGGER.debug( "Receiving post method request. CollinearRequest:[" + request + "]" );
        Boolean isOverlapXAxis = collinearService.isOverlapXAxis( 
            request.getPointX1(), 
            request.getPointX2(), 
            request.getPointX3(), 
            request.getPointX4() 
        );
        LOGGER.debug( "Overlap X axis result:[" + isOverlapXAxis + "]" );

        return new CollinearResponse( isOverlapXAxis );
    }
    

}
