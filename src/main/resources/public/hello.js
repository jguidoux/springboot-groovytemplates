$(document).ready(function() {
    $.ajax({
        type: "GET",
        //url: "https://en.wikipedia.org/w/api.php?action=query&prop=extracts&titles=Threadless&format=json&exintro=1&prop=extracts",
        url: "cats",
        dataType: "json",
        //data: {name : "haltea", age:0.4},
        success: function(data){
            $('.cat-name').append(data.name);
            $('.cat-age').append(data.age);

        },
        error: function(e){
            alert("bad : " + e.message);
            console.log(e.message);
        }
    });
});
