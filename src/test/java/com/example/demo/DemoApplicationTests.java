package com.example.demo;

import com.example.demo.Track.EvaluatedTrack;
import com.example.demo.Track.Track;
import org.junit.jupiter.api.Test;
import org.mockito.internal.junit.JUnitTestRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.sql.Time;

@SpringBootTest
class DemoApplicationTests {

    @Test
    public void test1(){
        Track track1 = new Track("name",2,5,new Time(0,3,20));
        Track track2 = new Track("name",2,5,new Time(0,3,20));

        Track track3 = new Track("name2",1,4,new Time(0,3,15));
        Track track4 = new Track("name3",3,5,new Time(0,3,30));
        Track track5 = new Track("name4",4,6,new Time(0,2,30));
        Track track6 = new Track("name5",5,7,new Time(0,3,50));
        Track track7 = new Track("name6",6,8,new Time(0,2,50));
        Track track8 = new Track("name7",7,9,new Time(0,3,15));

        System.out.println(new EvaluatedTrack(track2,track1));
        System.out.println(new EvaluatedTrack(track3,track1));
        System.out.println(new EvaluatedTrack(track4,track1));
        System.out.println(new EvaluatedTrack(track5,track1));
        System.out.println(new EvaluatedTrack(track6,track1));
        System.out.println(new EvaluatedTrack(track7,track1));
        System.out.println(new EvaluatedTrack(track8,track1));
    }

}
