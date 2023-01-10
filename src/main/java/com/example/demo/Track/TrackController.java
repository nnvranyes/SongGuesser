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

    @GetMapping("api/v1/EvaluatedTrack/{trackname}")
    @ResponseBody
    @CrossOrigin
    public EvaluatedTrack getTrack(@PathVariable String trackname) {
        EvaluatedTrack et = new EvaluatedTrack(trackService.getTrack("Inevitable"),trackService.getTrack(trackname));
        System.out.println(et.toString());
        return et;
    }
}
