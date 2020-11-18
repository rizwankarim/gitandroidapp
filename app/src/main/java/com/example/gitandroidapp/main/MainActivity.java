package com.example.gitandroidapp.main;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gitandroidapp.R;

import java.util.List;

/*
 * Display the main screen of the application
 * */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;
    EditText Name,Phone,Address;
    Button on_success;
    RecyclerView rv;
    RecyclerAdapter adapter;
    LinearLayoutManager lm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter= new MainPresenter(this);

        init();
        on_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.HandleNextPage(Name.getText().toString(),Phone.getText().toString(),Address.getText().toString());
            }
        });
    }

    public void init(){
        Name=findViewById(R.id.name);
        Phone=findViewById(R.id.phone);
        Address=findViewById(R.id.address);
        on_success=findViewById(R.id.submit);
        rv= findViewById(R.id.recyclerView);
        lm= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    }
    // Mvp View Methods
    @Override
    public void ShowSuccess(List<Contacts> contacts) {
        adapter=new RecyclerAdapter(getApplicationContext(),contacts);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show();
    }


}