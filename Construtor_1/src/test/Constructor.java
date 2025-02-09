package test;
public class Constructor 
{
		String uName,fName,city,state,mId;
		int pWord,phNo;
		Constructor(String a,String b, String c, String d, String e, int f, int g)
		{
			uName=a;
			fName=b;
			city=c;
			state=d;
			mId=e;
			pWord=f;
			phNo=g;
				
			
		}
		
		public void getDetails()
		{
			System.out.println("Enter the name: "+uName);
			System.out.println("Enter the fname: "+fName);
			System.out.println("Enter the city: "+city);
			System.out.println("Enter the state: "+state);
			System.out.println("Enter the Mid:  "+mId);
			System.out.println("Enter the Pword: "+pWord);
			System.out.println("Enter the phNo: "+phNo);
		}
		
		
		
}
