package com.ormuco.technicaltest.questiona.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Response object fields.
 * <p>
 * Response object contain all fields to evaluate if two lines are overlap.
 * This class contain the following fields:
 * <ul>
 *      <li><b>isOverlapXAxis</b>:  If it's True, two lines are overlap, else it's False not.</li>
 * </ul>
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class CollinearResponse {
    
    /** 
     * @param isOverlapXAxis If it's True, two lines are overlap, else it's False not.
     */
    @Getter 
    @Setter
    private Boolean isOverlapXAxis;

    public CollinearResponse( final Boolean isOverlapXAxis ) {
        this.isOverlapXAxis = isOverlapXAxis;
    }

}
