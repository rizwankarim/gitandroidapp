package com.example.gitandroidapp.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gitandroidapp.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.VHolder> {
    List<Contacts> myContacts;
    Context context;

    public RecyclerAdapter(Context context, List<Contacts> contacts) {
        this.context=context;
        this.myContacts=contacts;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.item,parent,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder holder, int position) {
        Contacts contacts= myContacts.get(position);
        holder.name.setText(contacts.getName());
        holder.phone.setText(contacts.getPhone());
        holder.address.setText(contacts.getAddress());
    }

    @Override
    public int getItemCount() {
        return myContacts.size();
    }

    public class VHolder extends RecyclerView.ViewHolder {

        TextView name,address,phone;
        public VHolder(@NonNull View itemView) {
            super(itemView);
            name= itemView.findViewById(R.id.name);
            phone= itemView.findViewById(R.id.phone);
            address=itemView.findViewById(R.id.address);

        }
    }
}
