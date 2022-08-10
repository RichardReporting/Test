package The_Required_Tasks.OOP.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        double baseValueInCelsius = 32;
        KelvinConverter kelvinConverter = new KelvinConverter();
        FarenheitConverter farenheitConverter = new FarenheitConverter();
        System.out.println(kelvinConverter.getConvertedValue(baseValueInCelsius));
        System.out.println(farenheitConverter.getConvertedValue(baseValueInCelsius));
    }
}
