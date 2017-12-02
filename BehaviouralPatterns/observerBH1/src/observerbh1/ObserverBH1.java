/*
CONCEPT : 
In this pattern, there are many observers (objects) which are observing a particular subject (object). 
Observers are basically interested and want to be notified when there is a change made inside that subject. 
So, they register themselves to that subject. 
When they lose interest in the subject they simply unregister from the subject.
Sometimes this model is also referred to as the Publisher-Subscriber model.

EXAMPLE : 
In the world of computer science, consider a simple UI-based example, 
where this UI is connected with some database (or business logic). 
A user can execute some query through that UI and after searching the database, 
the result is reflected back in the UI. 
In most of the cases we segregate the UI with the database. 
If a change occurs in the database, the UI should be notified so that it can update its display according to the change.

 */
package observerbh1;
import java.util.*;
class Observer    
{       
    int roll=0;

    Observer(int a) {
        this.roll=a;
    }
    
    public void update()        
    {                
        System.out.println("flag value changed in Subject --> "+ this.roll);
    }        
}    
 
   interface ISubject    {        
       void register(Observer o);
       void unregister( Observer o);        
       void notifyObservers();    
   }    
  class Subject implements ISubject    {        
      List<Observer> observerList = new ArrayList<Observer>();
      private int _flag;        
      public int getFlag()
      {           
          
          return _flag;        
      }
       public void setFlag(int _flag)        
       {          
           this._flag=_flag;
           notifyObservers();
       }
       
       @Override
       public void register(Observer o){
           observerList.add(o);
       }
       
       @Override
       public void unregister(Observer o){
           observerList.remove(o);
       }
       
       @Override
       public void notifyObservers(){
               for(int i=0;i<observerList.size();i++){
                    observerList.get(i).update();
                }
       }
       
    }
  
public class ObserverBH1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***Observer Pattern Demo***\n");       
        int a=1;
        Observer o1 = new Observer(a);
        Observer o2= new Observer(2);
        Subject sub1 = new Subject();        
        sub1.register(o1);
        sub1.register(o2);
        System.out.println("Setting Flag = 5 ");        
        sub1.setFlag(5);        
        System.out.println("Setting Flag = 25 ");        
        sub1.setFlag(25);        
        sub1.unregister(o1);        //No notification this time to o1 .Since it is unregistered.        
        System.out.println("Setting Flag = 50 ");        
        sub1.setFlag(50); 
    }
    
}
