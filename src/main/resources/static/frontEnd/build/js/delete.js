function deleteTrack(id) {
  fetch(`http://localhost:8080/tracks/${id}`, {
    method: 'DELETE',
    headers: { 'Content-Type': 'application/json' },

  })
    .then(response => {
                            if (response.ok) {
                              console.log('Track deleted successfully!');

                            } else {
                              throw new Error('Error deleting track');
                            }
                          })
                          .then(data => {
                            let element = document.getElementById('delete');
                            //document.getElementById(`track-${id}`);
                            element.innerHTML =
                            `<p>HECK YES!</p>` +
                            `<img src="https://media2.giphy.com/media/3o6ZtpWvwnhf34Oj0A/giphy.gif">` +
                            `<p>The track was deleted successfully.</p>`  ;

                          })
                          .catch(error => console.log(error));
                      }





//updateTrack(1, {name: 'newName', notes:'newNotes'});
//updateTrack(154, {name: 'testing UPDATE', notes:'trying to put the U in CRUD'});

window.onload = deleteTrack(139);