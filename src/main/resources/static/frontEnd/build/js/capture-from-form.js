

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





//event listener to capture form data on submit
let button = document.getElementById('button');
button.addEventListener('submit', submitForm);
