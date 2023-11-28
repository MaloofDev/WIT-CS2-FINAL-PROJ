class NBAStandings {
private float W, L, PCT, PF, PA, xPCT;
	
	private String team;
	
	public NBAStandings(String name, float[] standings) {
		this.team = name;
		W = standings[0];
		L = standings[1];
		PF = standings[2];
		PA = standings[3];
		PCT = standings[4];
		xPCT = standings[5];
	}
	public float getW() {
		return W;
	}
	public float getL() {
		return L;
	}
	public float getPF() {
		return PF;
	}
	public float getPA() {
		return PA;
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
