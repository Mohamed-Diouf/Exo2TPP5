package com.example.exo2tpp5;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ConteneurDeData> {
    private List<Data> data;

    public PlanetAdapter( List<Data> data){
        this.data = data;


    }




    @Override
    public ConteneurDeData onCreateViewHolder(ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem, parent, false);
        return new ConteneurDeData(view);
    }

    @Override
    public void onBindViewHolder( ConteneurDeData holder, int position) {
    holder.Nomplanetes.setText(data.get(position).getNomPlanete());
    holder.taillePlanetes.setText(data.get(position).getTaillePlanete());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }




    public class ConteneurDeData extends RecyclerView.ViewHolder {
       TextView Nomplanetes;
        TextView taillePlanetes;
        ImageView imageView;
        public ConteneurDeData(@NonNull View itemView) {
            super(itemView);
            Nomplanetes= (TextView) itemView.findViewById(R.id.textview1);
            taillePlanetes = (TextView) itemView.findViewById(R.id.textview2);
            imageView = (ImageView) itemView.findViewById(R.id.imageV);
        }
        public void onClick(View v) {
            ((CardView)v).setCardBackgroundColor(Color.rgb(255,0,0)); }

    }

}
