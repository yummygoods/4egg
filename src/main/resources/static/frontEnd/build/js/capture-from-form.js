//event listener to capture form data on submit

let button = document.getElementById('button');
button.addEventListener('click', function(event) {
                                     event.preventDefault();
                                     addFromForm();
                                     reset();


                                 });





  // object/class to capture form input
class Track {
  constructor(trackName, trackNotes) {
    this.trackName = trackName;
    this.trackNotes = trackNotes;
}
}

console.log("this should print the newly created class Track: ", Track);

//function to take form input and turn into object

function addFromForm() {
//takes input values and saves as variables trackName + trackNotes
let trackName = document.getElementById('trackName').value;
 console.log("this should print the value from user input in Name field:", trackName);
let trackNotes = document.getElementById('trackNotes').value;
 console.log("this should print the value from user input in Notes field: ",  trackNotes);

//instantiates new Track object and passes variables defined above as arguments into the constructor
  const trackFromForm = new Track(trackName, trackNotes);


  console.log("this should print the new track object with values:", trackFromForm);

  //resets the field values to empty strings


}

      function reset(){
                                 //tells the dom to remove the user's text input
                                     document.getElementById('trackName').value = '';
                                     document.getElementById('trackNotes').value = '';
                                     //resets the values stored in the variables
                                      trackName = '';
                                      trackNotes = '';
                                 };
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

