package com.example.avik.headerrecyclerview;

/**
 * Created by avik on 3/8/17.
 */

public class Model {

    String Type;
    String name;
    String country;


    public Model(String type, String name, String country) {
        Type = type;
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
