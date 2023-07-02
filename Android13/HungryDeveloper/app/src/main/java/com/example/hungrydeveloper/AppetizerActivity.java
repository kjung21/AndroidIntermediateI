package com.example.hungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AppetizerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);

        ListView appetizerList = findViewById(R.id.list_view_appetizers);

        // https://www.name-generator.org.uk/food/
        Dish[] appetizers = {
                new Dish("Mushroom and tofu maki", "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu", 999),
                new Dish("Egg and avocado uramaki", "Pasta in a sauce made from free range eggs and fresh avocado", 1199),
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        ArrayAdapter<Dish> appetizersAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                appetizers
        );

        appetizerList.setAdapter(appetizersAdapter);
    }
}