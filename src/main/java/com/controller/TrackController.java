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
    private List<Track> getAllTracks()
    {
        return trackService.getAllTracks();
    }

}
