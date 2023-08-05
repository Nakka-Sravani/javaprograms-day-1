package JourneyCalculator;

import java.util.Scanner;

public class JurneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		System.out.println(journeyCalculator.calculateDistance(speed,time));
	}

}
