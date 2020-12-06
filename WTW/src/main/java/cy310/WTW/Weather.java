package cy310.WTW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @web http://java-buddy.blogspot.com/
 */
public class Weather {

    static int zip = 63701;
    static String url =
            "http://api.openweathermap.org/data/2.5/weather?zip=" + zip + "&units=imperial&appid=323096ecfa8123ec446946c9ae17c95a";


    //List of the class variables for the weather object
    static double longitude; //geographic longitude and latitude
    static double latitude;
    static String country; //Country ID
    static int sunRise; //Sunrise time
    static int sunSet; //sunset time
    //static int weatherId; //weather ID no longer shows in API
    static String weatherMain; //weather type?
    static String weatherDescription; //weather description
    static String weatherIcon; //weather Icon (useless for us)
    static double temp; //temperature in Fahrenheit
    static double pressure; //pressure
    static double humidity; //humidity percentage
    static double min; //lowest possible temp
    static double max; //max possible temp
    static double windSpeed;
    //static double gust; gust no longer appears in the API
    static double degree; //degree of direction
    static int clouds;
    static int dt;
    static int id;
    static String name;
    static int cod;

    double getLongitude(){
        return longitude;
    }

    double getLatitude(){
        return latitude;
    }

    String getCountry(){
        return country;
    }

    int getSunRise(){
        return sunRise;
    }

    int getSunSet(){
        return sunSet;
    }

    String getWeatherMain(){
        return weatherMain;
    }

    String getWeatherDescription(){
        return weatherDescription;
    }

    String getWeatherIcon(){
        return weatherIcon;
    }

    double getTemp(){
        return temp;
    }

    double getPressure(){
        return pressure;
    }

    double getMin(){
        return min;
    }

    double getMax(){
        return max;
    }

    double getWindSpeed(){
        return windSpeed;
    }

    double getHumidity(){
        return humidity;
    }

    int getClouds(){
        return clouds;
    }

    int getDt(){
        return dt;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    int getCod(){
        return cod;
    }


    public static void fetchData(int zip) {

        url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zip + "&units=imperial&appid=323096ecfa8123ec446946c9ae17c95a";
        String result = "";

        try {
            URL url_weather = new URL(url);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url_weather.openConnection();

            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                InputStreamReader inputStreamReader =
                        new InputStreamReader(httpURLConnection.getInputStream());
                BufferedReader bufferedReader =
                        new BufferedReader(inputStreamReader, 8192);
                String line = null;
                while((line = bufferedReader.readLine()) != null){
                    result += line;
                }

                bufferedReader.close();

                ParseResult(result);
                //String weatherResult = ParseResult(result);
                //These were for the output of the string value
                //System.out.println(weatherResult);

            } else {
                System.out.println("Error in httpURLConnection.getResponseCode()!!!");
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    //Parses the values from the API and saves the values in variables
    static private void ParseResult(String json) throws JSONException{

        String parsedResult = "";

        JSONObject jsonObject = new JSONObject(json);

        parsedResult += "Number of object = " + jsonObject.length() + "\n\n";

        //"coord"
        JSONObject JSONObject_coord = jsonObject.getJSONObject("coord");
        Double result_lon = JSONObject_coord.getDouble("lon");
        longitude = result_lon;
        Double result_lat = JSONObject_coord.getDouble("lat");
        latitude = result_lat;

        //"sys"
        JSONObject JSONObject_sys = jsonObject.getJSONObject("sys");
        String result_country = JSONObject_sys.getString("country");
        country = result_country;
        int result_sunrise = JSONObject_sys.getInt("sunrise");
        sunRise = result_sunrise;
        int result_sunset = JSONObject_sys.getInt("sunset");
        sunSet = result_sunset;

        //"weather"
        String result_weather;
        JSONArray JSONArray_weather = jsonObject.getJSONArray("weather");
        if(JSONArray_weather.length() > 0){
            JSONObject JSONObject_weather = JSONArray_weather.getJSONObject(0);
            int result_id = JSONObject_weather.getInt("id");
            id = result_id;
            String result_main = JSONObject_weather.getString("main");
            weatherMain = result_main;
            String result_description = JSONObject_weather.getString("description");
            weatherDescription = result_description;
            String result_icon = JSONObject_weather.getString("icon");
            weatherIcon = result_icon;

            result_weather = "weather\tid: " + result_id +"\tmain: " + result_main + "\tdescription: " + result_description + "\ticon: " + result_icon;
        }else{
            result_weather = "weather empty!";
        }

        //"base"
        String result_base = jsonObject.getString("base");

        //"main"
        JSONObject JSONObject_main = jsonObject.getJSONObject("main");
        Double result_temp = JSONObject_main.getDouble("temp");
        temp = result_temp;
        Double result_pressure = JSONObject_main.getDouble("pressure");
        pressure = result_pressure;
        Double result_humidity = JSONObject_main.getDouble("humidity");
        humidity = result_humidity;
        Double result_temp_min = JSONObject_main.getDouble("temp_min");
        min = result_temp_min;
        Double result_temp_max = JSONObject_main.getDouble("temp_max");
        max = result_temp_max;

        //"wind"
        JSONObject JSONObject_wind = jsonObject.getJSONObject("wind");
        Double result_speed = JSONObject_wind.getDouble("speed");
        windSpeed = result_speed;
        //Double result_gust = JSONObject_wind.getDouble("gust");
        //gust = result_gust;
        Double result_deg = JSONObject_wind.getDouble("deg");
        degree = result_deg;
        String result_wind = "wind\tspeed: " + result_speed + "\tdeg: " + result_deg;

        //"clouds"
        JSONObject JSONObject_clouds = jsonObject.getJSONObject("clouds");
        int result_all = JSONObject_clouds.getInt("all");
        clouds = result_all;

        //"dt"
        int result_dt = jsonObject.getInt("dt");
        dt = result_dt;

        //"id"
        int result_id = jsonObject.getInt("id");
        id = result_id;

        //"name"
        String result_name = jsonObject.getString("name");
        name = result_name;

        //"cod"
        int result_cod = jsonObject.getInt("cod");
        cod = result_cod;

        /*return this was the original output for the program that allowed a return string
                "coord\tlon: " + result_lon + "\tlat: " + result_lat + "\n" +
                        "sys\tcountry: " + result_country + "\tsunrise: " + result_sunrise + "\tsunset: " + result_sunset + "\n" +
                        result_weather + "\n"+
                        "base: " + result_base + "\n" +
                        "main\ttemp: " + result_temp + "\thumidity: " + result_humidity + "\tpressure: " + result_pressure + "\ttemp_min: " + result_temp_min + "\ttemp_max: " + result_temp_min + "\n" +
                        result_wind + "\n" +
                        "clouds\tall: " + result_all + "\n" +
                        "dt: " + result_dt + "\n" +
                        "id: " + result_id + "\n" +
                        "name: " + result_name + "\n" +
                        "cod: " + result_cod + "\n" +
                        "\n"; */
    }
}