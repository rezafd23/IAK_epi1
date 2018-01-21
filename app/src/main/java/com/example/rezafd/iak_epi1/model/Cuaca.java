package com.example.rezafd.iak_epi1.model;

/**
 * Created by REZAFD on 20/01/2018.
 */

public class Cuaca {
    private int image;
    private String title;
    private String text;

    public Cuaca() {
    }

    public Cuaca(int image, String title, String text) {
        this.image = image;
        this.title = title;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
