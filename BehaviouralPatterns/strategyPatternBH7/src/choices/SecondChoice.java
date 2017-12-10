/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choices;

public class SecondChoice implements IChoice {
    public void myChoice(String s1,String s2)
    {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println(" The result of the addition is:"+s1+s2);
        System.out.println("***End of the strategy***");
    }
}
