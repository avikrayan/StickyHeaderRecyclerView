package com.example.avik.headerrecyclerview;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by avik on 3/8/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private  List<String> myArraylist;
    private  List<Model> countryArraylist;
    Context context;

//    public RecyclerViewAdapter(List<String> myArraylist, MainActivity mainActivity) {
//        this.myArraylist = myArraylist;
//        this.context = mainActivity;
//    }

    public RecyclerViewAdapter(List<Model> countryArraylist, MainActivity mainActivity) {
        this.countryArraylist = countryArraylist;
        this.context = mainActivity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Model countryModel = countryArraylist.get(position);

        if (countryModel.getType().equals("country")){
            holder.textview.setText(countryModel.getName());
            holder.textview.setTextColor(Color.BLACK);
            holder.textview.setTextSize(25);
        }
        else if (countryModel.getType().equals("city")){
            holder.textview.setText(countryModel.getName());
        }

    }

    @Override
    public int getItemCount() {
        return countryArraylist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textview;
        public MyViewHolder(View itemView) {
            super(itemView);

            textview = itemView.findViewById(R.id.childTv);
        }
    }
}
