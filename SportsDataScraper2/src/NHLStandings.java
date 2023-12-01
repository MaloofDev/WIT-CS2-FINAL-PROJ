public class NHLStandings {
private float W, L, PCT, GF, GA, xPCT;
	
	private String team;
	
	public NHLStandings(String name, float[] standings) {
		this.team = name;
		W = standings[0];
		L = standings[1];
		GF = standings[2];
		GA = standings[3];
		PCT = standings[4];
		xPCT = standings[5];
	}
	public float getW() {
		return W;
	}
	public float getL() {
		return L;
	}
	public float getGF() {
		return GF;
	}
	public float getGA() {
		return GA;
	}
	public float getPCT() {
		return PCT;
	}
	public float getxPCT() {
		return xPCT;
	}
	public String getTeam() {
		return team;
	}


}
