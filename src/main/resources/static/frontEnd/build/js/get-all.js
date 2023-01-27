

function getAllTracks() {
  fetch('http://localhost:8080/tracks/all')
    .then(response => response.json())
    .then(data => {
      let element = document.getElementById('tracks');
      for (let item of data) {
        element.innerHTML += `<p>${item.name}: ${item.notes}</p>`;
      }
    })
    .catch(error => console.log(error));
}



function getAllImages() {
  fetch('http://localhost:8080/images/all')
    .then(response => response.json())
    .then(data => {
      let element = document.getElementById('images');
      for (let item of data) {
        element.innerHTML += `<p>${item.name}: </p>`;
      }
    })
    .catch(error => console.log(error));
}

//window.onload = getAllTracks();

window.onload = getAllImages();

