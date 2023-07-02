package com.example.bmicalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button calculateButton;
    private EditText ageEditText;
    private EditText feetEditText;
    private EditText inchesEditText;
    private EditText weightEditText;
    private RadioButton femaleRadioButton;
    private RadioButton maleRadioButton;

    private TextView bmiTextView;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
    }


    private void findViews() {
        maleRadioButton = findViewById(R.id.radio_button_male);
        femaleRadioButton = findViewById(R.id.radio_button_female);

        ageEditText = findViewById(R.id.edit_text_age);
        feetEditText = findViewById(R.id.edit_text_feet);
        inchesEditText = findViewById(R.id.edit_text_inches);
        weightEditText = findViewById(R.id.edit_text_weight);

        calculateButton = findViewById(R.id.button_calculate);

        bmiTextView = findViewById(R.id.text_view_bmi);
        messageTextView = findViewById(R.id.text_view_message);
    }

    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(v -> {
            double bmi = calculateBmi();

            int age = Integer.parseInt(ageEditText.getText().toString());

            if (age >= 18)
                displayResult(bmi);
            else
                displayGuidance(bmi);
        });
    }

    private double calculateBmi() {
        int feet = Integer.parseInt(feetEditText.getText().toString());
        int inches = Integer.parseInt(inchesEditText.getText().toString());
        int weight = Integer.parseInt(weightEditText.getText().toString());

        int totalInches = feet * 12 + inches;
        double heightInMeters = totalInches * 0.0254;
        double weightInKg = weight * 0.453592;

        return weightInKg / (heightInMeters * heightInMeters);
    }

    private void displayResult(double bmi) {
        String message = "Your are ";

        if (bmi < 18.5) {
            message += "underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            message += "a healthy weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            message += "overweight";
        } else if (bmi >= 30) {
            message += "obese";
        }

        bmiTextView.setText("BMI: " + (new DecimalFormat("0.00")).format(bmi));
        messageTextView.setText(message);
    }

    private void displayGuidance(double bmi) {
        String message;

        if (maleRadioButton.isChecked()) {
            message = "As you are under 18, please consult with your doctor for the healthy range for boys.";
        } else if (femaleRadioButton.isChecked()) {
            message = "As you are under 18, please consult with your doctor for the healthy range for girls.";
        } else {
            message = "As you are under 18, please consult with your doctor for the healthy range.";
        }

        bmiTextView.setText("BMI: " + (new DecimalFormat("0.00")).format(bmi));
        messageTextView.setText(message);
    }
}