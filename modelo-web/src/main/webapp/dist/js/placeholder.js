$(document).ready(function(){
    $(".useDefault").addDefaultText();

    var running = false;
    var titulo = "";

    $("#ofertasEmail").submit(function(){
        if(running) return false;
        running = true;

        $.post(PATH.basename + "/newsletters/ajax_newsletter", {
            "data[nome_n]" : $("#nome input").val(),
            "data[email_n]" : $("#email input").val()
            },
        function(data){
            titulo = data.title;
            if(data.result == "error"){
                $(".news").append("<div style='display: none;' id='mensagem-dialog'>" + data.message.join("<br />", data.message) + "</div>");
            }else{
                $("#nome input").val("").triggerHandler('blur');
                $("#email input").val("").triggerHandler('blur');
                $(".news").append("<div style='display: none;' id='mensagem-dialog'>" + data.message + "</div>");
            }

            $("#mensagem-dialog")
            .dialog({
                title: titulo,
                modal : true,
                buttons: {
                    "Ok": function() {
                        $(this).dialog("close");
                        $("#mensagem-dialog").remove();
                    }
                }
            })
        .dialog('open');
    }, "json");

    running = false;

    return false;
});
});
