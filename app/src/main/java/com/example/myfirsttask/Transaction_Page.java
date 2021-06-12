package com.example.myfirsttask;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Transaction_Page extends Fragment
{
    Button addButton,expensesButton,receivedButton;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewGroup root= (ViewGroup) inflater.inflate(R.layout.fragment_transaction__page,container,false);
        addButton=root.findViewById(R.id.btn_all);
        receivedButton=root.findViewById(R.id.btn_got);
        expensesButton=root.findViewById(R.id.btn_expenses);
        int initialColor=Color.rgb(149, 224, 123);
        int finalColor=Color.rgb(207, 76, 85);
        addButton.setBackgroundColor(initialColor);receivedButton.setBackgroundColor(initialColor);expensesButton.setBackgroundColor(initialColor);
        addButton.setOnClickListener(v ->
        {
            addButton.setBackgroundColor(finalColor);
            receivedButton.setBackgroundColor(initialColor);
            expensesButton.setBackgroundColor(initialColor);
        });

        receivedButton.setOnClickListener(v ->
        {
            receivedButton.setBackgroundColor(finalColor);
            addButton.setBackgroundColor(initialColor);
            expensesButton.setBackgroundColor(initialColor);
        });

        expensesButton.setOnClickListener(v ->
        {
            receivedButton.setBackgroundColor(initialColor);
            addButton.setBackgroundColor(initialColor);
            expensesButton.setBackgroundColor(finalColor);
        });
        return root;
    }
}