package temperatoreconverter;

public class Newton extends Unit {

    @Override
    double convertToCelsius(Double convertFrom) {
        return convertFrom * 100/33;
    }

    @Override
    double convertToFahrenheit(Double convertFrom) {
        return convertFrom * 60/11 + 32;
    }

    @Override
    double convertToKelvin(Double convertFrom) {
        return convertFrom * 100/33 + 273.15;
    }

    @Override
    double convertToRankine(Double convertFrom) {
        return convertFrom * 60/11 + 491.67;
    }

    @Override
    double convertToDelisle(Double convertFrom) {
        return (33 - convertFrom) * 50/11;
    }

    @Override
    double convertToNewton(Double convertFrom) {
        return convertFrom;
    }

    @Override
    double convertToRéaumur(Double convertFrom) {
        return convertFrom * 80/33;
    }

    @Override
    double convertToRømer(Double convertFrom) {
        return convertFrom * 35/22 + 7.5;
    }
}
