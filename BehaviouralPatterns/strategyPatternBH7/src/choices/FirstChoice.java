/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choices;

public class FirstChoice implements IChoice{
    
    public void myChoice(String s1, String s2){
        System.out.println("You wanted to add the numbers.");
        int int1, int2,sum;
        int1=Integer.parseInt(s1);
        int2=Integer.parseInt(s2);
        sum=int1+int2;
        System.out.println(" The result of the addition is:"+sum);
        System.out.println("***End of the strategy***");
    }
}
