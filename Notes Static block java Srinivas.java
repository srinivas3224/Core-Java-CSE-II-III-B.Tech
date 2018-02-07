


class Test
{
	int a=10;
	static int b=20;
	void m1(int a)
	{
		System.out.println("This is instance method");
	}

	
	static void m2(int a)
	{
		System.out.println("This is static method");
	}

	Test()
	{
		System.out.println("0 org cons.....");
	}

Test(int a)
	{
		System.out.println("1 org cons.....");
	}

	{
		System.out.println("This Instance Block");
	}

	static	{
		System.out.println("This static Block");
	}

public static void main(String[] args)
	{
      Test t=new Test();
	  Test t1=new Test(18);
	  t1.m1(10);
	  Test.m2(22);


	}



}


D:\Core Java\MyProg>javac Test5.java

D:\Core Java\MyProg>java Test
This static Block
This Instance Block
0 org cons.....
This Instance Block
1 org cons.....
This is instance method
This is static method

==========================================================
without main() method   <java 1.5 


=============================================================
for name


class A
{
	static{
		System.out.println("This is class A Static Method");
	}
}

class B
{
	static{
		System.out.println("This is class B Static Method");
	}
}


class C
{
	static{
		System.out.println("This is class C Static Method");
	}
}



class D
{
	static{
		System.out.println("This is class D Static Method");
	}

	public static void main(String[] args) throws ClassNotFoundException
	{
		D d=new D();
		Class.forName("B");
	}
}
===========================================================================


