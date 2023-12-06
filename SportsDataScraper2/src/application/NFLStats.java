package application;

import javafx.beans.property.SimpleFloatProperty;

public class NFLStats extends TeamStats {
private SimpleFloatProperty GP, TYDS, TYDSPG, PYDS, PYDSPG, RYDS, RYDSPG, PTS, PTSPG;
	
	private String name;
	
	public NFLStats(String name, float[] stats) 
	{
		
		this.name = name;
		GP = new SimpleFloatProperty(stats[0]);
		TYDS = new SimpleFloatProperty(stats[1]);
		TYDSPG = new SimpleFloatProperty(stats[2]);
		PYDS = new SimpleFloatProperty(stats[3]);
		PYDSPG = new SimpleFloatProperty(stats[4]);
		RYDS = new SimpleFloatProperty(stats[5]);
		RYDSPG = new SimpleFloatProperty(stats[6]);
		PTS = new SimpleFloatProperty(stats[7]);
		PTSPG =  new SimpleFloatProperty(stats[8]);
		
		
		
		
	}
	
	public SimpleFloatProperty getGP() 
	{
		return GP;
	}
	public SimpleFloatProperty getTYDS() 
	{
		return TYDS;
	}
	public SimpleFloatProperty getTYDSPG() 
	{
		return TYDSPG;
	}
	public SimpleFloatProperty getPYDS() 
	{
		return PYDS;
	}
	public SimpleFloatProperty getPYDSPG() 
	{
		return PYDS;
	}
	public SimpleFloatProperty getRYDS() 
	{
		return RYDSPG;
	}
	public SimpleFloatProperty getRYDSPG() 
	{
		return RYDSPG;
	}
	public SimpleFloatProperty getPTS() 
	{
		return PTS;
	}
	public SimpleFloatProperty getPTSPG() 
	{
		return PTSPG;
	}
	public String getName() {
		return name;
	}
}
	
	
