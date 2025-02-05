function show_value(x){ 
    document.getElementById("demo").innerHTML=x; 
}

function costCalculation(){ 
    // fill javascript code here do not use Let keyword for variable intialization; instead use var. 
    var ticketType=document.getElementById("ticketType").value.trim().toLowerCase(); 
    var ticketNo = document.getElementById("noofTickets").value; 
    var couponCodeChecked = document.getElementById("couponCode").checked; 
    var refreshmentChecked = document.getElementById("refreshment").checked; 

    var base_price=0; 
    var percentage=0.0; 
    
    if(ticketType=="floor") 
        base_price = 400; 
    else 
        base_price = 500; 

    var total_price = base_price*ticketNo; 

    if (ticketNo>20) 
        percentage+=0.10; 
    if (couponCodeChecked) 
        percentage+=0.02; 
    
    total_price -= (total_price*percentage); 

    if (refreshmentChecked) 
        total_price += 100; 
    
    total_price = Math.round(total_price); 
    document.getElementById("result").innerHTML = "Your ticket charge is Rs."+total_price; 
    
    return false;
}