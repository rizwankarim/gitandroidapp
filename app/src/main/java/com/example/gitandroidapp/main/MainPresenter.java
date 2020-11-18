package com.example.gitandroidapp.main;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gitandroidapp.R;

import java.util.ArrayList;
import java.util.List;

/*
 * Responsible for handling actions from the view and updating UI as required
 * */
public class MainPresenter implements MainContract.Presenter {

    EditText name, phone,address;
    List<Contacts> contactsList;


    private MainContract.MvpView mvpView;
    MainPresenter(MainContract.MvpView mvpView){
        this.mvpView=mvpView;
    }

    // Presenter Methods

    @Override
    public void HandleNextPage(String name, String phone, String address) {
        contactsList= new ArrayList<>();

        Contacts contacts= new Contacts();
        contacts.setName(name);
        contacts.setAddress(address);
        contacts.setPhone(phone);
        contactsList.add(contacts);
        mvpView.ShowSuccess(contactsList);
    }
}
