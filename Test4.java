


interface It1
{
	void m1();
	void m2();
	void m3();
	


}
class Test1 implements It1
{
public void m1()
	{
	System.out.println("This is m1 method");
		
		
	}


public void m2()
	{
	System.out.println("This is m2 method");
		
		
	}


public void m3()
	{
	System.out.println("This is m3 method");
	}

public void m4()
	{
	System.out.println("This is m4 method");
	}

	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		t.m1();
		t.m2();
		t.m3();
	
	It1 t1=new Test1();
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();

	}
}
