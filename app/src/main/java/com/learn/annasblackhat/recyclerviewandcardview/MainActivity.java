package com.learn.annasblackhat.recyclerviewandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerViewAdapter(persons));
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Annas BlackHat", "20 years old", R.drawable.annas));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.annas));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.annas));
    }
}
