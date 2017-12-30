/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementobh11;

/**
 *
 * @author PC
 */
public class MementoBH11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("***Memento Pattern Demo***\n");                
         Originator o = new Originator();                
         o.setState("First state");
 
                // Holding old state                
                Caretaker c = new Caretaker();                
                c.SaveMemento(o.OriginatorMemento());
 
                //Changing state                
                o.setState("Second state");
 
                // Restore saved state               
                o.Revert(c.RetrieveMemento());
    }
    
}
class Memento{
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
class Originator{
    private String state;
    Memento m;
    public void setState(String state){
        this.state = state;
        System.out.println("State at present : "+state);
    }
    //Creates memento
    public Memento OriginatorMemento(){
        m = new Memento(state);
        return m;
    }
    //Back to old state
    public void Revert(Memento memento){
        System.out.println("Restoring to previous state....");
        state = memento.getState();
        System.out.println("State at present : "+state);
    }
}

//Caretaker class
class Caretaker{
    private Memento _memento;
    public void SaveMemento(Memento m){
        _memento = m ; 
    }
    public Memento RetrieveMemento(){
        return _memento;
    }
}
