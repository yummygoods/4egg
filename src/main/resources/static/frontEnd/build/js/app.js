console.log("🦄 you're a god damn unicorn")

//function to populate html with json of track retrieved from database
function addTrackCard(track) {
    const trackHTML =
     '<div class="col-6 ">\n' +
        '<div class="card border-warning mx-2 min-">\n' +

            //  '<img src="' +  track.locationUrl + ' " class="card-img-top" alt="...">\n' +

             ' <div class="card-body ">\n' +

                  ' <h5 class="card-title">' +  track.name + '</h5>\n' +

                  ' <p class="card-text">' + track.notes + '</p>\n' +

                  //' <h5 class="card-price"> $' +  track.price + '</h5>\n' +


               // '<button id="button" type="submit" class="btn btn-warning fw-bold form-control w-50 ">need it</button>' +
             ' </div>\n' +
        '</div>\n';


    const tracksContainer = document.getElementById("track");
    tracksContainer.innerHTML += trackHTML;
    console.log("updating inner html")
}


// call to  get all tracks, turn them into json, and use that info to populate card html
fetch('/tracks/all', {
    method: 'GET',
    headers: {
        'Content-Type': 'application/json',
    },

}).then(response=>response.json()).then(tracksArray=>{

    for (let track of tracksArray) {
        console.log(track.name + track.notes + track.locationUrl);

        addTrackCard(track);
    }
}
).catch((error)=>{
    console.error('Error:', error);
}
);

