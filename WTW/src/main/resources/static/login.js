function validate()
{
	//these are the username and passwords inputted by the user
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
	
	//search up username in database and check whether the password matches the one in the database
	
	//replace "admin" and "user" here with those fetched from the database
	/*if (username does not exist in database)
	{
		alert("Log in failed. Please try again!");
	}
	*/
	//else if
	if(username=="admin" && password=="user")
    {
        alert("Logged in successfully!");
        return false;
    }
    else{
        alert("Log in failed. Please try again!");
    }
}
