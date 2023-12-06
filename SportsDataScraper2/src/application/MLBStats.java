package application;

import javafx.beans.property.SimpleFloatProperty;

public class MLBStats {
	private SimpleFloatProperty GP, AB, R, H, DBL, TRPL, HR, RBI, TB, BB, SO, SB, AVG, OBP, SLG, OPS;

	private String name;

	public MLBStats(String name, float[] stats) {
		this.name = name;
		GP = new SimpleFloatProperty(stats[0]);
		AB = new SimpleFloatProperty(stats[1]);
		R = new SimpleFloatProperty(stats[2]);
		H = new SimpleFloatProperty(stats[3]);
		DBL = new SimpleFloatProperty(stats[4]);
		TRPL = new SimpleFloatProperty(stats[5]);
		HR = new SimpleFloatProperty(stats[6]);
		RBI = new SimpleFloatProperty(stats[7]);
		TB = new SimpleFloatProperty(stats[8]);
		BB = new SimpleFloatProperty(stats[9]);
		SO = new SimpleFloatProperty(stats[10]);
		SB = new SimpleFloatProperty(stats[11]);
		AVG = new SimpleFloatProperty(stats[12]);
		OBP = new SimpleFloatProperty(stats[13]);
		SLG = new SimpleFloatProperty(stats[14]);
		OPS = new SimpleFloatProperty(stats[15]);
	}

	// Getter methods
	public SimpleFloatProperty getGP() {
		return GP;
	}

	public SimpleFloatProperty getAB() {
		return AB;
	}

	public SimpleFloatProperty getR() {
		return R;
	}

	public SimpleFloatProperty getH() {
		return H;
	}

	public SimpleFloatProperty getDBL() {
		return DBL;
	}

	public SimpleFloatProperty getTRPL() {
		return TRPL;
	}

	public SimpleFloatProperty getHR() {
		return HR;
	}

	public SimpleFloatProperty getRBI() {
		return RBI;
	}

	public SimpleFloatProperty getTB() {
		return TB;
	}

	public SimpleFloatProperty getBB() {
		return BB;
	}

	public SimpleFloatProperty getSO() {
		return SO;
	}

	public SimpleFloatProperty getSB() {
		return SB;
	}

	public SimpleFloatProperty getAVG() {
		return AVG;
	}

	public SimpleFloatProperty getOBP() {
		return OBP;
	}

	public SimpleFloatProperty getSLG() {
		return SLG;
	}

	public SimpleFloatProperty getOPS() {
		return OPS;
	}

	public String getName() {
		return name;
	}
}