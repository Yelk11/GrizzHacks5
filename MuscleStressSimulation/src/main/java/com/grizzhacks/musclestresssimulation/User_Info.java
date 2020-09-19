/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grizzhacks.musclestresssimulation;

/**
 *
 * @author Cassidy
 */
public class User_Info {
    
    String sex; 
    double height_cm;
    double weight_lb;
    int age;
    int frequency;
    
    public User_Info(String sex, double height_cm, double weight_lb, int age, int frequency){
        this.sex = sex;
        this.height_cm = height_cm;
        this.weight_lb = weight_lb;
        this.age = age;
        this.frequency = frequency;
    }
    
    public double muscleMassPercent(String sex){
        if(sex.equals("Male"))
            maleMuscleMass(age, frequency);
        if(sex.equals("Female"))
            femaleMuscleMass(age, frequency);
    }
    
    private double maleMuscleMass(int age, int frequecncy){
        if(ageRange(age) == 1)
            if(frequency == 1)
                return .40;
            if(frequency == 2)
                return .42;
            if(frequency == 3)
                return.44;
        if(ageRange(age) == 2)
            if(frequency == 1)
                return .36;
            if(frequency == 2)
                return .38;
            if(frequency == 3)
                return.4;
        if(ageRange(age) == 3)
            if(frequency == 1)
                return .31;
            if(frequency == 2)
                return .33;
            if(frequency == 3)
                return.35;
        if(ageRange(age) == 4)
            if(frequency == 1)
                return .20;
            if(frequency == 2)
                return .25;
            if(frequency == 3)
                return.31;
    }
    
     private double femaleMuscleMass(int age, int frequecncy){
        if(ageRange(age) == 1)
            if(frequency == 1)
                return .31;
            if(frequency == 2)
                return .32;
            if(frequency == 3)
                return .33;
        if(ageRange(age) == 2)
            if(frequency == 1)
                return .29;
            if(frequency == 2)
                return .3;
            if(frequency == 3)
                return.31;
        if(ageRange(age) == 3)
            if(frequency == 1)
                return .27;
            if(frequency == 2)
                return .28;
            if(frequency == 3)
                return.29;
        if(ageRange(age) == 4)
            if(frequency == 1)
                return .20;
            if(frequency == 2)
                return .23;
            if(frequency == 3)
                return .26;
    }
    
    private int ageRange(int age){
        if(age >= 18 && age <= 35)
            return 1;
        if(age >= 36 && age <= 55)
            return 2;
        if(age >= 56 && age <= 75)
            return 3;
        if(age >= 76 && age <= 85)
            return 4;
    }
}
