package com.example.demo.Track;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table
public class Track {

    @Id
    private String trackName;
    private Integer albumNumber;
    private Integer trackNumber;
    private Time trackLength;

    public Track(String trackName, Integer albumNumber, Integer trackNumber, Time trackLength) {
        this.trackName = trackName;
        this.albumNumber = albumNumber;
        this.trackNumber = trackNumber;
        this.trackLength = trackLength;
    }

    public Track(){}

    public String getTrackName() {
        return trackName;
    }

    public Integer getAlbumNumber() {
        return albumNumber;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public Time getTrackLength() {
        return trackLength;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackName='" + trackName + '\'' +
                ", albumNumber=" + albumNumber +
                ", trackNumber=" + trackNumber +
                ", trackLength=" + trackLength.toString();
    }
}
