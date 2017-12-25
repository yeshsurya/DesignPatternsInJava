/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotparts;

/**
 *
 * @author PC
 */
public class RobotMetal {
    private String metal;
    public void SetMetal(String metal){
        this.metal = metal;
        System.out.println("Metal is set to : "+this.metal);
    }
}
