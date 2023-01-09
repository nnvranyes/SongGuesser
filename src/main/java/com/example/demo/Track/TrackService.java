package com.example.demo.Track;

import com.example.demo.User.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    private final TrackRepository trackRepository;

    @Autowired
    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public List<Track> getTracks(){
//        return List.of(
//                new Track("Monster",5,6,
//                    new Time(0,6,18),
//                        new String[]{"Jay Z", "Rick Ross", "Nicki Minaj", "Bon Ivor", "Charlie Wilson"}));
        return trackRepository.findAll();
    }

    public Track getTrack(String trackName){
        Optional<Track> trackOptional = trackRepository.findById(trackName);
        if(trackOptional.isPresent()){
                return trackOptional.get();
        }
        return null;
    }
}
