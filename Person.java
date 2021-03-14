
/**
 * To demonstrate boolean.
 * 
 * @author Angelica Beristain
 * @version 14 March 2021
 */
public class Person {
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcoholUnits = 50; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21; // RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

	public boolean checkPulse() {
		boolean healthyPulse;
		healthyPulse = ((restPulse > 30) && (restPulse < 180));
		return healthyPulse;
	}

	public boolean checkAbuser() {
		boolean abuser;
		abuser = ((weeklyAlcoholUnits > RWAL) || (smoker));
		return abuser;
	}

	public void displayProfile() {
		System.out.println("���Health Profile��");

		System.out.println("Healthy pulse check = " + checkPulse());
		System.out.print("Abusing Body = " + checkAbuser());

	}

	// Put curseAndSwear method here
	// generates random no 1 to 5
	// displays a statement based on the number generated

	public void curseAndSwear() {
		int random;
		// define the range
		int max = 5;
		int min = 1;
		int range = max - min + 1;
		// generate the random number
		random = (int) (Math.random() * range) + 1;
		System.out.println(random);

	}

}
