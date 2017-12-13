$(document).ready(function () {
    $("#coordinate-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

});
    function fire_ajax_submit() {
        var search = $("#coordinate").val();
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/rest/hello",
            data: JSON.stringify(search),
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function () {
                console.log("SUCCESS : ", data);
            },
            error: function (e) {
                console.log("ERROR : ", e);
            }
        });
    }
})

