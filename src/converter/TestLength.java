package converter;

/**
 * TestLength prints all the length units. Print their names and values. Use the
 * built-in static values() method to get all the Length members.
 * 
 * @author Kornphon Noiprasert
 */
public class TestLength {

	/**
	 * Configure and start the test
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Length[] lengths = Length.values();
		// use the values
		for (Length x : lengths)
			System.out.println(x.toString() + " = " + x.getUnit());
	}

}
