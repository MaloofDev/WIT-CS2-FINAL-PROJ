package application;

import javafx.beans.property.SimpleFloatProperty;

public class NFLDStats {
private SimpleFloatProperty DGP, DTYDS, DTYDSPG, DPYDS, DPYDSPG, DRYDS, DRYDSPG, DPTS, DPTSPG;
	
	private String name;
	
	public NFLDStats(String name, float[] stats) 
	{
		
		this.name = name;
		DGP = new SimpleFloatProperty(stats[0]);
		DTYDS = new SimpleFloatProperty(stats[1]);
		DTYDSPG = new SimpleFloatProperty(stats[2]);
		DPYDS = new SimpleFloatProperty(stats[3]);
		DPYDSPG = new SimpleFloatProperty(stats[4]);
		DRYDS = new SimpleFloatProperty(stats[5]);
		DRYDSPG = new SimpleFloatProperty(stats[6]);
		DPTS = new SimpleFloatProperty(stats[7]);
		DPTSPG =  new SimpleFloatProperty(stats[8]);
		
		
		
		
	}
	
	public SimpleFloatProperty getGP() 
	{
		return DGP;
	}
	public SimpleFloatProperty getTYDS() 
	{
		return DTYDS;
	}
	public SimpleFloatProperty getTYDSPG() 
	{
		return DTYDSPG;
	}
	public SimpleFloatProperty getPYDS() 
	{
		return DPYDS;
	}
	public SimpleFloatProperty getPYDSPG() 
	{
		return DPYDSPG;
	}
	public SimpleFloatProperty getRYDS() 
	{
		return DRYDS;
	}
	public SimpleFloatProperty getRYDSPG() 
	{
		return DRYDSPG;
	}
	public SimpleFloatProperty getPTS() 
	{
		return DPTS;
	}
	public SimpleFloatProperty getPTSPG() 
	{
		return DPTSPG;
	}
	public String getName() {
		return name;
	}
}
	
	
