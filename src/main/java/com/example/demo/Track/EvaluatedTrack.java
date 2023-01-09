package com.example.demo.Track;

import java.sql.Time;

public class EvaluatedTrack extends Track{
    private String guessColor;
    private String trackNameColor;
    private String trackNumberColor;
    private String albumNumberColor;
    private String trackLenghtColor;

    private String albumUpOrDown;
    private String trackNumberUpOrDown;
    private String trackLenghtUpOrDown;



    public EvaluatedTrack(Track answer, Track guess) {

        super(guess.getTrackName(), guess.getAlbumNumber(), guess.getTrackNumber(), guess.getTrackLength());
        if(guess.getTrackName().equals(answer.getTrackName())){
            this.guessColor = "green";
            this.trackNameColor = "green";
            this.trackNumberColor = "green";
            this.albumNumberColor = "green";
            this.trackLenghtColor = "green";
            this.albumUpOrDown = "";
            this.trackNumberUpOrDown = "";
            this.trackLenghtUpOrDown = "";
        }else{
            //ALBUM NUMBER CHECK
            if(guess.getAlbumNumber() == answer.getAlbumNumber()){
                this.albumUpOrDown = "";
                this.albumNumberColor = "green";
            }
            else if(guess.getAlbumNumber() > answer.getAlbumNumber()){
                if(guess.getAlbumNumber() - answer.getAlbumNumber() <= 3){
                    this.albumNumberColor = "yellow";
                }
                this.albumUpOrDown = "^";
            }else{
                if(answer.getAlbumNumber() - guess.getAlbumNumber() <= 3){
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
                if(guess.getTrackNumber() - answer.getTrackNumber() <= 3){
                    this.trackNumberColor = "yellow";
                }
                this.trackNumberUpOrDown = "^";
            }else{
                if(answer.getTrackNumber() - guess.getTrackNumber() <= 3){
                    this.trackNumberColor = "yellow";
                }
                this.trackNumberUpOrDown = "v";
            }
            //TRACK LENGTH CHECK
            if(guess.getTrackLength().equals(answer.getTrackLength())){
                this.trackNumberUpOrDown = "";
                this.trackNumberColor = "green";
            }
            else if(guess.getTrackLength().before(answer.getTrackLength())){
                if(guess.getTrackLength().getSeconds() - answer.getTrackLength().getSeconds() <= 30){
                    this.trackNumberColor = "yellow";
                }
                this.trackNumberUpOrDown = "^";
            }else{
                if(guess.getTrackLength().getSeconds() - answer.getTrackLength().getSeconds() <= 30){
                    this.trackNumberColor = "yellow";
                }
                this.trackNumberUpOrDown = "v";
            }
        }
    }


}
