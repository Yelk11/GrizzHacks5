/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grizzhacks.musclestresssimulation.muscles;

/**
 *
 * @author Matt
 */
public class Tricep extends Muscle{
    
    private int muscleLength;
    
    Tricep(int length){
        muscleLength = length;
    }

    @Override
    public int getLength() {
        return muscleLength;
    }

    @Override
    public void setLength(int length) {
        muscleLength = length;
    }
    
}
