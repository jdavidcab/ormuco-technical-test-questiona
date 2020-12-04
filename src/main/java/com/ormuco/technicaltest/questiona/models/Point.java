package com.ormuco.technicaltest.questiona.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Line model.
 * <p>
 * This object represent one point, it allow to load the value over X axis and value over Y axis.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class Point {

    @Getter 
    @Setter(AccessLevel.PROTECTED)
    private Integer xAxis;

    @Getter 
    @Setter(AccessLevel.PROTECTED)
    private Integer yAxis;

    /**
     * Constructor with two params. 
     * <p>
     * This constructor method allow to create object Point with value over X axis and value over Y axis.
     * </p>
     * 
     * @param xAxis Value over X axis.
     * @param yAxis Value over Y axis.
     */
    public Point( final Integer xAxis, final Integer yAxis ) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

}
