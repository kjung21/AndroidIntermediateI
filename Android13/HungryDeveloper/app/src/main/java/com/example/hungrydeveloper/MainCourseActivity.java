package com.example.hungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

        ListView mainCourseList = findViewById(R.id.list_view_main_courses);

        // https://www.name-generator.org.uk/food/
        Dish[] mainCourses = {
                new Dish("Black pepper and chickpea vindaloo", "Hot vindaloo made with hot black pepper and fresh chickpea", 1399),
                new Dish("Goji berry and cauliflower salad", "A crisp salad featuring fresh goji berry and cauliflower", 1299),
                new Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)
        };

        ArrayAdapter<Dish> mainCoursesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                mainCourses
        );

        mainCourseList.setAdapter(mainCoursesAdapter);
    }
}