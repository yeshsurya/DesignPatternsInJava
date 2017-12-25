/*
 It is one of those patterns that supports loose coupling. 
 Here we emphasize the abstraction and hide the complex details by exposing a simple interface.
__________________________________________________________________________________________________
We can think about a case where we use a method from a library. 
The user doesn’t care how the method is implemented in the library. 
He/she just calls the method to serve his/her easy purpose. 
The pattern can be best described by the example that follows.
__________________________________________________________________________________________________
Here our aim is to build/construct robots. 
And from a user point of view he/she needs to supply only the color and 
material for his/her robot through the RobotFacade 
Our RobotFacade (RobotFacade.java) will    in turn create objects for RobotBody, RobotColor, RobotMetal and 
will do the rest for the user. 
We need not worry about the creation of these separate classes and 
their calling sequence. All of the classes have their corresponding implementation here. 
In this example I have followed this structure. 


 */
package facadepatternsp4;
import robotfacade.RobotFacade;

public class FacadePatternSP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***");                
        RobotFacade rf1 = new RobotFacade();                
        rf1.ConstructRobot("Green", "Iron");                
        RobotFacade rf2 = new RobotFacade();                
        rf2.ConstructRobot("Blue", "Steel");
    }
    
}
