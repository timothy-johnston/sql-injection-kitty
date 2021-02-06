$(document).ready(function() {


    // --------------------------------------------------------------------------------------------
    //  Page Initialization and Event Listeners
    // --------------------------------------------------------------------------------------------
    
    //Attach click event listener to any submit button
    $(".btn-submit-entry").click(function () {
        submitLogEntry($this);
    })

    //Load any existing log entries
    loadLogEntries();

    // End page initialization and event listeners ------------------------------------------------

});

// ------------------------------------------------------------------------------------------------
//  Helper Functions
// ------------------------------------------------------------------------------------------------

//Retrieve all existing log entries from the database
//Accepts an optional argument which is the id of a specific log entry. Note that the controller endpoint
//also accepts this as an optional argument - electing to not pass it in to this method will default it
//to null here and in the controller and will cause ALL entries to be returned
function loadLogEntries(entryId = null) {

}

//Submits with a POST request a user's log entry. Accepts one argument, the clicked button, which is used
//to determine whether the entry will be submitted with or without a prepared statement
function submitLogEntry(clickedButton) {

    //Get data from form, determine whether to write to database with or without prepared statement,
    //and serialize to json
    var entry = {};
    entry["user"] = $("#input-user").val();
    entry["message"] = $("#input-message").val();

    //Determine whether to write to database with or without prepared statement
    if ($(this).attr("id") === "btn-submit-prepared") {
        entry["submitType"] = "prepared";
    } else if ($(this).attr("id") === "btn-submit-prepared") {
        entry["submitType"] = "injection";
    } else {
        console.error("I award you no points, and may God have mercy on your soul.")
    }

    //Configure and submit ajax request
    var entryJson = JSON.stringify(entry);
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "http://localhost:8080/api/submit-entry",
        data: entryJson,
        success: function(data) {
            console.log("Request successful.");
            console.log(data)
        },
        error: function(xhr, status, error) {
            handleFailedRequest(xhr, status, error);
        }
    })


}

//Append log entries to to the guest log <table> so they display on the page
//Accepts one argument, an array of entries to be displayed
//function appendLogEntries(logEntries) {

//}

//Dynamically create and return html which will represent a new row in the guest log table displayed in the ui
//function buildTableRowHtml(logEntry) {

//}

function handleFailedRequest(xhr, status, error) {
    console.log("Failed request: ");
    console.log(xhr);
    console.log(status);
    console.log(error);
}

// End helper functions ------------------------------------------------

