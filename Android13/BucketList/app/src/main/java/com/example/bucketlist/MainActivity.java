package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        CardView thingsToDo = findViewById(R.id.card_view_things_to_do);
        CardView placesToGo = findViewById(R.id.card_view_places_to_go);

        thingsToDo.setOnClickListener(v -> {
            Intent newIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
            startActivity(newIntent);
        });

        placesToGo.setOnClickListener(v -> {
            Intent newIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
            startActivity(newIntent);
        });
    }
}