$(".add-row").click(function(){
    var name = $("#name").val();
    if(name){
        var markup = "<tr><td><input type='checkbox' name='record'></td><td>" + name + "</td></tr>";
        $("table tbody").append(markup);
        $("#name").val('');
    }
});

$(".delete-row").click(function(){
    $("table tbody").find('input[name="record"]:checked').each(function(){
        $(this).closest("tr").remove();
    });
});
