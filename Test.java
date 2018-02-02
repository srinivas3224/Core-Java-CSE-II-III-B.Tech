class Test
{
	int a=100;
	int b=50;
void m1(int a,int b)
	{
	System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		new Test().m1(200,300);

		Test t=new Test();
		t.m1(1000,2000);
	}
}
