package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class NBAStats {
	// Fields for team statistics
	private DoubleProperty GP, PTS, FGM, FGA, FGP, TPM, TPA, TPP, FTM, FTA, FTP, OR, DR, REB, AST, STL, BLK, TO, PF;
	// Field for the team name
	private String team;

	public NBAStats(String name, double[] stats) {
		team = name;
		GP = new SimpleDoubleProperty(stats[0]);
		PTS = new SimpleDoubleProperty(stats[1]);
		FGM = new SimpleDoubleProperty(stats[2]);
		FGA = new SimpleDoubleProperty(stats[3]);
		FGP = new SimpleDoubleProperty(stats[4]);
		TPM = new SimpleDoubleProperty(stats[5]);
		TPA = new SimpleDoubleProperty(stats[6]);
		TPP = new SimpleDoubleProperty(stats[7]);
		FTM = new SimpleDoubleProperty(stats[8]);
		FTA = new SimpleDoubleProperty(stats[9]);
		FTP = new SimpleDoubleProperty(stats[10]);
		OR = new SimpleDoubleProperty(stats[11]);
		DR = new SimpleDoubleProperty(stats[12]);
		REB = new SimpleDoubleProperty(stats[13]);
		AST = new SimpleDoubleProperty(stats[14]);
		STL = new SimpleDoubleProperty(stats[15]);
		BLK = new SimpleDoubleProperty(stats[16]);
		TO = new SimpleDoubleProperty(stats[17]);
		PF = new SimpleDoubleProperty(stats[18]);
	}

	// Getter methods for retrieving individual statistics
	public DoubleProperty getGP() {
		return GP;
	}

	public DoubleProperty getPTS() {
		return PTS;
	}

	public DoubleProperty getFGM() {
		return FGM;
	}

	public DoubleProperty getFGA() {
		return FGA;
	}

	public DoubleProperty getFGP() {
		return FGP;
	}

	public DoubleProperty getTPM() {
		return TPM;
	}

	public DoubleProperty getTPA() {
		return TPA;
	}

	public DoubleProperty getTPP() {
		return TPP;
	}

	public DoubleProperty getFTM() {
		return FTM;
	}

	public DoubleProperty getFTA() {
		return FTA;
	}

	public DoubleProperty getFTP() {
		return FTP;
	}

	public DoubleProperty getOR() {
		return OR;
	}

	public DoubleProperty getDR() {
		return DR;
	}

	public DoubleProperty getREB() {
		return REB;
	}

	public DoubleProperty getAST() {
		return AST;
	}

	public DoubleProperty getSTL() {
		return STL;
	}

	public DoubleProperty getBLK() {
		return BLK;
	}

	public DoubleProperty getTO() {
		return TO;
	}

	public DoubleProperty getPF() {
		return PF;
	}

	// Getter method for retrieving the team name
	public String getName() {
		return team;
	}
}
