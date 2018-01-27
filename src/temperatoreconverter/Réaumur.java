package temperatoreconverter;

public class Réaumur extends Unit {
    @Override
    double convertToCelsius(Double convertFrom) {
        return convertFrom * 5.4;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return convertFrom * 9/4 + 32;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return convertFrom * 5/4 + 273.15;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return convertFrom * 9/4 + 491.67;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return (80 - convertFrom) * 15/8;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return convertFrom * 33/80;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return convertFrom;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return convertFrom * 21/32 + 7.5;
    }
}
