
public class Launch2 {
	
	
	
	static int  a,b,c;
	static
	{
		System.out.println("Static block");
		a=10;b=20;c=40;
		
	}
	static void disp1()
	{
		System.out.println("static method disp1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	int m,n,o;
	{
		System.out.println("non static block");
		m=10;n=200;o=2000;
		
	}
	void disp2()
	{
		System.out.println("non static block");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method");
		disp1();
		Launch2 l=new Launch2();
		l.disp2();
		
		

	}

}
