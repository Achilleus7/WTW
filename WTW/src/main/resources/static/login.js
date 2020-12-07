import bcrypt from 'bcrypt';

function validate()
{
	//these are the username and passwords inputted by the user
    const username=document.getElementById("username").value;
    const password=document.getElementById("password").value;
	
	//localStorage["user"] = username;
    localStorage.setItem('currentUser', username);
	
	//search up username in database and check whether the password matches the one in the database
	
	//replace "admin" with username from database
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
	
	//when done testing with "admin" and "user", uncomment this section to enable password hashing
	/*
	//"username" should be replaced with the user's password from the database
	if ("username" does not exist in database)
	{
		alert("Log in failed. Please try again!");
	}
	else{
		bcrypt.compare(password, "username", function(err, result) {
			if (result == true) {
				alert("Logged in successfully!");
			return false;
			}
			else {
				alert("Log in failed. Please try again!");
			}
			
		});
	}
	*/
}
