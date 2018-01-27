package temperatoreconverter;

import java.text.DecimalFormat;

import static temperatoreconverter.Gui.getUserInput;

abstract public class Unit {
    abstract double convertToCelsius(Double convertFrom);
    abstract double convertToFahrenheit(Double convertFrom);
    abstract double convertToKelvin(Double convertFrom);
    abstract double convertToRankine(Double convertFrom);
    abstract double convertToDelisle(Double convertFrom);
    abstract double convertToNewton(Double convertFrom);
    abstract double convertToRéaumur(Double convertFrom);
    abstract double convertToRømer(Double convertFrom);

    @Override
    public String toString() {
        String header1;
        String header2;
        String lines;
        String conversions1;
        String conversions2;
        String result1;
        String result2;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        header1 = String.format("\tCelsius\t\tFahrenheit\t\tKelvin\t\tRankine\n");
        header2 = String.format("\tDelisle\t\tNewton\t\tRéaumur\t\tRømer\n");
        lines = "=============================================================================================================\n";
        conversions1 = "\t" + df.format(convertToCelsius(getUserInput())) + "°C\t\t" + df.format(convertToFahrenheit(getUserInput())) + "°F\t\t" + df.format(convertToKelvin(getUserInput())) + "K\t\t" + df.format(convertToRankine(getUserInput())) + "°R\n";
        conversions2 = "\t" + df.format(convertToDelisle(getUserInput())) + "°De\t\t" + df.format(convertToNewton(getUserInput())) + "°N\t\t" + df.format(convertToRéaumur(getUserInput())) + "°Ré\t\t" + df.format(convertToRømer(getUserInput())) + "°Rø\n";
        result1 = header1 + conversions1;
        result2 = header2 + conversions2;

        return result1 + lines + result2;
    }
}
