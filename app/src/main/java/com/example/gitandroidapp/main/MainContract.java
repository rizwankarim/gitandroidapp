package com.example.gitandroidapp.main;

import android.view.View;

import java.util.List;

/*
* Define the contract between the View and the presenter
* */
public interface MainContract {

    interface MvpView{
        void ShowSuccess(List<Contacts> contacts);
    }
    interface Presenter{
        void HandleNextPage(String name, String phone, String address);
    }
}
