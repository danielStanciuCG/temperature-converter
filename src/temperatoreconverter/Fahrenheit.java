package temperatoreconverter;

public class Fahrenheit extends Unit {

    @Override
    double convertToCelsius(Double convertFrom) {
        return (convertFrom - 32) * 5/9;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return convertFrom;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return (convertFrom + 459.67) * 5/9;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return convertFrom + 459.67;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return (212 - convertFrom) * 5/6;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return (convertFrom - 32) * 11/60;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return (convertFrom - 32) * 4/9;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return (convertFrom - 32) * 7/24 + 7.5;
    }
}
