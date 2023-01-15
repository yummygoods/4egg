package com.controller;
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
    public Track save( @RequestBody ItemDto itemDto )
    {
        return itemService.save( new Item( itemDto ) );
    }


    @GetMapping("/tracks/{id}")
    private Track findById(@PathVariable Integer id )
    {
        return trackService.findById(id);
    }

    @PostMapping


}
