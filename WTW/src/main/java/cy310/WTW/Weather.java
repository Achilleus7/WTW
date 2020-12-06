package cy310.WTW;

import java.io.*;
import java.util.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import javax.xml.namespace.QName;


public class Weather {

    static int zip = 0;
    //int ID = 0;  both of these are for the city as input instead of zipcode
    //String name = "";
    static float longitude = 0;
    static float latitude = 0;
    static String country = "";
    static int timezone = 0;
    static String sunRise = "";
    static String sunSet = "";
    static int temp = 0;
    static int min = 0;
    static int max = 0;
    static String unit = "";
    static int feelsLike = 0;
    static String feelsUnit = "";
    static int humidNumber = 0;
    static String percent = "";
    static int pressureNum = 0;
    static String pressureUnit = "";
    static int windSpeed = 0;
    static String windUnit = "";
    static String windName = "";
    static int gust = 0;
    static String gustCode= "";
    static String gustDirection = "";
    static int cloudValue = 0;
    static String cloudName = "";
    static int visibility = 0;
    static String precipitationMode = "";

    //The following are all get functions for the above variables
    public int getZip(){
        return zip;
    }
    public float getLong(){
        return longitude;
    }
    public float getLat(){
        return latitude;
    }
    public String getCountry(){
        return country;
    }
    public int getTimeZone(){
        return timezone;
    }
    public String getSunRise(){
        return sunRise;
    }
    public String getSunSet(){
        return sunSet;
    }
    public int getTemp(){
        return temp;
    }
    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }
    public String getTempUnit(){
        return unit;
    }
    public int getFeelsLike(){
        return feelsLike;
    }
    public String getFeelsUnit(){
        return feelsUnit;
    }
    public int getHumidValue(){
        return humidNumber;
    }
    public String getPercent(){
        return percent;
    }
    public int getPressureNum(){
        return pressureNum;
    }
    public String getPressureUnit(){
        return pressureUnit;
    }
    public int getWindSpeed(){
        return windSpeed;
    }
    public String getWindUnit(){
        return windUnit;
    }
    public String getWindName(){
        return windName;
    }
    public int getGust(){
        return gust;
    }
    public String getGustCode(){
        return gustCode;
    }
    public String getGustDirection(){
        return gustDirection;
    }
    public int getCloudValue(){
        return cloudValue;
    }
    public String getCloudName(){
        return cloudName;
    }
    public int getVisibility(){
        return visibility;
    }
    public String getPrecipitationMode(){
        return precipitationMode;
    }

    //The main function is where the XML Parser is run
    public static void fetchData() throws FileNotFoundException, XMLStreamException {

        //This selects the XML file we will be parsing
        File file = new File("new.txt");

        //Create a Stax Parser
        XMLInputFactory factory = XMLInputFactory.newInstance();

        //Create an Event reader that reads elements one by one
        XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(file));

        //Loop so it runs as long as the file has more to read
        while (eventReader.hasNext()){
            XMLEvent xmlEvent = eventReader.nextEvent();

            //Mark the start element as such to indicate the start
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();

                //Read all attributes when start tag is being used
                @SuppressWarnings("unchecked")
                Iterator<Attribute> iterator = startElement.getAttributes();

                //Starts a loop so the parser runs while there is more data to find
                while (iterator.hasNext()) {
                    Attribute attribute = iterator.next();
                    QName name = attribute.getName();
                    //Checks for the Zip name as an attribute then gets the value
                    if ("zip".equalsIgnoreCase(name.getLocalPart())) {
                        zip = Integer.valueOf(attribute.getValue());
                    }

                    //Switch case where the event reader checks for the specific tags
                    switch (startElement.getName().getLocalPart()) {

                        case "coord":
                            Characters longitudeDataEvent = (Characters) eventReader.nextEvent();
                            longitude = Float.valueOf(longitudeDataEvent.getData());
                            Characters latitudeDataEvent = (Characters) eventReader.nextEvent();
                            latitude = Float.valueOf(latitudeDataEvent.getData());
                            break;

                        case "country":
                            Characters countryDataEvent = (Characters) eventReader.nextEvent();
                            country = countryDataEvent.getData();
                            break;

                        case "timezone":
                            Characters timeZoneDataEvent = (Characters) eventReader.nextEvent();
                            timezone = Integer.valueOf(timeZoneDataEvent.getData());
                            break;

                        case "sun":
                            Characters sunRiseDataEvent = (Characters) eventReader.nextEvent();
                            sunRise = sunRiseDataEvent.getData();
                            Characters sunSetDataEvent = (Characters) eventReader.nextEvent();
                            sunSet = sunSetDataEvent.getData();

                        case "temperature":
                            Characters tempDataEvent = (Characters) eventReader.nextEvent();
                            temp = Integer.valueOf(tempDataEvent.getData());
                            Characters minDataEvent = (Characters) eventReader.nextEvent();
                            min = Integer.valueOf(minDataEvent.getData());
                            Characters maxDataEvent = (Characters) eventReader.nextEvent();
                            max = Integer.valueOf(maxDataEvent.getData());
                            Characters unitDataEvent = (Characters) eventReader.nextEvent();
                            unit = unitDataEvent.getData();
                            break;

                        case "feels_like":
                            Characters feelsLikeDataEvent = (Characters) eventReader.nextEvent();
                            feelsLike = Integer.valueOf(feelsLikeDataEvent.getData());
                            Characters feelsUnitDataEvent = (Characters) eventReader.nextEvent();
                            feelsUnit = feelsUnitDataEvent.getData();
                            break;

                        case "humidity":
                            Characters humidNumberDataEvent = (Characters) eventReader.nextEvent();
                            humidNumber = Integer.valueOf(humidNumberDataEvent.getData());
                            Characters percentDataEvent = (Characters) eventReader.nextEvent();
                            percent = percentDataEvent.getData();
                            break;

                        case "pressure":
                            Characters pressureNumDataEvent = (Characters) eventReader.nextEvent();
                            pressureNum = Integer.valueOf(pressureNumDataEvent.getData());
                            Characters pressureUnitDataEvent = (Characters) eventReader.nextEvent();
                            pressureUnit = pressureUnitDataEvent.getData();
                            break;

                        case "speed":
                            Characters windSpeedDataEvent = (Characters) eventReader.nextEvent();
                            windSpeed = Integer.valueOf(windSpeedDataEvent.getData());
                            Characters windUnitDataEvent = (Characters) eventReader.nextEvent();
                            windUnit = windUnitDataEvent.getData();
                            Characters windNameDataEvent = (Characters) eventReader.nextEvent();
                            windName = windNameDataEvent.getData();
                            break;

                        case "direction":
                            Characters gustDataEvent = (Characters) eventReader.nextEvent();
                            gust = Integer.valueOf(gustDataEvent.getData());
                            Characters gustCodeDataEvent = (Characters) eventReader.nextEvent();
                            gustCode = gustCodeDataEvent.getData();
                            Characters gustDirectionDataEvent = (Characters) eventReader.nextEvent();
                            gustDirection = gustDirectionDataEvent.getData();
                            break;

                        case "clouds":
                            Characters cloudValueDataEvent = (Characters) eventReader.nextEvent();
                            cloudValue = Integer.valueOf(cloudValueDataEvent.getData());
                            Characters cloudNameDataEvent = (Characters) eventReader.nextEvent();
                            cloudName = cloudNameDataEvent.getData();
                            break;

                        case "visibility":
                            Characters visibilityDataEvent = (Characters) eventReader.nextEvent();
                            visibility = Integer.valueOf(visibilityDataEvent.getData());
                            break;

                        case "precipitation":
                            Characters precipitationModeDataEvent = (Characters) eventReader.nextEvent();
                            precipitationMode = precipitationModeDataEvent.getData();
                            break;

                        default:
                            break;

                    }
                }

                //Determines the end element as the end of the loop
                if(xmlEvent.isEndElement()){
                    EndElement endElement = xmlEvent.asEndElement();
                }

            }
        }

    }
}
//"api.openweathermap.org/data/2.5/weather?zip={zip code}&units-metric&appid={323096ecfa8123ec446946c9ae17c95a}"