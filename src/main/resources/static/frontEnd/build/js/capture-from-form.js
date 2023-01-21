/*++++++++++++++++++++++++++++++++++++++++++++++++
 function to reset after submit
++++++++++++++++++++++++++++++++++++++++++++++++*/
function reset() {
  //.................................tells the dom to remove the user's text input
  document.getElementById('name').value = '';
  document.getElementById('notes').value = '';
  //.................................resets the values stored in the variables
  name = '';
  notes = '';
};

///////////////////// end of function ////////////////////


//event listener to capture form data on submit

let button = document.getElementById('button');
button.addEventListener('click', function (event) {
  event.preventDefault();
  addFromForm();
  reset();


});




/*++++++++++++++++++++++++++++++++++++++++++++++++
class to capture form input in an object
++++++++++++++++++++++++++++++++++++++++++++++++*/
class Track {
  constructor(name, notes) {
    this.name = name;
    this.notes = notes;
  }
}

console.log("this should print the newly created class Track: ", Track);




/*++++++++++++++++++++++++++++++++++++++++++++++++
function to take form input and turn into object
++++++++++++++++++++++++++++++++++++++++++++++++*/
function addFromForm() {
  // .................................takes input values and saves as variables name + notes
  let name = document.getElementById('name').value;
  console.log("this should print the value from user input in Name field:", name);

  let notes = document.getElementById('notes').value;
  console.log("this should print the value from user input in Notes field: ", notes);

  // .................................instantiates new Track object and passes variables defined above as arguments into the constructor
  const trackFromForm = new Track(name, notes);
  console.log("this should print the new track object with values:", trackFromForm);

  // .................................calls function to take the new track object and make a post request with it
  sendTrackToServer(trackFromForm);


}
///////////////////// end of function /////////////////////




/*++++++++++++++++++++++++++++++++++++++++++++++++
function to send the new track object to the db
++++++++++++++++++++++++++++++++++++++++++++++++*/

function sendTrackToServer(Track) {
  fetch(

    'http://localhost:8080/tracks',
    {
      method: 'POST', headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(Track)
    }
  ).then(response => {


    if (response.ok) {
      console.log("omg did this work? if so, the response should be here: ", response);
      return response.json();
    }
    throw new Error('Request failed!');
  })
}; 

 //.................................turns the new track object into json and sends as request body
///////////////////// end of function /////////////////////