package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.TrackDto.TrackDto;
import com.yummygoods.eggsampleapp.model.Track;
import com.yummygoods.eggsampleapp.repository.TrackRepository;
import com.yummygoods.eggsampleapp.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class TrackController {

    TrackRepository trackRepository;
final TrackService trackService;

    public TrackController(@Autowired TrackService trackService, @Autowired TrackRepository trackRepository) {
        this.trackService = trackService;
        this.trackRepository = trackRepository;

    }

    @GetMapping(value = "/tracks")
   public Iterable<Track> getAllTracks()
    {
        System.out.println("wtf ??");
        return trackService.getAll();

    }

    @CrossOrigin
    @PostMapping(value = "/tracks")
    public Track save( @RequestBody TrackDto trackDto )
    {
        return trackService.save( new Track(trackDto.ID()) );
    }


    @GetMapping(value = "/tracks/{id}")
    public Track findById(@PathVariable Integer id )
    {
        return trackService.findById(id);
    }

    @PutMapping(value = "/tracks/{id}")
    public Track update( @RequestBody TrackDto trackDto, @PathVariable Integer id )
    {
        Track track = trackService.findById( id );
        track.setName( trackDto.name() );
        track.setNotes( trackDto.notes() );

        return trackService.save( track );
    }

    @DeleteMapping(value = "/tracks/{id}")
    public void delete( @PathVariable Integer id )
    {
       trackService.delete( id );
    }


}
