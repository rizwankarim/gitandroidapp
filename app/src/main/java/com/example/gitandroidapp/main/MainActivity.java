package com.example.gitandroidapp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gitandroidapp.R;
/*
 * Display the main screen of the application
 * */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter= new MainPresenter(this);
    }
}