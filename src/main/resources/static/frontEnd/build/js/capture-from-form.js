//event listener to capture form data on submit

let button = document.getElementById('button');
button.addEventListener('click', addFromForm);
console.log("this is what the new track object looks like:" + trackFromForm);

//function to take form input and turn into object
function addFromForm() {
  // object/class to capture form input
class Track {
  constructor(trackName, trackNotes) {
    this.trackName = trackName;
    this.trackNotes = trackNotes;
}
  }
  let trackName = document.getElementById('trackName');
/*let trackName = document.getElementById('trackName').value;
 let trackNotes = document.getElementById('trackNotes').value;*/
 console.log(trackName);
 console.log(trackNotes);

  const trackFromForm = new Track(trackName, trackNotes);
  console.log("function to create a new track from form input");
  console.log("this should print the new track object with values" + trackFromForm);
}


/*
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
*/

