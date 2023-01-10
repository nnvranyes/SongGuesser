package com.example.demo.Track;

import java.sql.Time;

public class EvaluatedTrack{

    private String trackName;
    private Integer albumNumber;
    private Integer trackNumber;
    private Time trackLength;

    private String guessColor;
    private String trackNameColor;
    private String trackNumberColor;
    private String albumNumberColor;
    private String trackLengthColor;

    private String albumUpOrDown;
    private String trackNumberUpOrDown;
    private String trackLengthUpOrDown;


    @Override
    public String toString() {
        return "EvaluatedTrack{" +
                "trackName='" + trackName + '\'' +
                ", albumNumber=" + albumNumber +
                ", trackNumber=" + trackNumber +
                ", trackLength=" + trackLength +
                ", guessColor='" + guessColor + '\'' +
                ", trackNameColor='" + trackNameColor + '\'' +
                ", trackNumberColor='" + trackNumberColor + '\'' +
                ", albumNumberColor='" + albumNumberColor + '\'' +
                ", trackLenghtColor='" + trackLengthColor + '\'' +
                ", albumUpOrDown='" + albumUpOrDown + '\'' +
                ", trackNumberUpOrDown='" + trackNumberUpOrDown + '\'' +
                ", trackLenghtUpOrDown='" + trackLengthUpOrDown + '\'' +
                '}';
    }

    public EvaluatedTrack(Track answer, Track guess) {
        this.trackName = guess.getTrackName();
        this.albumNumber = guess.getAlbumNumber();
        this.trackNumber = guess.getTrackNumber();
        this.trackLength = guess.getTrackLength();

        this.guessColor = "";
        this.trackNameColor = "";
        this.trackNumberColor = "";
        this.albumNumberColor = "";
        this.trackLengthColor = "";

        if(guess.getTrackName().equals(answer.getTrackName())){
            this.guessColor = "green";
            this.trackNameColor = "green";
            this.trackNumberColor = "green";
            this.albumNumberColor = "green";
            this.trackLengthColor = "green";
            this.albumUpOrDown = "";
            this.trackNumberUpOrDown = "";
            this.trackLengthUpOrDown = "";
        }else{
            //ALBUM NUMBER CHECK
            if(guess.getAlbumNumber() == answer.getAlbumNumber()){
                this.albumUpOrDown = "";
                this.albumNumberColor = "green";
            }
            else if(guess.getAlbumNumber() > answer.getAlbumNumber()){
                if(guess.getAlbumNumber() - answer.getAlbumNumber() < 3){
                    this.albumNumberColor = "yellow";
                }
                this.albumUpOrDown = "^";
            }else{
                if(answer.getAlbumNumber() - guess.getAlbumNumber() < 3){
                    this.albumNumberColor = "yellow";
                }
                this.albumUpOrDown = "v";
            }
            //TRACK NUMBER CHECK
            if(guess.getTrackNumber() == answer.getTrackNumber()){
                this.trackNumberUpOrDown = "";
                this.trackNumberColor = "green";
            }
            else if(guess.getTrackNumber() > answer.getTrackNumber()){
                if(guess.getTrackNumber() - answer.getTrackNumber() < 3){
                    this.trackNumberColor = "yellow";
                }
                this.trackNumberUpOrDown = "^";
            }else{
                if(answer.getTrackNumber() - guess.getTrackNumber() < 3){
                    this.trackNumberColor = "yellow";
                }
                this.trackNumberUpOrDown = "v";
            }
            //TRACK LENGTH CHECK
            if(guess.getTrackLength().equals(answer.getTrackLength())){
                this.trackLengthUpOrDown = "";
                this.trackLengthColor = "green";
            }
            else if(guess.getTrackLength().getMinutes() * 60 + guess.getTrackLength().getSeconds() < answer.getTrackLength().getMinutes() * 60 + answer.getTrackLength().getSeconds()){
                if((guess.getTrackLength().getSeconds() + (guess.getTrackLength().getMinutes() * 60)) - (answer.getTrackLength().getSeconds() + answer.getTrackLength().getMinutes() * 60) < 30){
                    this.trackLengthColor = "yellow";
                }
                this.trackLengthUpOrDown = "^";
            }else{
                if((guess.getTrackLength().getSeconds() + (guess.getTrackLength().getMinutes() * 60)) - (answer.getTrackLength().getSeconds() + answer.getTrackLength().getMinutes() * 60) < 30){
                    this.trackLengthColor = "yellow";
                }
                this.trackLengthUpOrDown = "v";
            }
        }
    }

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

    public String getGuessColor() {
        return guessColor;
    }

    public String getTrackNameColor() {
        return trackNameColor;
    }

    public String getTrackNumberColor() {
        return trackNumberColor;
    }

    public String getAlbumNumberColor() {
        return albumNumberColor;
    }

    public String getTrackLengthColor() {
        return trackLengthColor;
    }

    public String getAlbumUpOrDown() {
        return albumUpOrDown;
    }

    public String getTrackNumberUpOrDown() {
        return trackNumberUpOrDown;
    }

    public String getTrackLengthUpOrDown() {
        return trackLengthUpOrDown;
    }
}
