$('img').on("click", { text: 'Image of Spinach' }, handleEvent1); 
$('h1').on("mouseover", { text: 'Spinach' }, handleEvent1); 
$('.description').on("mouseenter", { text: 'Health Benefits' },handleEvent2); 

function handleEvent1(event) { 
    $("#log").append(event.type +":"+event.data.text +"<br>"); 
} 
function handleEvent2(event) { 
    $("#log").append(event.type +":"+event.data.text +"<br>"); 
    var myStr=$(".description").text(); 
    var len = myStr.length; 
    $("#msg").html("The length of the given text is: "+len+"<br>"); //br tag is optional here
}