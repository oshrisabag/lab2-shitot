import java.util.ArrayList;
import java.util.List;

/** defined object for shared data
 * @author adipeled1
 */
public class SharedData 
{
	/**
	 * array is the List of the shared data
	 */
	private List<Integer> array=new ArrayList<>();//now its arraylist
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * constructor method
	 * @param array array of shared data
	 * @param b size
	 */
	public SharedData(List<Integer> array, int b) {
		this.array=array;
		this.b = b;
	}

	/**
	 * getter for winArray
	 * @return the boolean array winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * setter for winArray
	 * @param winArray the boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * getter for the List of shared data
	 * @return array
	 */
	public List<Integer> getArray() 
	{
		return array;
	}

	/**
	 * getter for b
	 * @return b size
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * getter for flag
	 * @return flag status
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * setter for flag
	 * @param flag status
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
