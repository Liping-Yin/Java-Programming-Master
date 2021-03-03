package selfstudy;

public class Student {
	private String name;
	private int age;
	/**
	 * An instance variable can be final provided it is either assigned a value in its declaration or is assigned a value in every constructor in the class. 
	 * It is illegal to assign a value to a final instance variable, except inside a constructor.
	 * @param name
	 */
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	


}
