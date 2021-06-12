package com.example.myfirsttask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
    ArrayList<ObjectClass> myObjects;

    public Adapter(ArrayList<ObjectClass> myObjects)
    { this.myObjects=myObjects; }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.ViewHolder holder, int position)
    {
        ObjectClass objectClass=myObjects.get(position);
        holder.imageView.setImageResource(objectClass.getImageResource());
        holder.textView1.setText(objectClass.getTitle1());
        holder.textView2.setText(objectClass.getTitle2());
        holder.textView3.setText(objectClass.getTitle3());
    }

    @Override
    public int getItemCount()
    {
        return myObjects.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;

        public ViewHolder(@NonNull View view)
        {
            super(view);
            imageView=view.findViewById(R.id.image_of_card);
            textView1=view.findViewById(R.id.description1);
            textView2=view.findViewById(R.id.description2);
            textView3=view.findViewById(R.id.money);
        }
    }
}
