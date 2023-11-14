/**
 * 
 */
package expected_win_percentage;

/**
 * 
 */
public class ExpectedWinPercentage {
	
	private static double calculateExpectedWinPercentage(int pointsFor, int pointsAgainst) {
		if (pointsFor == 0 || pointsAgainst == 0) {
			return 0.0;
		}
		double expectedWinPercentage = Math.pow(pointsFor, 2)/ (Math.pow(pointsFor, 2) + Math.pow(pointsAgainst, 2));
		return expectedWinPercentage;
	}

	public static void main(String[] args) {
		int a = 772;
		int b = 776;
		System.out.printf("%.3f%n", calculateExpectedWinPercentage(a, b));

	}

}
