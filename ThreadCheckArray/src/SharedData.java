import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> list;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> list, int b) {
		
		this.list = list;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return list;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
