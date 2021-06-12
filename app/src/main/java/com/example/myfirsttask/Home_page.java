package com.example.myfirsttask;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Home_page extends Fragment
{
    RecyclerView recyclerView;
    Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ObjectClass> objectsOfObjectClass=new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        objectsOfObjectClass.add(new ObjectClass(R.drawable.ic_baseline_arrow_upward_24,"Sent","Sending Payments to Clients","$180"));
        objectsOfObjectClass.add(new ObjectClass(R.drawable.ic_baseline_arrow_downward_24,"Received","Receiving Money from Clients","$300"));
        objectsOfObjectClass.add(new ObjectClass(R.drawable.ic_baseline_local_atm_24,"Loan","Loan Taken","$200"));
        objectsOfObjectClass.add(new ObjectClass(R.drawable.ic_baseline_local_post_office_24,"Loss","Loss Encountered in last month","$10"));
        objectsOfObjectClass.add(new ObjectClass(R.drawable.ic_baseline_monetization_on_24,"Profit","Total Profit in Last Month","$1000"));
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getActivity());
        adapter=new Adapter(objectsOfObjectClass);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        @SuppressLint("InflateParams") ViewGroup root= (ViewGroup) inflater.inflate(R.layout.fragment_home_page,null);
        return root;
    }
}