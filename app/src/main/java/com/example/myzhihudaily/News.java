package com.example.myzhihudaily;

public class News {
    String title;
    int photo;


    public News(String title,int photo){
        this.title=title;
        this.photo=photo;
    }


    public String getTitle(){
        return title;
    }
    public int getPhoto(){
        return photo;
    }
}
