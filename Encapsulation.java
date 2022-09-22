class Books
{
	private int pgNo;
	public void setpgNo(int x)
	{
	pgNo=x;	
	}
	public int getpgNo()
	{
		return pgNo;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Books b=new Books();
		//b.pgNo=100;
		//System.out.println(b.pgNo);
		b.setpgNo(100);
		System.out.println(b.getpgNo());
	}

}
