package temperatoreconverter;

public class Delisle extends Unit {

    @Override
    double convertToCelsius(Double convertFrom) {
        return 100 - convertFrom * 2/3;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return 212 - convertFrom * 6/5;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return 373.15 - convertFrom * 2/3;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return 671.67 - convertFrom * 6/5;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return convertFrom;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return 33 - convertFrom * 11/50;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return 80 - convertFrom * 8/15;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return 60 - convertFrom * 7/20;
    }
}
