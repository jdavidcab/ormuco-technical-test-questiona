package com.ormuco.technicaltest.questiona.services;

import com.ormuco.technicaltest.questiona.models.Collinear;
import com.ormuco.technicaltest.questiona.models.Line;
import com.ormuco.technicaltest.questiona.models.Point;

import org.springframework.stereotype.Component;

/**
 * CollinearService class.
 * <p>
 * This class allow to serve as a service for implement all the business logic for Collinear functionality.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
@Component("collinearService")
public class CollinearService implements ICollinearService {
    
    /**
     * Allows to implement the logic.
     * <p>
     * This method contains the implementation to evaluate if two lines are overlap.
     * The code about implementation below:
     * <pre>
     * 
     *  //Create point one with X1 axis value. The Y axis value are set to zero.
     *  final Point pointOneLineOne = new Point( pointX1, 0 );
     *    
     *  //Create point two with X2 axis value. The Y axis value are set to zero.
     *  final Point pointTwoLineOne = new Point( pointX2, 0 );
     *
     *  //Create the first line with two points.
     *  final Line lineOne = new Line( pointOneLineOne, pointTwoLineOne );
     *
     *  //Create point three with X3 axis value. The Y axis value are set to zero.
     *  final Point pointOneLineTwo = new Point( pointX3, 0 );
     *
     *  //Create point four with X4 axis value. The Y axis value are set to zero.
     *  final Point pointTwoLineTwo = new Point( pointX4, 0 );
     *
     *  //Create the second line with two points.
     *  final Line lineTwo = new Line( pointOneLineTwo, pointTwoLineTwo );
     *
     *  //Create the collinear object with two lines and execute isOverlapXAxis Method.
     * final Collinear collinear = new Collinear( lineOne, lineTwo );
     * return collinear.isOverlapXAxis();
     * 
     * </pre>
     * </p>
     * 
     * @param pointX1 First point on X axis.
     * @param pointX2 Second point on X axis.
     * @param pointX3 Third point on X axis.
     * @param pointX4 Fourth point on X axis.
     * @return Boolean value. If it's True, two lines are overlap, else it's False not.
     */
    public Boolean isOverlapXAxis( Integer pointX1, Integer pointX2, Integer pointX3, Integer pointX4 ) {

        //Create point one with X1 axis value. The Y axis values are set to zero.
        final Point pointOneLineOne = new Point( pointX1, 0 );

        //Create point two with X2 axis value. The Y axis values are set to zero.
        final Point pointTwoLineOne = new Point( pointX2, 0 );

        //Create the first line with two points.
        final Line lineOne = new Line( pointOneLineOne, pointTwoLineOne );

        //Create point three with X3 axis value. The Y axis values are set to zero.
        final Point pointOneLineTwo = new Point( pointX3, 0 );

        //Create point four with X4 axis value. The Y axis values are set to zero.
        final Point pointTwoLineTwo = new Point( pointX4, 0 );

        //Create the second line with two points.
        final Line lineTwo = new Line( pointOneLineTwo, pointTwoLineTwo );

        //Create the collinear object with two lines and execute isOverlapXAxis Method.
        final Collinear collinear = new Collinear( lineOne, lineTwo );
        return collinear.isOverlapXAxis();

    }

}
