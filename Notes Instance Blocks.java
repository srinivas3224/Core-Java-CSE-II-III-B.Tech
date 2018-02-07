

uses:
1.Logic
2. Init of variables

==============================
class Test 
{
	Test()
	{
		System.out.println("This Is Constructor......");
	}

	{
		System.out.println("This Is Inatance Block......");
	
	}
	public static void main(String[] args) 
	{
		Test t=new Test();

	}
}
========================================
//  ??????????????????????????????????????????????????? difference
class Test 
{
	Test()
	{
		System.out.println("This Is 0 arg Constructor......");
	}

    
	Test(int a)
	{
		System.out.println("This Is 1 arg Constructor......");
	}


	
	Test(int a,int b)
	{
		System.out.println("This Is 0 arg Constructor......");
	}

	
	{
		System.out.println("This is Instance Block................");
	}

	public static void main(String[] args) 
	{
		Test t=new Test();
		new Test(10);
		new Test(10,23);

		
	}
}

D:\Core Java\MyProg>java Test
This is Instance Block................
This Is 0 arg Constructor......
This is Instance Block................
This Is 1 arg Constructor......
This is Instance Block................
This Is 0 arg Constructor......

=============================================================================
TOP TO BOTTOM


class Test 
{
	Test()
	{
		System.out.println("This Is 0 arg Constructor......");
	}

   
	{
		System.out.println("This is Instance Block..1..............");
	}
	{
		System.out.println("This is Instance Block..2..............");
	}

{
		System.out.println("This is Instance Block...3.............");
	}


	public static void main(String[] args) 
	{
		Test t=new Test();
	


		
	}
}


D:\Core Java\MyProg>java test
Error: Could not find or load main class test

D:\Core Java\MyProg>java Test
This is Instance Block..1..............
This is Instance Block..2..............
This is Instance Block...3.............
This Is 0 arg Constructor......
===============================================================

class Test 
{

	int rno;

	{
		rno=200;
	}
void disp()
	{
	System.out.println("Rno is :"+rno);
	}

	public static void main(String[] args) 
	{
		Test t=new Test();
	     t.disp();
               

		
	}
}
