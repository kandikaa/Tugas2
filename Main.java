/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ppool
 */
public class Main {
    public static void main(String[] args){
    Bicycle bikeA = new Bicycle(5, 5, 5);
    System.out.println("Speed: " + bikeA.speed);
    bikeA.speedUp(2);
    System.out.println("Speed: " + bikeA.speed);
    }
}

