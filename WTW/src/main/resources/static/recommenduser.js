var username=document.getElementById("uname").value;
var zip = document.getElementById("zip").value;

//get this weather information from server with functions based on zip code provided above
var longitude = 0;
var latitude = 0;
var country = "";
var timezone = 0;
var sunrise = "";
var sunset = "";
var temp = 0;
var highTemp = 0;
var lowTemp = 0;
var tempUnit = "";
var feelsLike = 0;
var feelsUnit = "";
var humidity = 0;
var windSpeed = 0;
var windUnit = "";
var precipMode = "";

//return the user's values from the database here, using the username above
var shortsRec = 0;
var shirtRec = 0;
var jacketRec = 0;
var coatRec = 0;

//display current weather conditions
document.write("<h3>Weather Conditions:</h3>");
document.write("Sunrise: " + sunrise + "<br>");
document.write("Sunset: " + sunset + "<br>");
document.write("Current Temperature: " + temp + tempUnit + "<br>");
document.write("High Temperature: " + highTemp + tempUnit + "<br>");
document.write("Low Temperature: " + lowTemp + tempUnit + "<br>");
document.write("Feels Like: " + feelsLike + tempUnit + "<br>");
document.write("Humidity: " + humidity + "%<br>");
document.write("Wind: " + windSpeed + " " + windUnit + "<br>");
document.write("Precipitation: " + precipMode + "<br>");


//I will adjust below this later
document.write("<br><h3>Today's Recommendations:</h3>");
document.write("<br>Weather recommendations coming soon</br>");
/*
//display the statement on the web page

if (conditions == "sunny") {
	document.write("Sunglasses<br>");
}
else if (conditions == "rainy") {
	document.write("Umbrella<br>");
}
else if (conditions == "snowy") {
	document.write("Snow boots.<br>");
}

if (highTemp >= shortsRec) {
	document.write("Shorts/T-shirt<br>");
}
else {
	document.write("Pants<br>");
}

if (highTemp >= shirtRec) {
	document.write("T-shirt<br>");
}
else {
	document.write("Long sleeve shirt<br>");
}

if (lowTemp <= jacketRec && lowTemp > coatRec) {
	document.write("Sweater/Jacket<br>");
}
else if (lowTemp >= coatRec) {
	document.write(Coat<br>");
}

//chance of precipitation
if (precip == "rain" && conditions != "rainy" && precipChance >= chanceRec) {
	document.write("Umbrella<br>");
}
else if (precip == "snow" && conditions != "snowy" && precipChance >= chanceRec) {
	document.write("Snow boots<br>");
}
*/