package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.TrackDto.TrackDto;
import com.yummygoods.eggsampleapp.model.Track;
import com.yummygoods.eggsampleapp.service.TrackService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TrackController {

    // i think this is constructor injection instead of using @autowired?
final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;

    }

    @GetMapping(value = "/api/tracks")
   public Iterable<Track> getAllTracks()
    {
        return trackService.getAll();
    }

    @CrossOrigin
    @PostMapping(value = "/api/tracks")
    public Track save( @RequestBody TrackDto trackDto )
    {
        return trackService.save( new Track(trackDto.ID()) );
    }


    @GetMapping(value = "/api/tracks/{id}")
    public Track findById(@PathVariable Integer id )
    {
        return trackService.findById(id);
    }

    @PutMapping(value = "/api/tracks/{id}")
    public Track update( @RequestBody TrackDto trackDto, @PathVariable Integer id )
    {
        Track track = trackService.findById( id );
        track.setName( trackDto.name() );
        track.setNotes( trackDto.notes() );

        return trackService.save( track );
    }

    @DeleteMapping(value = "/api/tracks/{id}")
    public void delete( @PathVariable Integer id )
    {
       trackService.delete( id );
    }


}
