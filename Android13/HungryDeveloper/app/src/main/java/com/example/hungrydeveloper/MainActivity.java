package com.example.hungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView appetizersCard = findViewById(R.id.card_view_appetizers);
        CardView mainCoursesCard = findViewById(R.id.card_view_main_courses);
        CardView dessertsCard = findViewById(R.id.card_view_desserts);

        appetizersCard.setOnClickListener(v -> {
            Intent appetizersIntent = new Intent(MainActivity.this, AppetizerActivity.class);
            startActivity(appetizersIntent);
        });

        mainCoursesCard.setOnClickListener(v -> {
            Intent mainCoursesIntent = new Intent(MainActivity.this, MainCourseActivity.class);
            startActivity(mainCoursesIntent);
        });

        dessertsCard.setOnClickListener(v -> {
            Intent mainCoursesIntent = new Intent(MainActivity.this, DessertActivity.class);
            startActivity(mainCoursesIntent);
        });

        // https://developer.android.com/guide/components/intents-common#Email
        TextView emailTextView = findViewById(R.id.text_view_email);
        String email = emailTextView.getText().toString();
        emailTextView.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + email));
            startActivity(emailIntent);
        });
    }
}