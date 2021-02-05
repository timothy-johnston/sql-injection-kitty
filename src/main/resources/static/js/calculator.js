
$("#result-container").hide();

$(document).ready(function() {

});

//Listen for add button click. Trigger ajax call to add service.
$(".btn").click(function() {
    console.log("button clicked");
    var numbers = getNumbers();
    var operation = $(this).text().toLowerCase();
    $.ajax({
        url: "http://localhost:8080/api/" + operation + "?num1=" + numbers[0] + "&num2=" + numbers[1],
        success: function(data) {
            console.log(data);
            $("#result-container").show();
            $("#result").text(data);
        }

    })
});

function getNumbers() {
    var numbers = [];
    numbers.push($("#num-1").val());
    numbers.push($("#num-2").val());
    return numbers;
}