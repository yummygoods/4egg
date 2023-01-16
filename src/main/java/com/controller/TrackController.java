package com.controller;

import com.TrackDto.TrackDto;
import com.model.Track;
import com.service.TrackService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TrackController {

    // i think this is constructor injection instead of using @autowired?
final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;

    }

    @GetMapping("/api/tracks")
   public Iterable<Track> getAllTracks()
    {
        return trackService.getAll();
    }

    @CrossOrigin
    @PostMapping("/api/tracks")
    public Track save( @RequestBody TrackDto trackDto )
    {
        return trackService.save( new Track(trackDto.getID()) );
    }


    @GetMapping("api/tracks/{id}")
    public Track findById(@PathVariable Integer id )
    {
        return trackService.findById(id);
    }

    @PutMapping( "api/tracks/{id}" )
    public Track update( @RequestBody TrackDto trackDto, @PathVariable Integer id )
    {
        Track track = trackService.findById( id );
        track.setName( trackDto.getName() );
        track.setNotes( trackDto.getNotes() );

        return trackService.save( track );
    }

    @DeleteMapping( "api/tracks/{id}" )
    public void delete( @PathVariable Integer id )
    {
       trackService.delete( id );
    }


}
