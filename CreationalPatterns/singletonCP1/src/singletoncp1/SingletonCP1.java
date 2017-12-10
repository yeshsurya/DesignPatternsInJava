/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletoncp1;

/**
 *
 * 
 */
class MakeACaptain
{
    private static MakeACaptain _captain;
    //we make constructor private to prevent the use of "new"
    private MakeACaptain(){}
    public static MakeACaptain getCaptain()
     {

            // Lazy initialization
        if (_captain == null)
        { 
                _captain = new MakeACaptain();
                System.out.println("New Captain selected for our team");
        }
        else
        {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }      
        return _captain;
    }
}
public class SingletonCP1 {

    /**
     * Concept : A particular class should have only one instance. We will use only that instance whenever we are in need.
     * Computer World Example : In a software system sometimes we may decide to use only one file system. Usually we may use it for the
centralized management of resources.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        MakeACaptain c2 = MakeACaptain.getCaptain();
        if (c1 == c2)
        {
        System.out.println("c1 and c2 are same instance");
        }
 }
    
    
}
