packages:
->in c,c++ predefined support interms of headerfiles.
->in java predefined support interms of packages
packages are two types :
1:predefined 
2:user defined packages
->java is a open source software
package=a package is a physical folder structure
->only one package statement is allowed in a source pack
->rules for naming a package
1.www.mvr.com
package=com.mvr
2.module name
com.mvr.cse23
3.functionalties
com.mvr.cse23.corejava
4.sub functionalites
com.mvr.cse23.corejava.ds
->the number of packages in java is 14
14->150->7k->7L



package com.mvr.cse23.corejava.ds;
class A
{
}
class B
{
}
class C
{
}
class D
{
}
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("This is test class");
	}
}

>javac -d . Test.java
>java com.mvr.cse23.corejava.ds.Test
->command for listing all predefined methods
-->javap com.mvr.cse23.corejava.ds.Test
-->javap java.lang.String;

