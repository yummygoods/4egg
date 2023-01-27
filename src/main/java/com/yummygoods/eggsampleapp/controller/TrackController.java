package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.DTO.TrackDto;
import com.yummygoods.eggsampleapp.model.Track;
import com.yummygoods.eggsampleapp.repository.TrackRepository;
import com.yummygoods.eggsampleapp.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class TrackController {

   final TrackRepository trackRepository;
final TrackService trackService;

    public TrackController(@Autowired TrackService trackService, @Autowired TrackRepository trackRepository) {
        this.trackService = trackService;
        this.trackRepository = trackRepository;

    }

    @GetMapping(value = "/tracks/all")
   public Iterable<Track> getAllTracks()
    {
        System.out.println("this should get all tracks");
        return trackService.getAll();

    }




    @PostMapping(value = "/tracks")
    public Track save( @RequestBody TrackDto trackDto )
    {
        return trackService.save( new Track(trackDto) );
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
        track.setName( trackDto.getName() );
        track.setNotes( trackDto.getNotes() );
        return trackService.save( track );
    }


    @DeleteMapping(value = "/tracks/{id}")
    public void delete( @PathVariable Integer id )
    {
       trackService.delete( id );
    }


}
