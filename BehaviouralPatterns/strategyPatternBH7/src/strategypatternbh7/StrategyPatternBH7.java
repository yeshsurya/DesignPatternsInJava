/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternbh7;
import java.io.IOException;
//For Java old versions-to take input from user
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
/* Java 5 added a nice utility class called Scanner, to get input from user */
import java.util.Scanner;
import contextofchoice.Context;
//import choices.*;
import choices.FirstChoice;
import choices.IChoice;
import choices.SecondChoice;

public class StrategyPatternBH7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("***Strategy Pattern Demo***");
    Scanner in= new Scanner(System.in);//To take input from user
    IChoice ic = null;
    Context cxt = new Context();
    String input1,input2;;
 //Looping twice to test two different choices
    try
    {
        for (int i = 1; i <= 2; i++)
        {
            System.out.println("Enter an integer:");
            input1 = in.nextLine();
            System.out.println("Enter another integer:");
            input2 = in.nextLine();
            System.out.println("Enter ur choice(1 or 2)");
            System.out.println("Press 1 for Addition,2 for Concatenation");
            String c = in.nextLine();
            if (c.equals("1"))
            {
                ic = (IChoice) new FirstChoice();
            }
            else
            {
                ic = new SecondChoice();
            }
            cxt.SetChoice(ic);
            cxt.ShowChoice(input1,input2);
        }
    
    }
    finally{
        in.close();
    }
    System.out.println("End of Strategy pattern");
    
    }
}