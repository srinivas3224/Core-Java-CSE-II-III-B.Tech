class Test implements Cloneable
{
	int a=100;
	int b=200;
	public static void main(String[] args) throws Exception
	{
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=111;
		t.b=222;
		System.out.println(t.a);
		System.out.println(t.b);
t.a=555;
		t.b=666;
		System.out.println(t.a);
		System.out.println(t.b);
		Test t1=(Test) t.clone();
;
;
;
;
t.a=999;
		t.b=888;
		System.out.println(t.a);
		System.out.println(t.b);
System.out.println("===============");
		System.out.println(t1.a);
		System.out.println(t1.b);




	}
}