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
