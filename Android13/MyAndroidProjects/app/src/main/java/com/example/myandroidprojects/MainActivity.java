package com.example.myandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

/*  NOTE: inheritance chain -> AppCompatActivity -> FragmentActivity -> ComponentActivity -> androidx.core.app.ComponentActivity -> Activity
    Purpose: a single, focused thing that the user can do
    most activities interact with user,
    so Activity class takes care of creating a window for you
    to place your UI with setContentView
 */
public class MainActivity extends AppCompatActivity {

    // NOTE: called when activity is starting, where most initialization should go
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView projectList = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App",
                        "Our very first project, the default 'Hello World' app!", R.drawable.getting_started),
                new Project("Motivational Quotes App",
                        "Making a simple change to the layout, with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator App",
                        "A real life working BMI calculator teaching me Variables, Methods, and Conditional Logic", R.drawable.calculator),
                new Project("Inches Converter",
                        "A basic converter to convert inches to meters (my own personal calculator app made on my own)", R.drawable.tape),
                new Project("The Hungry Developer",
                        "A menu app for a fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents, and ListViews", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        projectList.setAdapter(adapter);
    }
}