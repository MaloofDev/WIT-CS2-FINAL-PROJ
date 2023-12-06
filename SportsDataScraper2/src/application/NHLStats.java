package application;

import javafx.beans.property.SimpleFloatProperty;

public class NHLStats {
	private SimpleFloatProperty GP, GFPG, A, PTS, PPG, PPP, SHG, S, SP, PIM, PKP, SOA, SOG, SOP,GAPG,W,L,OTL,SA,GA,SVP,SO,SOSA,SOS,SOSP;

	private String name;

	public NHLStats(int i, String name, float[] stats) {
		if (i == 1) {
			this.name = name;
			GP = new SimpleFloatProperty(stats[0]);
			GFPG = new SimpleFloatProperty(stats[1]);
			A = new SimpleFloatProperty(stats[2]);
			PTS = new SimpleFloatProperty(stats[3]);
			PPG = new SimpleFloatProperty(stats[4]);
			PPP = new SimpleFloatProperty(stats[5]);
			SHG = new SimpleFloatProperty(stats[6]);
			S = new SimpleFloatProperty(stats[7]);
			SP = new SimpleFloatProperty(stats[8]);
			PIM = new SimpleFloatProperty(stats[9]);
			PKP = new SimpleFloatProperty(stats[10]);
			SOA = new SimpleFloatProperty(stats[11]);
			SOG = new SimpleFloatProperty(stats[12]);
			SOP = new SimpleFloatProperty(stats[13]);
		} else {
			this.name = name;
			GP = new SimpleFloatProperty(stats[0]);
			GAPG = new SimpleFloatProperty(stats[1]);
			W = new SimpleFloatProperty(stats[2]);
			L = new SimpleFloatProperty(stats[3]);
			OTL = new SimpleFloatProperty(stats[4]);
			SA = new SimpleFloatProperty(stats[5]);
			GA = new SimpleFloatProperty(stats[6]);
			S = new SimpleFloatProperty(stats[7]);
			SVP = new SimpleFloatProperty(stats[8]);
			SO = new SimpleFloatProperty(stats[9]);
			SOSA = new SimpleFloatProperty(stats[10]);
			SOS = new SimpleFloatProperty(stats[11]);
			SOSP = new SimpleFloatProperty(stats[12]);
		

		}

	}

	public SimpleFloatProperty getGP() {
		return GP;
	}

	public SimpleFloatProperty getGFPG() {
		return GFPG;
	}

	public SimpleFloatProperty getA() {
		return A;
	}

	public SimpleFloatProperty getPTS() {
		return PTS;
	}
	public SimpleFloatProperty getPPG() {
		return PPG;
	}

	public SimpleFloatProperty getPPP() {
		return PPP;
	}

	public SimpleFloatProperty getSHG() {
		return SHG;
	}

	public SimpleFloatProperty getS() {
		return S;
	}

	public SimpleFloatProperty getSP() {
		return SP;
	}

	public SimpleFloatProperty getPIM() {
		return PIM;
	}
	public SimpleFloatProperty getPKP() {
		return PKP;
	}
	public SimpleFloatProperty getSOA() {
		return SOA;
	}
	public SimpleFloatProperty getSOG() {
		return SOG;
	}
	public SimpleFloatProperty getSOP() {
		return SOP;
	}
	public SimpleFloatProperty getGAPG() {
		return GAPG;
	}
	public SimpleFloatProperty getW() {
		return W;
	}
	public SimpleFloatProperty getL() {
		return L;
	}
	public SimpleFloatProperty getOTL() {
		return OTL;
	}
	public SimpleFloatProperty getSA() {
		return SA;
	}
	public SimpleFloatProperty getGA() {
		return GA;
	}
	public SimpleFloatProperty getSVP() {
		return SVP;
	}
	public SimpleFloatProperty getSO() {
		return SO;
	}
	public SimpleFloatProperty getSOSA() {
		return SOSA;
	}
	public SimpleFloatProperty getSOS() {
		return SOS;
	}
	public SimpleFloatProperty getSOSP() {
		return SOSP;
	}
	public String getName() {
		return name;
	}
}
