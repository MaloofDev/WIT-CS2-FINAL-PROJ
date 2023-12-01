public class MLBStandings {
	
	private float W, L, PCT, RS, RA, xPCT;
	
	private String team;
	
	public MLBStandings(String name, float[] standings) {
		this.team = name;
		W = standings[0];
		L = standings[1];
		PCT = standings[2];
		RS = standings[3];
		RA = standings[4];
		xPCT = standings[5];
	}
	public float getW() {
		return W;
	}
	public float getL() {
		return L;
	}
	public float getPCT() {
		return PCT;
	}
	public float getRS() {
		return RS;
	}
	public float getRA() {
		return RA;
	}
	public float getxPCT() {
		return xPCT;
	}
	public String getTeam() {
		return team;
	}

}
