$("button").click(function(){
    var totalSalary = 0;

    $("#example tbody tr").each(function(){
        var salary = parseFloat($(this).find("td:eq(5)").text());
        totalSalary += salary;
    });
    $("#para1").text("Total Salary Paid: Rs. "+totalSalary);
});