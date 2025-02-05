function getDisplay() 
{ 
    try {
        var name = document.getElementById("name").value; 
        var phonenumber = document.getElementById("phonenumber").value; 
        var total = getTotalAmount(); 
        document.getElementById("result").innerHTML="Please pay $"+total; 
    } catch(err) { 
        document.getElementById("result").innerHTML=err; 
    } 
    return false; 
} 

function getTotalAmount() 
{  
    var sum = 0; 
    try 
    { 
        if(document.getElementById("anchovy").value) { 
            sum += document.getElementById("anchovy").value * 2; 
        } 
        if(document.getElementById("barracuda").value) { 
            sum += document.getElementById("barracuda").value * 5; 
        } 
        if(document.getElementById("crab").value) { 
            sum += document.getElementById("crab").value * 3; 
        }
        if(document.getElementById("kingmackerel").value) { 
            sum += document.getElementById("kingmackerel").value * 10; 
        } 
        if(document.getElementById("pomfret").value) { 
            sum += document.getElementById("pomfret").value * 9; 
        } 
        if(document.getElementById("prawn").value) { 
            sum += document.getElementById("prawn").value * 3;  
        } 
        if(document.getElementById("salmon").value) { 
            sum += document.getElementById("salmon").value * 6; 
        } 
        if(document.getElementById("sardine").value){ 
            sum += document.getElementById("sardine").value * 2; 
        } 
        if(document.getElementById("shark").value) { 
            sum += document.getElementById("shark").value * 5; 
        } 
        if(document.getElementById("tilapia").value) { 
            sum += document.getElementById("tilapia").value * 4; 
        } 
    
        return sum; 
    } catch(err) { 
        document.getElementById("result").innerHTML=err; 
    } 
}