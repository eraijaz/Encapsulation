class Fan
{
	private int cost;
	private String brand;
	
	public void setCost(int cost)
	{
		this.cost=cost;     //whenever there is a conflict b/w local and instance variable 
					 //this is called shadowing problem 
						//and is resolved by"this " keyword
		
	}
	public void setBrand(String brand)
	{
		this.brand =brand;
	}
	public int getCost()
	{
		return cost;
	}
	public String getBrand()
	
	{
		return brand;
	}
	
	
}
public class Encap3 {

	public static void main(String[] args) {
		Fan f=new Fan();
		f.setCost(100);
		f.setBrand("Aj");
		System.out.println(f.getCost()+"  "+f.getBrand());
		

	}

}
