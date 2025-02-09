package test2;

public class TestingConstructor
{
	
  void TestingConstructor()
  {
    System.out.println("Amsterdam");	
  }

  TestingConstructor()
  {
	  super();
    System.out.println("Antarctica");	
  }
	
  public static void main(String[] args)
  {
    TestingConstructor tc = new TestingConstructor();

//    tc.TestingConstructor();
  }
}