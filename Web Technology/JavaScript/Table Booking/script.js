 
function displayConfirmationMessage() { 
    try { 

        var cname = document.getElementById("name").value; 
        var timing = document.getElementsByName("timing"); 
        
        var timings = ""; 
        for (var i=0;i<timing.length;i++){ 
            if (timing[i].checked){ 
                timings=timing[i].value; 
                break; 
            } 
        } 
        result = "Hi "+cname+" your table has been booked between "+timings; 
        document.getElementById("result").innerHTML=result; 
    } 
    catch(err) { 
        document.getElementById("result").innerHTML=err; 
    } 
}