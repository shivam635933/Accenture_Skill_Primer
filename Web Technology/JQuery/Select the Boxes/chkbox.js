$("input[type='checkbox']").change(function()
{
    var count = $("input[type='checkbox']:checked").length;
    
    if (count == 1)
        $("#result").text(count+" box is checked");
    else
        $("#result").text(count+" boxes are checked");
});