package com.ormuco.technicaltest.questiona.services;

/**
 * CollinearService interface.
 * <p>
 * This interface define methods to CollinearService.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public interface ICollinearService {
    
    /**
     * Define the isOverlapXAxis method.
     * <p>
     * This method contains the implementation to evaluate if two lines are overlap.
     * </p>
     * 
     * @param pointX1 First point on X axis.
     * @param pointX2 Second point on X axis.
     * @param pointX3 Third point on X axis.
     * @param pointX4 Fourth point on X axis.
     * @return Boolean value. If it's True, two lines are overlap, else it's False not.
     */
    Boolean isOverlapXAxis( Integer pointX1, Integer pointX2, Integer pointX3, Integer pointX4 );

}
