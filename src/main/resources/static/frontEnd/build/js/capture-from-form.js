// object/class to capture form input
class Track {
  constructor(trackName) {
    this.trackName = trackName;
    this.trackNotes = trackNotes;

  }

}
console.log(Track);
//function to take form input and turn into object

const trackFromForm = new Track();
function addFromForm() {
  trackFromForm.trackName = document.getElementById("trackName").value;
  trackFromForm.trackNotes = document.getElementById("trackNotes").value;
  console.log("function to create a new track from form input");
  console.log(trackFromForm);
}

//event listener to capture form data on submit

let button = document.getElementById('button');
button.addEventListener('click', addFromForm());


//turns new track object into json and sends to server  post request, returns promise and parses the json into response object
fetch('/tracks', {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json',
  },
  body: JSON.stringify('{trackFromForm}')
}).then(response => {
  if (response.ok) {
    return response.json();
    
  }
  throw new Error('Request failed!');
}, networkError => {
  console.log(networkError.message);
}).then(jsonResponse => {
  console.log(jsonResponse);
})



/*
fetch('/track-form', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
    },

}).then(response=>response.json()).then(tracksArray=>{

    for (let track of tracksArray) {


        addtrackCard(track);
    }
}
).catch((error)=>{
    console.error('Error:', error);
}
);*
*/

