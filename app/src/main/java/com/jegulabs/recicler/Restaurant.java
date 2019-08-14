package com.jegulabs.recicler;

public class Restaurant {
    private String name;
    private String urlPhoto;
    private float rate;
    private String address;

    public Restaurant(String name, String urlPhoto, float rate, String address) {
        this.name = name;
        this.urlPhoto = urlPhoto;
        this.rate = rate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

