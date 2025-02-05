function display() 
{ 
    var number = document.getElementById("ugly").value; 
    if(number===""){ 
        alert("Please, specify an input"); return; 
    } 
    if(number>0) 
    { 
        if (checkUglyNumber(number))
            alert(number+" is an ugly number"); 
        else
            alert(number+" is not an ugly number"); 
    } 
    else 
        alert("Invalid Input"); 
} 
function checkUglyNumber(num) 
{ 
    while(num%2==0) 
        num/=2; 
    while(num%3==0) 
        num/=3; 
    while(num%5==0) 
        num/=5; 
    return num==1; 
}