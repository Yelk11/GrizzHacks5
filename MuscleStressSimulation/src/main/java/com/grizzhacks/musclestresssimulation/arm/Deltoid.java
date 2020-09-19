/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grizzhacks.musclestresssimulation.arm;

/**
 *
 * @author Matthew
 */
public class Deltoid
{
    public static final double MAX_STRETCH = .2;
    public static final double MAX_SHORTENING = .2;
    
    
    private int tension;
    private double stretch;
    private int muscleLength;
    
    
    public int getTension(){
        return tension;
    }
    
    public void setTension(int tension){
        this.tension = tension;
    }
    
    public double getStretch(){
        return this.stretch;
    }
    
    public void setStretch(double stretch){
        this.stretch = stretch;
    }
    
    
    public boolean isTorn(){
        
        return muscleLength * MAX_STRETCH > stretch;
        
    }
    
    
    
}
