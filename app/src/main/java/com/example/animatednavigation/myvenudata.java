package com.example.animatednavigation;

public class myvenudata {
    private String venuName;
    private String addressvenu;
    private Integer movieImage;

    public myvenudata(String venuName, String addressvenu, Integer movieImage) {
        this.venuName = venuName;
        this.addressvenu = addressvenu;
        this.movieImage = movieImage;
    }

    public String getVenuName() {
        return venuName;
    }

    public void setVenuName(String venuName) {
        this.venuName = venuName;
    }

    public String getAddressvenu() {
        return addressvenu;
    }

    public void setAddressvenu(String addressvenu) {
        this.addressvenu = addressvenu;
    }

    public Integer getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Integer movieImage) {
        this.movieImage = movieImage;
    }
}
