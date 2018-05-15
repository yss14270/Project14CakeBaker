package com.example.ym.project14cakebaker.Model;

/**
 * Created by Acer on 5/8/2018.
 */

public class Category {

    private String Name;
    private String Images;


    public Category() {
    }

    public Category(String name, String images) {
        this.Name = name;
        this.Images = images;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImages() {
        return Images;
    }

    public void setImages(String images) {
        Images = images;
    }
}
