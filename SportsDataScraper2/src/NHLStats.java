
public class NHLStats {
	private float GP, GFPG, A, PTS, PPG, PPP, SHG, S, SP, PIM, PKP, SOA, SOG, SOP,GAPG,W,L,OTL,SA,GA,SVP,SO,SOSA,SOS,SOSP;

	private String name;

	public NHLStats(int i, String name, float[] stats) {
		if (i == 1) {
			this.name = name;
			GP = stats[0];
			GFPG = stats[1];
			A = stats[2];
			PTS = stats[3];
			PPG = stats[4];
			PPP = stats[5];
			SHG = stats[6];
			S = stats[7];
			SP = stats[8];
			PIM = stats[9];
			PKP = stats[10];
			SOA = stats[11];
			SOG = stats[12];
			SOP = stats[13];
		} else {
			this.name = name;
			GP = stats[0];
			GAPG = stats[1];
			W = stats[2];
			L = stats[3];
			OTL = stats[4];
			SA = stats[5];
			GA = stats[6];
			S = stats[7];
			SVP = stats[8];
			SO = stats[9];
			SOSA = stats[10];
			SOS = stats[11];
			SOSP = stats[12];
		

		}

	}

	public float getGP() {
		return GP;
	}

	public float getGFPG() {
		return GFPG;
	}

	public float getA() {
		return A;
	}

	public float getPTS() {
		return PTS;
	}
	public float getPPG() {
		return PPG;
	}

	public float getPPP() {
		return PPP;
	}

	public float getSHG() {
		return SHG;
	}

	public float getS() {
		return S;
	}

	public float getSP() {
		return SP;
	}

	public float getPIM() {
		return PIM;
	}
	public float getPKP() {
		return PKP;
	}
	public float getSOA() {
		return SOA;
	}
	public float getSOG() {
		return SOG;
	}
	public float getSOP() {
		return SOP;
	}
	public float getGAPG() {
		return GAPG;
	}
	public float getW() {
		return W;
	}
	public float getL() {
		return L;
	}
	public float getOTL() {
		return OTL;
	}
	public float getSA() {
		return SA;
	}
	public float getGA() {
		return GA;
	}
	public float getSVP() {
		return SVP;
	}
	public float getSO() {
		return SO;
	}
	public float getSOSA() {
		return SOSA;
	}
	public float getSOS() {
		return SOS;
	}
	public float getSOSP() {
		return SOSP;
	}
	public String getName() {
		return name;
	}
}
