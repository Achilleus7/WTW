var statement = "";
var conditions, precip, precipChance, highTemp, lowTemp, currentTemp;
 
//get this weather information from server based on zip code
conditions = "sunny";
precip = "rain";
precipChance = 100;
highTemp = 70;
lowTemp = 50;
currentTemp = 60;

//variables for authenticated users' selections

//display current weather conditions
document.write("Weather conditions: ");

//low and high temperatures of the day
/*
if (lowTemp < 70)
else if (lowTemp >= 70) {
	statement += "<br>Today has a low of " + lowTemp + ", but will warm up to " + highTemp + ", so you should wear ??? today.";
}
*/

//current conditions
if (conditions == "cloudy") {
	statement += "<br>Right now it is cloudy. ";
}
else if (conditions == "sunny") {
	statement += "<br>Right now it is " + currentTemp + " Fahrenheit and sunny, so bring sunglasses with you. ";
}
else if (conditions == "rainy") {
	statement += "<br>Right now it is " + currentTemp + " Fahrenheit and rainy, so bring an umbrella with you. ";
}
else if (conditions == "snowy") {
	statement += "<br>Right now it is " + currentTemp + " Fahrenheit and snowy, so you should wear snow boots. ";
}

//chance of precipitation
if (precip == "rain" && conditions != "rainy" && precipChance >= 30) {
	statement += "<br>There is a " + precipChance + "% chance of rain today, so bring an umbrella.";
}
else if (precip == "snow" && conditions != "snowy" && precipChance >= 30) {
	statement += "<br>There is a " + precipChance + "% chance of snow today, so wear snow boots.";
}

//display the statement on the web page
document.write("<br><br>", statement);