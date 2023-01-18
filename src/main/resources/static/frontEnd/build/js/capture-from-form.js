
// object/class to capture form input
item(name, description, imageUrl, price) {
      const item = {
        this.name: name,
        this.description: description,
        this.imageUrl: imageUrl,
        this.price: price,
      };

//function to take form input and turn into object
function addFromForm() {
const itemFromForm = new item();
itemFromForm.name = document.getElementById("name").value;
itemFromForm.description = document.getElementById("description").value;
itemFromForm.imageUrl = document.getElementById("imageUrl").value;
itemFromForm.price = document.getElementById("price").value;
}


//event listener to capture form data on submit

let button = document.getElementById('button');
button.addEventListener('click', addFromForm);



// call to  get all items, turn them into json, and use that info to populate card html
fetch('/item-form', {
  method: 'POST',
  headers: {
          'Content-Type': 'application/json',
      },
  body: JSON.stringify({itemFromForm})
}).then(response => {
  if(response.ok){
	  return response.json();
  }
	throw new Error('Request failed!');
}, networkError => {
  console.log(networkError.message);
}).then(jsonResponse => {
  console.log(jsonResponse);
})



/*
fetch('/item-form', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
    },

}).then(response=>response.json()).then(itemsArray=>{

    for (let item of itemsArray) {


        addItemCard(item);
    }
}
).catch((error)=>{
    console.error('Error:', error);
}
);*
*/

