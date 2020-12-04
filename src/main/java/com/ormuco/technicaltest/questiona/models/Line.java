package com.ormuco.technicaltest.questiona.models;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

/**
 * Line model.
 * <p>
 * This object represent one line, it allow to load two points from line.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class Line {
    
    @Getter 
    @Setter(AccessLevel.PROTECTED)
    private Point pointOne;

    @Getter 
    @Setter(AccessLevel.PROTECTED)
    private Point pointTwo;

    /**
     * Constructor with two params. 
     * <p>
     * This constructor method allow to create object Line with two points.
     * </p>
     * 
     * @param pointOne The first point from line.
     * @param pointTwo The second point from line.
     */
    public Line( final Point pointOne, final Point pointTwo ) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }
}
