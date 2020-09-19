/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grizzhacks.musclestresssimulation.bones;

/**
 *
 * @author Matt
 */
public class Bone {
    private int boneLength;
    
    Bone(int length){
        boneLength = length;
    }
    
    public int getBoneLength(){
        return boneLength;
    }
    public void setBoneLength(int length){
        boneLength = length;
    }
}
