package input.model;

/**
 * Creates a Thingy object to show access and proper variable types
 * @author mrir2917
 *@version 1.0 09/24/15
 */
public class Thingy
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * 
	 */
	
	public Thingy()
	{
		name = "";
		age = -99;
		weight = -.008;
	}
	/**
	 * 
	 * @param name
	 * @param age
	 * @param weight
	 */
	public Thingy(String name, int age, double weight)
	{
		//this, refers to the current instance of this object (A thingy)
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName()
	public int age()
	public double getWeight ()
	
}
	public int setname;
	
	public void setName(String name)
	{
		this.name  = name;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
}