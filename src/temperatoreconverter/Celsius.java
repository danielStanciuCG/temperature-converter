package temperatoreconverter;

public class Celsius extends Unit {
    @Override
    double convertToCelsius(Double convertFrom) {
        return convertFrom;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return convertFrom * 9/5 + 32;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return convertFrom + 273.15;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return (convertFrom + 273.15) * 9/5;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return (100 - convertFrom) * 3/2;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return convertFrom * 33/100;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return convertFrom * 4/5;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return convertFrom * 21/40 + 7.5;
    }
}