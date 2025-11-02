import java.util.ArrayList;
import java.util.List;

public class SharedData 
{
	private List<Integer> array=new ArrayList<>();//check
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(int[] array, int b) {
		for (int num:array) this.array.add(num);
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

	public List<Integer> getArray() 
	{
		return array;
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
