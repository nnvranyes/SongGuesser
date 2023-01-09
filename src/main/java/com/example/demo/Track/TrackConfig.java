package com.example.demo.Track;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;
import java.util.List;

@Configuration
public class TrackConfig {

    @Bean
    CommandLineRunner trackCommandLineRunner(TrackRepository repository){
        return args -> {
            Track track11 = new Track(
                    "Readyfuels",
                    1,
                    1,
                    new Time(0,3,37)
            );
            Track track12 = new Track(
                    "Foreign Language",
                    1,
                    2,
                    new Time(0,2,49)
            );
            Track track13 = new Track(
                    "Change the World (Lost Ones)",
                    1,
                    3,
                    new Time(0,3,59)
            );
            Track track14 = new Track(
                    "Cold War Transmissions",
                    1,
                    4,
                    new Time(0,3,12)
            );
            Track track15 = new Track(
                    "Glass to the Arson",
                    1,
                    5,
                    new Time(0,3,29)
            );
            Track track16 = new Track(
                    "The Undeveloped Story",
                    1,
                    6,
                    new Time(0,3,27)
            );
            Track track17 = new Track(
                    "Autobahn",
                    1,
                    7,
                    new Time(0,3,25)
            );
            Track track18 = new Track(
                    "We Dreamt in Heist",
                    1,
                    8,
                    new Time(0,3,17)
            );
            Track track19 = new Track(
                    "Love Song",
                    1,
                    9,
                    new Time(0,3,05)
            );
            Track track110 = new Track(
                    "Cadence",
                    1,
                    10,
                    new Time(0,3,37)
            );
            Track track111 = new Track(
                    "Naive Orleans",
                    1,
                    11,
                    new Time(0,4,8)
            );


            Track track21 = new Track(
                    "Never Take Friendship Personal",
                    2,
                    1,
                    new Time(0,3,33)
            );
            Track track22 = new Track(
                    "Paperthin Hymn",
                    2,
                    2,
                    new Time(0,3,17)
            );
            Track track23 = new Track(
                    "Stationary Stationery",
                    2,
                    3,
                    new Time(0,3,0)
            );
            Track track24 = new Track(
                    "(The Symphony of) Blase",
                    2,
                    4,
                    new Time(0,4,23)
            );
            Track track25 = new Track(
                    "A Day Late",
                    2,
                    5,
                    new Time(0,3,27)
            );
            Track track26 = new Track(
                    "The Runaways",
                    2,
                    6,
                    new Time(0,3,22)
            );
            Track track27 = new Track(
                    "Time & Confusion",
                    2,
                    7,
                    new Time(0,3,25)
            );
            Track track28 = new Track(
                    "The Feel Good Drag",
                    2,
                    8,
                    new Time(0,3,27)
            );
            Track track29 = new Track(
                    "Audrey, Start the Revolution!",
                    2,
                    9,
                    new Time(0,3,24)
            );
            Track track210 = new Track(
                    "A Heavy Hearted Work of Staggering Genius",
                    2,
                    10,
                    new Time(0,1,14)
            );
            Track track211 = new Track(
                    "Dance, Dance Christa Paffgen",
                    2,
                    11,
                    new Time(0,7,06)
            );


            Track track31 = new Track(
                    "(Début)",
                    3,
                    1,
                    new Time(0,1,26)
            );
            Track track32 = new Track(
                    "Godspeed",
                    3,
                    2,
                    new Time(0,3,02)
            );
            Track track33 = new Track(
                    "Adelaide",
                    3,
                    3,
                    new Time(0,3,14)
            );
            Track track34 = new Track(
                    "A Whisper & A Clamor",
                    3,
                    4,
                    new Time(0,3,25)
            );
            Track track35 = new Track(
                    "The Unwinding Cable Car",
                    3,
                    5,
                    new Time(0,4,17)
            );
            Track track36 = new Track(
                    "There Is No Mathematics to Love and Loss",
                    3,
                    6,
                    new Time(0,3,11)
            );
            Track track37 = new Track(
                    "Hello Alone",
                    3,
                    7,
                    new Time(0,4,0)
            );
            Track track38 = new Track(
                    "Alexithymia",
                    3,
                    8,
                    new Time(0,3,23)
            );
            Track track39 = new Track(
                    "Reclusion",
                    3,
                    9,
                    new Time(0,3,31)
            );
            Track track310 = new Track(
                    "Inevitable",
                    3,
                    10,
                    new Time(0,3,47)
            );
            Track track311 = new Track(
                    "Dismantle.Repair.",
                    3,
                    11,
                    new Time(0,4,18)
            );
            Track track312 = new Track(
                    "(*Fin)",
                    3,
                    12,
                    new Time(0,8,53)
            );


            repository.saveAll(List.of(track11,track12,track13,track14,track15,track15,track16,track17,track18,track19,track110,track111,
                        track21,track22,track23,track24,track25,track26,track27,track28,track29,track210,track211,
                        track31,track32,track33,track34,track35,track36,track37,track38,track39,track310,track311,track312));
        };
    }
}
