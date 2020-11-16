package com.example.gitandroidapp.main;

/*
 * Responsible for handling actions from the view and updating UI as required
 * */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;
    MainPresenter(MainContract.MvpView mvpView){
        this.mvpView=mvpView;
    }

}
