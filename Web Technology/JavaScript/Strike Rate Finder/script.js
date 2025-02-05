function displayStrikeRate() { 
    try { 
        var name = document.getElementById("name").value; 
        var ball = document.getElementById("balls").value; 
        var run = document.getElementById("runs").value; 
        var strike_rate = ((run/ball)*100).toFixed(2); 

        result = "Name: "+ name + "<br>" + "Runs Scored: " + run + "<br>" + "Balls Faced "+ ball + "<br>" + "Strike Rate: " + strike_rate; 
        document.getElementById("result").innerHTML=result; 
    } 
    catch(err) { 
        document.getElementById("result").innerHTML=err; 
    } 
}