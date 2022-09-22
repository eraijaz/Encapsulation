class Alien
{
	private int age;
	private String name;
	public void setAge( int x)
	
	{
		age=x;
	}
	public void setName( String x)
		
		{
			name=x;
		}
	public int  getAge()
	
	{
		return age;
	}
	public String getName()
	
	{
		return name;
	}
}



public class ExampleEncp {

	public static void main(String[] args) {
		Alien a =new Alien();
		//a.age=55;
		a.setAge(20);
		a.setName("aijaz");
		System.out.println(a.getAge());
		System.out.println(a.getName());
		

	}

}
