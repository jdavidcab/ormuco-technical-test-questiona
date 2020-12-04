package com.ormuco.technicaltest.questiona.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;

/**
 * Collinear model.
 * <p>
 * This object allow to load two lines and evaluate if it are overlap.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class Collinear {
    
    private static final Logger LOGGER = LoggerFactory.getLogger( Collinear.class );

    @Getter
    @Setter
    private Line lineOne;

    @Getter
    @Setter
    private Line lineTwo;

    /**
     * Default constructor.
     */
    public Collinear() {}

    /**
     * Constructor with two params. 
     * <p>
     * This constructor method allow to create object Collinear with two lines.
     * </p>
     * 
     * @param lineOne The first line to evaluate.
     * @param lineTwo The second line to evaluate.
     */
    public Collinear( final Line lineOne, final Line lineTwo ) {
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
    }

    /**
     * Method to evaluate overlap.
     * <p>
     * This method execute the formula to know if two lines are overlap. The code is below:
     * <pre>
     * //Calculate the final point of line one and the initial point of line two.
     *  final Integer compare1 = Integer.max( x1, x2 ) - Integer.min( x3, x4 );
     * 
     * //Calculate the final point of line two and the initial point of line one.
     * final Integer compare2 = Integer.max( x3, x4 ) - Integer.min( x1, x2 );
     * 
     * //if both compare fields are mayor than zero the lines are overlap.
     * if( compare1 >= 0 && compare2 >= 0 ) {
     *     return Boolean.TRUE;
     * } 
     * </pre>
     * </p>
     * 
     * @return Boolean value. If it's True, two lines are overlap, else it's False not.
     */
    public Boolean isOverlapXAxis() {

        final Integer x1 = this.lineOne.getPointOne().getXAxis();
        final Integer x2 = this.lineOne.getPointTwo().getXAxis();
        final Integer x3 = this.lineTwo.getPointOne().getXAxis();
        final Integer x4 = this.lineTwo.getPointTwo().getXAxis();

        //Calculate the final point of line one and the initial point of line two.
        final Integer compare1 = Integer.max( x1, x2 ) - Integer.min( x3, x4 );
        LOGGER.debug( "First subtraction value calculated:[" + compare1 + "]" );
        
        //Calculate the final point of line two and the initial point of line one.
        final Integer compare2 = Integer.max( x3, x4 ) - Integer.min( x1, x2 );
        LOGGER.debug( "Second subtraction value calculated:[" + compare2 + "]" );

        //if both compare fields are mayor than zero the lines are overlap.
        if( compare1 >= 0 && compare2 >= 0 ) {
            return Boolean.TRUE;
        } 

        return Boolean.FALSE;
    }
}
