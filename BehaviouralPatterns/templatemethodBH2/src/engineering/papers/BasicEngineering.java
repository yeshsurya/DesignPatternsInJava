/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineering.papers;

public abstract class BasicEngineering {
    //  Papers() in the template method
    public void Papers()
    {
        //Common Papers 
        Math();
        SoftSkills();
        //Specialized Paper:
        SpecialPaper();

    }
    //Non-Abstract method Math(), SoftSkills() are //already implemented by Template class
    private void Math()
    {
        System.out.println("Mathematics");
    }
    private void SoftSkills()
    {
        System.out.println("SoftSkills");
    }
    public abstract void SpecialPaper();
    
}
