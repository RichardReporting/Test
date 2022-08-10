package The_Required_Tasks.OOP.TemperatureConverter;

public class KelvinConverter implements Converter{

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
