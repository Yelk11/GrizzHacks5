/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grizzhacks.musclestresssimulation;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class MuscleStressSimulation {
    public static void main(String[] args){
        
        // ask for numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        
        System.out.println("What is your sex? (m/f)");
        boolean sex = scan.next() == "f";
        
        System.out.println("How many times a week do you workout?");
        int workoutPerWeek = scan.nextInt();
        
        System.out.println("How much do you weigh? (in Kilograms)");
        double bodyWeight = scan.nextDouble();
        // calc numbers
        Calculations calc = new Calculations(age, sex, workoutPerWeek, bodyWeight);
        
        System.out.println("You can lift: " + calc.getWeightICanHold());
        // display arm and message
        
        GUI gui = new GUI();
        try{
            gui.window("You can lift: " + calc.getWeightICanHold());// + calc.getWeightICanHold());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
