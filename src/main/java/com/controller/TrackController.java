package com.controller;
import com.TrackDto.TrackDto;
import com.model.Track;
import com.service.TrackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrackController {

    // i think this is constructor injection instead of using @autowired?
final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/tracks")
   public Iterable<Track> getAllTracks()
    {
        return trackService.getAll();
    }

    @CrossOrigin
    @PostMapping
    public Track save( @RequestBody TrackDto trackDto )
    {
        return trackService.save( new Track(trackDto.getID()) );
    }


    @GetMapping("/{id}")
    public Track findById(@PathVariable Integer id )
    {
        return trackService.findById(id);
    }

    @PutMapping( "/{id}" )
    public Track update( @RequestBody TrackDto trackDto, @PathVariable Integer id )
    {
        Track track = trackService.findById( id );
        track.setName( trackDto.getName() );
        track.setNotes( trackDto.getNotes() );

        return trackService.save( track );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
       trackService.delete( id );
    }


}
