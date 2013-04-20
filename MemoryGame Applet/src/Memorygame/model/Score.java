package model;


//TODO Implement compareTo
public class Score implements Comparable<Score>
{
	// Instance Variables
	private String userName;
	private int numObjects;
	private int sequenceLength;
	private int time;
	
	// Constructor
	public Score(String un, int no, int sl, int t)
	{
		userName = un;
		numObjects = no;
		sequenceLength = sl;
		time = t;
	}
	
	// Instance Methods
	public int getNumObjects()
	{
		return numObjects;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public int getSequenceLength()
	{
		return sequenceLength;
	}
	
	public int getTime()
	{
		return time;
	}

	@Override
	public int compareTo(Score o)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
