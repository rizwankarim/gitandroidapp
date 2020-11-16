package com.example.gitandroidapp.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gitandroidapp.R;
import com.example.gitandroidapp.databinding.ActivityMainBinding;

/*
 * Display the main screen of the application
 * */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;
    EditText Name,Phone,Address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mPresenter= new MainPresenter(this);
        binding.setPresenter(mPresenter);
    }

    // Mvp View Methods
    @Override
    public void ShowSuccess() {
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show();
    }


}