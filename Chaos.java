public class Chaos {
	public static void main(String[] args) {
		// Declare rate of growth as a double
		double r = Double.parseDouble(args[0]);
		// Declare initial population
		double x = 0.01;
		// Initialize time with variable 't'
		int t = 0;

		while (x <= 1.0) {
			t += 1;
			x = r*x*(1-x);
			//System.out.println("The population at time " + t + " is " + x);
			if (x >= 1.0) {
				System.out.println("The population has stabilized at time " + t);
			}
			else if (x <= 0) {
				System.out.println("The population is now extinct at time " + t);
			}
		}

	}
}