function getFunction() 
{ 
    try 
    { 
        var a = document.getElementById("fact").value; 
        document.getElementById("result").innerHTML="Factorial of "+a+" is "+findFactorial(a); 
    } catch(err){ 
        document.getElementById("result").innerHTML=err; 
    } 
    
    return false; 
} 

function findFactorial(number) { 
    try{ 
        var fact = 1; 
        for (var i = 1; i <= number; i++) { 
            fact = fact*i; 
        } 
        return fact; 
    } 
    catch(err) { 
        document.getElementById("result").innerHTML=err; 
    } 
}