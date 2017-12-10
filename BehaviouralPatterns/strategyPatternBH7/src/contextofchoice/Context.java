/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextofchoice;
import choices.IChoice;

public class Context {
    
    IChoice myC;
    //Set strategy or algorithm in the Context
    public void SetChoice(IChoice ic){
        myC = ic;
    }
    public void ShowChoice(String s1,String s2)
    {
        myC.myChoice(s1,s2);
    }
    
}
