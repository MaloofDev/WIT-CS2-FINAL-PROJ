package application;

import javafx.beans.property.SimpleFloatProperty;

public class MLBPitchingStats {
	private SimpleFloatProperty GP, W, L, ERA, SV, CG, SHO, QS, IP, H, ER, HR, BB, SO, OBA, WHIP;

	// Field for the team name
	private String team;

	// Constructor to initialize the object with team name and stats
	public MLBPitchingStats(String name, float[] stats) {
		team = name;
		GP = new SimpleFloatProperty(stats[0]);
		W = new SimpleFloatProperty(stats[1]);
		L = new SimpleFloatProperty(stats[2]);
		ERA = new SimpleFloatProperty(stats[3]);
		SV = new SimpleFloatProperty(stats[4]);
		CG = new SimpleFloatProperty(stats[5]);
		SHO = new SimpleFloatProperty(stats[6]);
		QS = new SimpleFloatProperty(stats[7]);
		IP = new SimpleFloatProperty(stats[8]);
		H = new SimpleFloatProperty(stats[9]);
		ER = new SimpleFloatProperty(stats[10]);
		HR = new SimpleFloatProperty(stats[11]);
		BB = new SimpleFloatProperty(stats[12]);
		SO = new SimpleFloatProperty(stats[13]);
		OBA = new SimpleFloatProperty(stats[14]);
		WHIP = new SimpleFloatProperty(stats[15]);
	}

	// Getter methods for retrieving individual statistics
	public SimpleFloatProperty getGP() {
		return GP;
	}

	public SimpleFloatProperty getW() {
		return W;
	}

	public SimpleFloatProperty getL() {
		return L;
	}

	public SimpleFloatProperty getERA() {
		return ERA;
	}

	public SimpleFloatProperty getSV() {
		return SV;
	}

	public SimpleFloatProperty getCG() {
		return CG;
	}

	public SimpleFloatProperty getSHO() {
		return SHO;
	}

	public SimpleFloatProperty getQS() {
		return QS;
	}

	public SimpleFloatProperty getIP() {
		return IP;
	}

	public SimpleFloatProperty getH() {
		return H;
	}

	public SimpleFloatProperty getER() {
		return ER;
	}

	public SimpleFloatProperty getHR() {
		return HR;
	}

	public SimpleFloatProperty getBB() {
		return BB;
	}

	public SimpleFloatProperty getSO() {
		return SO;
	}

	public SimpleFloatProperty getOBA() {
		return OBA;
	}

	public SimpleFloatProperty getWHIP() {
		return WHIP;
	}

	// Getter method for retrieving the team name
	public String getName() {
		return team;
	}
}