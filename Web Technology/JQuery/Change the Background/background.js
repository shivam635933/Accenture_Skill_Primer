$("#fname").change(function(){ 
    $("form").append("<p>You have changed the First name</p>"); 
}); 

$("#lname").change (function(){ 
    $("form").append("<p>You have changed the Last name</p>"); 
}); 

$("input").focusin(function(){ 
    $(this).addClass("focusedin").removeClass("focusedout"); 
}); 

$("input").focusout(function(){ 
    $(this).addClass("focusedout").removeClass("focusedin"); 
});
