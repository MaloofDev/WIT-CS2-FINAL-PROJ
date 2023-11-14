
public class MLBPitchingStats {
	 private double GP, W, L, ERA, SV, CG, SHO, QS, IP, H, ER, HR, BB, SO, OBA, WHIP;
	    // Field for the team name
	    private String team;

	    // Constructor to initialize the object with team name and stats
	    public MLBPitchingStats(String name, float[] stats) {
	        team = name;
	        GP = stats[0];
	        W = stats[1];
	        L = stats[2];
	        ERA = stats[3];
	        SV = stats[4];
	        CG = stats[5];
	        SHO = stats[6];
	        QS = stats[7];
	        IP = stats[8];
	        H = stats[9];
	        ER = stats[10];
	        HR = stats[11];
	        BB = stats[12];
	        SO = stats[13];
	        OBA = stats[14];
	        WHIP = stats[15];

	    }

	    // Getter methods for retrieving individual statistics
	    public double getGP() {
	        return GP;
	    }

	    public double getW() {
	        return W;
	    }

	    public double getL() {
	        return L;
	    }

	    public double getERA() {
	        return ERA;
	    }

	    public double getSV() {
	        return SV;
	    }

	    public double getCG() {
	        return CG;
	    }

	    public double getSHO() {
	        return SHO;
	    }

	    public double getQS() {
	        return QS;
	    }

	    public double getIP() {
	        return IP;
	    }

	    public double getH() {
	        return H;
	    }

	    public double getER() {
	        return ER;
	    }

	    public double getHR() {
	        return HR;
	    }

	    public double getBB() {
	        return BB;
	    }

	    public double getSO() {
	        return SO;
	    }

	    public double getOBA() {
	        return OBA;
	    }

	    public double getWHIP() {
	        return WHIP;
	    }


	    // Getter method for retrieving the team name
	    public String getName() {
	        return team;
	    }

}
