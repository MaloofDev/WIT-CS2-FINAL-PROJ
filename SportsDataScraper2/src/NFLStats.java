
public class NFLStats {
private float GP, TYDS, TYDSPG, PYDS, PYDSPG, RYDS, RYDSPG, PTS, PTSPG;
	
	private String name;
	
	public NFLStats(String name, float[] stats) 
	{
		
		this.name = name;
		GP = stats[0];
		TYDS = stats[1];
		TYDSPG = stats[2];
		PYDS = stats[3];
		PYDSPG = stats[4];
		RYDS = stats[5];
		RYDSPG = stats[6];
		PTS = stats[7];
		PTSPG = stats[8];
		
		
		
		
	}
	
	public float getGP() 
	{
		return GP;
	}
	public float getTYDS() 
	{
		return TYDS;
	}
	public float getTYDSPG() 
	{
		return TYDSPG;
	}
	public float getPYDS() 
	{
		return PYDS;
	}
	public float getPYDSPG() 
	{
		return PYDS;
	}
	public float getRYDS() 
	{
		return RYDSPG;
	}
	public float getRYDSPG() 
	{
		return RYDSPG;
	}
	public float getPTS() 
	{
		return PTS;
	}
	public float getPTSPG() 
	{
		return PTSPG;
	}
	public String getName() {
		return name;
	}
}
	
	
