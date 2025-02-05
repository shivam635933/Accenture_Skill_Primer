function show_value(x){ 
    document.getElementById("demo").innerHTML=x; 
} 

function displayFeedbackMessage() { 
    try { 
        var cname = document.getElementById("cname").value; 
        var rate = document.getElementById("rate").value; 
    
        if(rate>=1 && rate<=5) 
            document.getElementById("result").innerHTML = "Hi "+cname+" Thank you for your valuable feedback. Sorry for the inconvenience. You will be contacted by our customer care officer soon"; 
        else if(rate>5 && rate<=8) 
            document.getElementById("result").innerHTML = "Hi "+cname+" Thank you for your valuable feedback. You can post your complaints on customercare@gmail."; 
        else 
            document.getElementById("result").innerHTML = "Hi "+cname+" Thank you for your valuable feedback. Happy customers are our only asset"; 
    } 
    catch(err) { 
        document.getElementById("result").innerHTML=err; 
    }
    return false; 
    }