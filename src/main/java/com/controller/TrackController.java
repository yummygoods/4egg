package com.controller;
import com.service.TrackService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/track")
public class TrackController {
final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
}
