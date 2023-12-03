
public class MLBStats 
{
	private float GP, AB, R, H, DBL, TRPL, HR, RBI, TB, BB, SO, SB, AVG, OBP, SLG, OPS;
	
	private String name;
	
	public MLBStats(String name, float[] stats) 
	{
		this.name = name;
		GP = stats[0];
		AB = stats[1];
		R = stats[2];
		H = stats[3];
		DBL = stats[4];
		TRPL = stats[5];
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
	public float getAB() {
		return AB;
	}
	public float getR() {
		return R;
	}
	public float getH() {
		return H;
	}
	public float getDBL() {
		return DBL;
	}
	public float getTRPL() {
		return TRPL;
	}
	public float getHR() {
		return HR;
	}
	public float getRBI() {
		return RBI;
	}
	public float getTB() {
		return TB;
	}
	public float getBB() {
		return BB;
	}
	public float getSO() {
		return SO;
	}
	public float getSB() {
		return SB;
	}
	public float getAVG() {
		return AVG;
	}
	public float getOBP() {
		return OBP;
	}
	public float getSLG() {
		return SLG;
	}
	public float getOPS() 
	{
		return OPS;
	}
	public String getName() {
		return name;
	}
}
