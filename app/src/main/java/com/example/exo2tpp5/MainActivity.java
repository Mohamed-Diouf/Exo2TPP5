package com.example.exo2tpp5;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected List<Data> planetes;
    RecyclerView recyclerView;
    PlanetAdapter adapter;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        planetes = new ArrayList<Data>();
        Data P1 =  new Data("Mercure", "1233");
        Data P2 =  new Data("Venus", "1253");
        planetes.add(P1);
        planetes.add(P2);
        adapter = new PlanetAdapter( planetes);
        recyclerView.setAdapter(adapter);

    }

}