package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter temperatureToBeConverted = new TemperatureConverter();

        System.out.println("10 degrees Celsius to Fahrenheit is: " + temperatureToBeConverted.celsiusToFahrenheit(10));
        System.out.println("50 degrees Fahrenheit to Celsius is: " + temperatureToBeConverted.fahrenheitToCelsius(50));
    }
    public double celsiusToFahrenheit(float degrees){
        return  (degrees * 1.8) + 32;
    }
    public double fahrenheitToCelsius(float degrees){
        return (degrees-32)/1.8;
    }
}
