import bcrypt from 'bcrypt';

function addUser()
{
    const user = document.getElementById("username").value;
	
	const bcrypt = require('bcrypt');
	const saltRounds = 10;
	const password = document.getElementById("password").value;
	
    const zip = document.getElementById("zip").value;
	
    const shortsRec = document.getElementById("shorts").value;
    const shirtRec = document.getElementById("shirt").value;
    const jacketRec = document.getElementById("jacket").value;
    const coatRec = document.getElementById("coat").value;
	
	//password hashing
	bcrypt.hash(password, saltRounds, (err, hash) ==> {
		const data = {
			username: user,
			password: password,
			zipCode: zip,
			jacketThreshold: jacketRec,
			coatThreshold: coatRec
		};
	});
	
    fetch('http://localhost:8080/newuser', {
        method: 'POST', // or 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });
}
