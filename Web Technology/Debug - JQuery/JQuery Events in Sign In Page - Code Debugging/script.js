//Debug and obtain the result as given in the description 
$("#uname").change (function() { 
    $("#signin_form").append("<p>You have changed the Username</p>"); 
}); 

$("#pwd").change (function() { 
    $("#signin_form").append("<p>You have changed the Password</p>"); 
}); 

$("#login").dblclick(function() { 
    $("#signin_form").append("<p>You have double clicked on Sign In</p>"); 
}); 
    
$('input[type="text"]').focusin(function(){ 
    $(this).addClass('focusedin'); 
}); 
    
$('input[type="password"]').focusin(function(){ 
    $(this).addClass('focusedin'); 
}); 
    
$('input[type="text"]').focusout(function(){ 
    $(this).addClass('focusedout'); 
});

$('input[type="password"]').focusout(function(){ 
    $(this).addClass('focusedout'); 
});