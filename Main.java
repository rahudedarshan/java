/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
	public static void main(String[] args) 
	{
	  // System.out.println("Hello World");
	   Employee e =new Employee();
	   Employee e1 =new Employee();
	   
	   // first call
	   e.display();
	   // second call
	   e1.display();
	   
	    
	}
}

 class Employee
{
    public
        String name="Darshan";
	    int age=20;
	    String city="pune"; 
	    
	  void display()
	  {
	      System.out.println("Name of Employee is : "+name);
	      System.out.println("Age of Employee is : "+age);
	      System.out.println("City of Employee is : "+city);
	      System.out.println();
	  }
}
