package com.example.ym.project14cakebaker.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ym.project14cakebaker.Interface.ItemClickListener;
import com.example.ym.project14cakebaker.R;

/**
 * Created by Acer on 5/1/2018.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


    public TextView food_name;
    public ImageView food_image;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView) {
        super(itemView);

        food_name =(TextView)itemView.findViewById(R.id.menu_name);
        food_image = (ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view, getAdapterPosition(), false);

    }

}




