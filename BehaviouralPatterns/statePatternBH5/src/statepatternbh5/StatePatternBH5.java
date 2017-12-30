/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatternbh5;

/**
 Real World Situation : Consider a network connection for the moment. 
 * Here the object (that is responsible for communication) can be in various states 
 * (e.g., already a connection is established, a connection is closed, 
 * or the object is listening through the connection). 
 * We can also think of a traffic signal in this context
 Computer World Example : The above example is applicable in the computer world also. 
 * Let us look at an additional example: We have a job processing application where we can process only one job 
 * (or any certain number of jobs) at a time. Now if a new job appears, 
 * either the application will process that job or it will signal that the new 
 * job cannot be processed at this moment because the system is already processing 
 * the maximum number of jobs in it  (i.e., its number of job processing capabilities has reached the ceiling).

 */
public class StatePatternBH5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("***State Pattern Demo***\n");                 
        //Initially TV is Off        
        Off initialState = new Off();        
        TV tv = new TV(initialState);        
        //First time press        
        tv.pressButton();        
        //Second time press        
        tv.pressButton();
    }
    
}

abstract class RemoteControl {    
    public abstract void pressSwitch(TV context); 
}
class Off extends RemoteControl {        
    @Override       
    public void pressSwitch(TV context){        
            System.out.println("I am Off .Going to be On now");        
            context.setState(new On());    
        } 
}
class On extends RemoteControl {        
    @Override        
    public void pressSwitch(TV context)        
    {                
        System.out.println("I am already On .Going to be Off now");        
        context.setState(new Off());    
    } 
}
  
class TV {    
    private RemoteControl state;         
    public RemoteControl getState() {                
        return state;        }        
    public void setState(RemoteControl state) {                
        this.state = state;        }        
    public TV(RemoteControl state)    {        
        this.state=state;    }        
    public void pressButton()    {        
        state.pressSwitch(this);    } 
}
 
