/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypatternsp1;
import ProxyClasses.*;
public class ProxyPatternSP1 {

   
    public static void main(String[] args) {
        
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
        
    }
    
}
