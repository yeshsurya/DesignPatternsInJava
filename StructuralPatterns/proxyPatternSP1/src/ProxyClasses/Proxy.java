/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyClasses;
import OriginalClasses.*;
/**
 *
 * @author ynagaraj
 */
public class Proxy extends Subject{
    ConcreteSubject cs;
    @Override
    public void doSomeWork(){
        System.out.println("Proxy call happening now");
        //Laxy initialization
        if(cs==null)
        {
            cs= new ConcreteSubject();
        }
        cs.doSomeWork();
        
    }
}
