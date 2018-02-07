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