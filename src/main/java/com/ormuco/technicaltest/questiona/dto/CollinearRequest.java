package com.ormuco.technicaltest.questiona.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Request object fields.
 * <p>
 * Request object contain all fields to evaluate if two lines are overlap.
 * This class contain the following fields:
 * <ul>
 *      <li><b>pointX1</b>: First point on X axis. This field is required.</li>
 *      <li><b>pointX2</b>: Second point on X axis. This field is required.</li>
 *      <li><b>pointX3</b>: Third point on X axis. This field is required.</li>
 *      <li><b>pointX4</b>: Fourth point on X axis. This field is required.</li>
 * </ul>
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
@ToString
public class CollinearRequest {
    
    @Getter 
    @Setter
    @NotNull( message = "The field pointX1 can't be null" )
    private Integer pointX1;

    @Getter 
    @Setter
    @NotNull( message = "The field pointX2 can't be null" )
    private Integer pointX2;

    @Getter 
    @Setter
    @NotNull( message = "The field pointX3 can't be null" )
    private Integer pointX3;

    @Getter 
    @Setter
    @NotNull( message = "The field pointX4 can't be null" )
    private Integer pointX4;

}
