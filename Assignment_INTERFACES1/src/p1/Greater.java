package p1;
public class Greater implements IComparable 
{
	public int comparable(int x, int y)
	{
		if (x>y)
		{
			return x;
		}
		else {
			return y;
		}
	}

}
