package The_Required_Tasks.OOP.TemperatureConverter;

public class FarenheitConverter implements  Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (baseValue * 1.8) + 32 ;
    }
}
