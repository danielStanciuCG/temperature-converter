package temperatoreconverter;

public class Rømer extends Unit {
    @Override
    double convertToCelsius(Double convertFrom) {
        return (convertFrom - 7.5) * 40/21;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return (convertFrom - 7.5) * 24/7 + 32;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return (convertFrom - 7.5) * 40/21 + 273.15;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return (convertFrom - 7.5) * 24/7 + 491.67;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return (60 - convertFrom) * 20/7;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return (convertFrom - 7.5) * 22/35;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return (convertFrom - 7.5) * 32/21;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return convertFrom;
    }
}
