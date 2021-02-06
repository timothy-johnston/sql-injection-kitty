$(document).ready(function() {


    // --------------------------------------------------------------------------------------------
    //  Page Initialization and Event Listeners
    // --------------------------------------------------------------------------------------------
    
    //Attach click event listener to any submit button

    //Load any existing log entries

    // End page initialization and event listeners ------------------------------------------------

});

// ------------------------------------------------------------------------------------------------
//  Helper Functions
// ------------------------------------------------------------------------------------------------

//Retrieve all existing log entries from the database
//Accepts an optional argument which is the id of a specific log entry. Note that the controller endpoint
//also accepts this as an optional argument - electing to not pass it in to this method will default it
//to null here and in the controller and will cause ALL entries to be returned
//function loadLogEntries() {

//}

//Submits with a POST request a user's log entry. Accepts one argument, the clicked button, which is used
//to determine whether the entry will be submitted with or without a prepared statement
//function submitLogEntry(clickedButton) {

//}

//Append log entries to to the guest log <table> so they display on the page
//Accepts one argument, an array of entries to be displayed
//function appendLogEntries(logEntries) {

//}

//Dynamically create and return html which will represent a new row in the guest log table displayed in the ui
//function buildTableRowHtml(logEntry) {

//}

// End helper functions ------------------------------------------------

