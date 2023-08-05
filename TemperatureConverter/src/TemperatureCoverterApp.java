import java.util.Scanner;

public class TemperatureCoverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	TemperatureConverter temperatureConverter = new TemperatureConverter();

	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(scan.nextDouble()));
}
}
