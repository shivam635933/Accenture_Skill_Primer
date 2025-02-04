function displayWelcomeMessage() { 
    try { 
        fname = document.getElementById("fname").value; 
        lname = document.getElementById("lname").value; 
        document.getElementById("result").innerHTML = "Welcome "+fname+" "+lname; 
    } 
    catch(err) { 
        document.getElementById("result").innerHTML=err; 
    } 
}
