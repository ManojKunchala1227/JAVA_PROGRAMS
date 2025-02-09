package p1;

public class Smaller implements IComparable{
	public int comparable(int x, int y) 
	{
		if(x<y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

}
