/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethodbh2;
import engineering.papers.*;
/**
 *
 * @author ynagaraj
 */
public class TemplatemethodBH2 {

    /**
     * Concept:In a template method, we define the minimum or essential structure of an algorithm. Then we defer some
functionalities (responsibilities) to the subclasses. As a result, we can redefine certain steps of an algorithm
by keeping the key structure fixed for that algorithm.
     */
    public static void main(String[] args) {
       System.out.println("***Template Method Pattern Demo***\n");
       BasicEngineering bs = new ComputerScience();
       System.out.println("Computer Sc Papers:");
       bs.Papers();
       System.out.println();
       bs = new Electronics();
       System.out.println("Electronics Papers:");
       bs.Papers();
    }
    
}
