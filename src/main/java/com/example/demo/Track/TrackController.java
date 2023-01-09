package com.example.demo.Track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrackController {

    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("api/v1/track/{trackname}")
    @ResponseBody
    @CrossOrigin
    public EvaluatedTrack getTrack(@PathVariable String trackname) {
        return new EvaluatedTrack(trackService.getTrack(trackname),getTrack("Inevitable"));
    }
}
