/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grizzhacks.musclestresssimulation;

/**
 *
 * @author Matt
 */
public class Calculations {

    private int age;
    private boolean sex; //True is Female;
    private int workoutPerWeek;
    private double bodyWeight;
    public Calculations(int age, boolean sex, int workoutPerWeek, double bodyWeight) {
        this.age = age;
        this.sex = sex;
        this.workoutPerWeek = workoutPerWeek;
        this.bodyWeight= bodyWeight;
    }
    
    public double getWeightICanHold(){
        return getTavg();
    }
    
    private int getTavg(){
        if(!sex && 18 < age && age < 35){ //Male
            return 652;
        }else if(!sex && 36 < age && age < 55){ // Male
            return 550;
        }else if(!sex && 56 < age && age < 75){ //Male
            return 400;
        }else if(sex && 18 < age && age < 35){ //Female
            return 400;
        }else if(!sex && 76 < age && age < 85){ //Male
            return 400;
        }else if (sex && 36 < age && age < 55){ // Female
            return 400;
        }else if(sex && 56 < age && age < 75){ // Female
            return 200;
        }else if(sex && 76 < age && age < 85){ //Female
            return 120;
        }else {
            return -1;
        }
    }
    
    
    private double moreMath(){
        if(workoutPerWeek == 0){
            return getTavg() - 100;
        }else if(workoutPerWeek == 1){
            return getTavg() - 75;
        }else if(workoutPerWeek <=3){
            return getTavg() - 50;
        }else if(workoutPerWeek <=5){
            return getTavg() - 25;
        }else if(workoutPerWeek <=7){
            return getTavg() - 0;
        }else {
            return -1;
        }
    }
    
    public double getForce(){
        return getTavg() - (0.106 * bodyWeight) / 4;
    }
    
    
    
    
    
    
    
    
}
