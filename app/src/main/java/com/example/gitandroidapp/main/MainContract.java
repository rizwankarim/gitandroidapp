package com.example.gitandroidapp.main;

import android.view.View;

/*
* Define the contract between the View and the presenter
* */
public interface MainContract {

    interface MvpView{
        void ShowSuccess();
    }
    interface Presenter{
        void HandleNextPage(View view);
    }
}
