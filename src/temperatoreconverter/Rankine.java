package temperatoreconverter;

public class Rankine extends Unit {
    @Override
    double convertToCelsius(Double convertFrom) {
        return (convertFrom - 491.67) * 5/9;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return convertFrom - 459.67;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return convertFrom * 5/9;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return convertFrom;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return (671.67 - convertFrom) * 5/6;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return (convertFrom - 491.67) * 11/60;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return (convertFrom - 491.67) * 4/9;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return (convertFrom - 491.67) * 7/24 + 7.5;
    }
}
