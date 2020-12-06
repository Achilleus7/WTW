package cy310.WTW;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class WeatherData {
    int zip;
    double longitude;
    double latitude;
    String country;
    int sunRise;
    int sunSet;
    double temp;
    double min;
    double max;
    double windSpeed;

    String weatherMain; //weather type?
    String weatherDescription; //weather description
    String weatherIcon; //weather Icon (useless for us)
    double pressure; //pressure
    double humidity; //humidity percentage
    double degree; //degree of direction
    int clouds;
    int dt;
    int id;
    String name;
    int cod;

    public WeatherData(int zip) {
        Weather.fetchData(zip);
        this.zip = zip;
        longitude = Weather.longitude;
        latitude = Weather.latitude;
        country = Weather.country;
        sunRise = Weather.sunRise;
        sunSet = Weather.sunSet;
        temp = Weather.temp;
        min =  Weather.min;
        max = Weather.max;
        windSpeed = Weather.windSpeed;
        weatherMain = Weather.weatherMain;
        weatherDescription = Weather.weatherDescription;
        weatherIcon = Weather.weatherIcon;
        pressure = Weather.pressure;
        humidity = Weather.humidity;
        degree = Weather.degree;
        clouds = Weather.clouds;
        dt = Weather.dt;
        id = Weather.id;
        name = Weather.name;
        cod = Weather.cod;
    }

    public int getZip() {
        return zip;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getCountry() {
        return country;
    }

    public int getSunRise() {
        return sunRise;
    }

    public int getSunSet() {
        return sunSet;
    }

    public double getTemp() {
        return temp;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getDegree() {
        return degree;
    }

    public int getClouds() {
        return clouds;
    }

    public int getDt() {
        return dt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "zip=" + zip +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", country='" + country + '\'' +
                ", sunRise=" + sunRise +
                ", sunSet=" + sunSet +
                ", temp=" + temp +
                ", min=" + min +
                ", max=" + max +
                ", windSpeed=" + windSpeed +
                ", weatherMain='" + weatherMain + '\'' +
                ", weatherDescription='" + weatherDescription + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", degree=" + degree +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
