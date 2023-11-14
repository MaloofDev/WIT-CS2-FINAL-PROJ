
public class MLBStats 
{
	private float GP, AB, R, H, TwoB, ThreeB, HR, RBI, TB, BB, SO, SB, AVG, OBP, SLG, OPS;
	
	private String name;
	
	public MLBStats(String name, float[] stats) 
	{
		this.name = name;
		GP = stats[0];
		AB = stats[1];
		R = stats[2];
		H = stats[3];
		TwoB = stats[4];
		ThreeB = stats[5];
		HR = stats[6];
		RBI = stats[7];
		TB = stats[8]; 
		BB = stats[9];
		SO = stats[10];
		SB = stats[11];
		AVG = stats[12];
		OBP = stats[13];
		SLG = stats[14];
		OPS = stats[15];
	}
	
	public float getGP() 
	{
		return GP;
	}
	
	public float getOPS() 
	{
		return OPS;
	}
}
