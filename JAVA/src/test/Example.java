package test;

class Example
{
 static String eName;
 public String eId;
 static int age;
 
 

@Override
public String toString() {
	return "Example [eName=" + eName + ", eId=" + eId + ", age=" + age + "]";
}



public static void main(String[]  args)
{
	Example e= new Example();
	e.eName="manoj";
	e.eId="M123";
	e.age=24;
	
	
	
	e.eName="jaya";
	e.eId="j123";
	e.age=23;
	
	System.out.println(e);
	
	Example e2=new Example();
	
	

	e2.eName="kiran";
	e2.eId="j123";
	e2.age=23;
	System.out.println(e);
	System.out.println(e2);

}

}

