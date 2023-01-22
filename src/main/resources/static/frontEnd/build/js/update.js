function updateTrack(id, data) {
  fetch(`http://localhost:8080/tracks/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data)
  })
    .then(response => {
                            if (response.ok) {
                              console.log('Track updated successfully!');
                              return response.json();
                            } else {
                              throw new Error('Error updating track');
                            }
                          })
                          .then(data => {
                            let element = document.getElementById('update');
                            //document.getElementById(`track-${id}`);
                            element.innerHTML = `<p>yesssssss</p>` +
                            `<img src="https://media1.giphy.com/media/nDSlfqf0gn5g4/giphy.gif">` +
                            `<p>Your track was successfully updated!</p>`
                          /*  +
                            `<p>Updated Track Name:</p>`+
                            `<p>${data.name}</p>`+
                            ` <p>Updated Track Notes:</p>`+
                            `<p>${data.notes}</p>` ;*/

                          })
                          .catch(error => console.log(error));
                      }





//updateTrack(1, {name: 'newName', notes:'newNotes'});
//updateTrack(154, {name: 'testing UPDATE', notes:'trying to put the U in CRUD'});

window.onload = updateTrack(135, {name: 'Gonna Update Ya', notes: 'You feel that? I updated your ass.'});