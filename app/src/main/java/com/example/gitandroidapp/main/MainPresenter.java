package com.example.gitandroidapp.main;

import android.view.View;
import android.widget.EditText;

import com.example.gitandroidapp.R;

/*
 * Responsible for handling actions from the view and updating UI as required
 * */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;
    MainPresenter(MainContract.MvpView mvpView){
        this.mvpView=mvpView;
    }

    // Presenter Methods
    @Override
    public void HandleNextPage(View view) {
        mvpView.ShowSuccess();
    }
}
