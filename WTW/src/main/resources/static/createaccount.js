function addUser()
{

    var user=document.getElementById("uname").value;
    var password=document.getElementById("pass").value;
    var zip = document.getElementById("zip").value;

    var shortsRec = document.getElementById("shorts").value;
    var shirtRec = document.getElementById("shirt").value;
    var jacketRec = document.getElementById("jacket").value;
    var coatRec = document.getElementById("coat").value;
    const data = {
        username: user,
        password: password,
        zipCode: zip,
        jacketThreshold: jacketRec,
        coatThreshold: coatRec
    };
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