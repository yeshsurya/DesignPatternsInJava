/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightpattensp2;
import java.util.HashMap;
import java.util.Map;
interface IRobot{
    void Print();
}
class SmallRobot implements IRobot{
    @Override
    public void Print(){
        System.out.println("This is a Small Robot..");
    }
}
class LargeRobot implements IRobot{
    @Override
    public void Print(){
        System.out.println("This is a Large Robot...");
    }
}
class RobotFactory {        
    Map<String, IRobot> shapes = new HashMap<String, IRobot>();
 
        public int TotalObjectsCreated()        
        {                
            return shapes.size();        
        }
 
        public IRobot GetRobotFromFactory(String RobotCategory)        
        {                
            IRobot robotCategory = null;                
            if (shapes.containsKey(RobotCategory))                
            {                        
                robotCategory = shapes.get(RobotCategory);                
            }                
            else                
            {                        
                switch (RobotCategory)                        
                {                        
                    case "small":                                 
                        System.out.println("We do not have Small Robot. So we are creating a Small Robot now.");                                
                        robotCategory = new SmallRobot();                                
                        shapes.put("small", robotCategory);                                
                        break;                        
                    case "large":                                 
                        System.out.println("We do not have Large Robot. So we are creating a Large Robot now .");                                robotCategory = new LargeRobot();                                
                        shapes.put("large", robotCategory);                                
                        break;                        
                    default:                                 
                        //throw new Exception(" Robot Factory can create only small and large shapes");                        
                }                
            }                
            return robotCategory;        
        }
 
}
/**
 *
 * @author PC
 */
public class FlyweightPattenSP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     RobotFactory myfactory = new RobotFactory();                
     System.out.println("\n***Flyweight Pattern Example***\n");
     IRobot shape = myfactory.GetRobotFromFactory("small");                
     shape.Print();                 
     /*Here we are trying to get the objects additional 2 times. 
     Note that from now onward we do not need to create additional small robots as we have already created this category*/                
     for (int i = 0; i < 2; i++)                
     {                        
         shape = myfactory.GetRobotFromFactory("small");                        
         shape.Print();                
     }                
     int NumOfDistinctRobots = myfactory.TotalObjectsCreated();                 
     System.out.println("\nDistinct Robot objects created till now=  "+ NumOfDistinctRobots);
     
 
     /*Here we are trying to get the objects 5 times. 
     Note that the second time onward we do not need to create additional
     large robots as we have already created this category in the first attempt(at i=0)*/                
     for (int i = 0; i < 5; i++)                
     {                        
         shape = myfactory.GetRobotFromFactory("large");                        
         shape.Print();                
     }
 
        NumOfDistinctRobots = myfactory.TotalObjectsCreated();                 
        System.out.println("\n Finally no of Distinct Robot objects created:  "+ NumOfDistinctRobots);
    }
    
}
