package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int id;
    private String name;
    private String color;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void show(){
        System.out.println("welcome to the magic show");
    }
    
}
