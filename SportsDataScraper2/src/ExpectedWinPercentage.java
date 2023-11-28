/**
 * 
 */

/**
 * 
 */
public class ExpectedWinPercentage {

	public float calculateExpectedWinPercentage(float pointsFor, float pointsAgainst) {
		float expectedWinPercentage = (float) ((float) (Math.pow(pointsFor, 2))
				/ (Math.pow(pointsFor, 2) + Math.pow(pointsAgainst, 2)));
		return expectedWinPercentage;
	}

}
