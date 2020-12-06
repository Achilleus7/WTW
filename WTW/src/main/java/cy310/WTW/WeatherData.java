package cy310.WTW;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class WeatherData {
    int zip = 0;
    float longitude;
    float latitude;
    String country;
    int timezone;
    String sunRise;
    String sunSet;
    int temp;
    int min;
    int max;
    String unit;
    int feelsLike;
    String feelsUnit;
    int humidNumber;
    String percent;
    int pressureNum;
    String pressureUnit;
    int windSpeed;
    String windUnit;
    String windName;
    int gust;
    String gustCode;
    String gustDirection;
    int cloudValue;
    String cloudName;
    int visibility;
    String precipitationMode;

    public WeatherData() {
        //Weather.fetchData();
        zip = Weather.zip;
        longitude = Weather.longitude;
        latitude = Weather.latitude;
        country = Weather.country;
        timezone = Weather.timezone;
        sunRise = Weather.sunRise;
        sunSet = Weather.sunSet;
        temp = Weather.temp;
        min =  Weather.min;
        max = Weather.max;
        unit = Weather.unit;
        feelsLike = Weather.feelsLike;
        feelsUnit = Weather.feelsUnit;
        humidNumber = Weather.humidNumber;
        percent = Weather.percent;
        pressureNum = Weather.pressureNum;
        pressureUnit = Weather.pressureUnit;
        windSpeed = Weather.windSpeed;
        windUnit = Weather.windUnit;
        windName = Weather.windName;
        gust = Weather.gust;
        gustCode = Weather.gustCode;
        gustDirection = Weather.gustDirection;
        cloudValue = Weather.cloudValue;
        cloudName = Weather.cloudName;
        visibility = Weather.visibility;
        precipitationMode = Weather.precipitationMode;
    }

    public int getZip() {
        return zip;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getCountry() {
        return country;
    }

    public int getTimezone() {
        return timezone;
    }

    public String getSunRise() {
        return sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public int getTemp() {
        return temp;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getUnit() {
        return unit;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    public String getFeelsUnit() {
        return feelsUnit;
    }

    public int getHumidNumber() {
        return humidNumber;
    }

    public String getPercent() {
        return percent;
    }

    public int getPressureNum() {
        return pressureNum;
    }

    public String getPressureUnit() {
        return pressureUnit;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public String getWindUnit() {
        return windUnit;
    }

    public String getWindName() {
        return windName;
    }

    public int getGust() {
        return gust;
    }

    public String getGustCode() {
        return gustCode;
    }

    public String getGustDirection() {
        return gustDirection;
    }

    public int getCloudValue() {
        return cloudValue;
    }

    public String getCloudName() {
        return cloudName;
    }

    public int getVisibility() {
        return visibility;
    }

    public String getPrecipitationMode() {
        return precipitationMode;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "zip=" + zip +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", country='" + country + '\'' +
                ", timezone=" + timezone +
                ", sunRise='" + sunRise + '\'' +
                ", sunSet='" + sunSet + '\'' +
                ", temp=" + temp +
                ", min=" + min +
                ", max=" + max +
                ", unit='" + unit + '\'' +
                ", feelsLike=" + feelsLike +
                ", feelsUnit='" + feelsUnit + '\'' +
                ", humidNumber=" + humidNumber +
                ", percent='" + percent + '\'' +
                ", pressureNum=" + pressureNum +
                ", pressureUnit='" + pressureUnit + '\'' +
                ", windSpeed=" + windSpeed +
                ", windUnit='" + windUnit + '\'' +
                ", windName='" + windName + '\'' +
                ", gust=" + gust +
                ", gustCode='" + gustCode + '\'' +
                ", gustDirection='" + gustDirection + '\'' +
                ", cloudValue=" + cloudValue +
                ", cloudName='" + cloudName + '\'' +
                ", visibility=" + visibility +
                ", precipitationMode='" + precipitationMode + '\'' +
                '}';
    }
}
