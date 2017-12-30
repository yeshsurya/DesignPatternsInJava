/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercp5;
import java.util.LinkedList;
/**
 *
 * @author PC
 */
public class BuilderCP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");
 
                Director director = new Director();
 
                IBuilder carBuilder = new Car();                
                IBuilder motorBuilder = new MotorCycle();
                // Making Car                
                director.Construct(carBuilder);                
                Product p1 = carBuilder.GetVehicle();                
                p1.Show();
 
                //Making MotorCycle                
                director.Construct(motorBuilder);                
                Product p2 = motorBuilder.GetVehicle();                
                p2.Show(); 
    }
    
}
// Builders common 
interface IBuilder {        
    void BuildBody();       
    void InsertWheels();        
    void AddHeadlights();        
    Product GetVehicle();
}
 
// Car is ConcreteBuilder 
class Car implements IBuilder {        
private Product product = new Product();
 
        @Override        
	public void BuildBody()        
	{                
		product.Add("This is a body of a Car");        
	}        
	@Override        
	public void InsertWheels()        
	{                
		product.Add("4 wheels are added");        
	}        
	@Override        
	public void AddHeadlights()        
	{                
		product.Add("2 Headlights are added");        
	}        
	@Override        
	public  Product GetVehicle()        
	{                
		return product;        
	}
}
// Motorcycle is a ConcreteBuilder 
class MotorCycle implements IBuilder {        
	private Product product = new Product();        
	@Override
	public  void BuildBody()        
	{                
		product.Add("This is a body of a Motorcycle");        	}        
	@Override        
	public void InsertWheels()        
	{                
		product.Add("2 wheels are added");        
	}        
	@Override        
	public void AddHeadlights()        
	{                
		product.Add("1 Headlights are added");        
	}        
	@Override        
	public  Product GetVehicle()        
	{                
		return product;        
	} 
}

// "Product" 
class Product {        
	// We can use any data structure that you prefer. We have used LinkedList here.        
	private LinkedList<String> parts;        
	public Product()        
	{                
		parts = new LinkedList<String>();        
	}
 
        public void Add(String part)        
	{                
		//Adding parts                
		parts.addLast(part);        
	}
 
        public void Show()        
	{                
	System.out.println("\n Product completed as below :");                for(int i=0;i<parts.size();i++)                
	{                        
		System.out.println(parts.get(i));                
	}        
	} 
} 
// "Director" 
class Director 
{        
	IBuilder myBuilder;
// A series of steps—for the production        
	public void Construct(IBuilder builder)        
	{                
		myBuilder=builder;                
		myBuilder.BuildBody();                		
                myBuilder.InsertWheels();                		
                myBuilder.AddHeadlights();        
	} 
}
 
 
 
