package com.example.gitandroidapp.main;

import android.media.browse.MediaBrowser;

public class Contacts {

    private String name;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contacts (){

    }
    public Contacts (String name,String phone,String address){
        this.name= name;
        this.address= address;
        this.phone=phone;
    }

}
