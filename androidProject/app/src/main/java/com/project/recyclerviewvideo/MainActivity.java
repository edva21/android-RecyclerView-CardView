package com.project.recyclerviewvideo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


                people = new ArrayList<Person>();
        people.add(new Person("John","Rambo","Bus"));
        people.add(new Person("Chuck","Norris","Bus"));
        people.add(new Person("Petter","Jennings","Bus"));
        people.add(new Person("Tom","Cruise","Bus"));

        people.add(new Person("John","Rambo","Plane"));
        people.add(new Person("Chuck","Norris","Plane"));
        people.add(new Person("Petter","Jennings","Plane"));
        people.add(new Person("Tom","Cruise","Plane"));

        people.add(new Person("John","Rambo","Bus"));
        people.add(new Person("Chuck","Norris","Bus"));
        people.add(new Person("Petter","Jennings","Bus"));
        people.add(new Person("Tom","Cruise","Bus"));

        people.add(new Person("John","Rambo","Plane"));
        people.add(new Person("Chuck","Norris","Plane"));
        people.add(new Person("Petter","Jennings","Plane"));
        people.add(new Person("Tom","Cruise","Plane"));

        myAdapter = new PersonAdapter(this,people);

        recyclerView.setAdapter(myAdapter);
    }
}
