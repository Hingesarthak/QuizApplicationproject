package com.example.quizapplicationproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Resulteasyset1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resulteasyset1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Intent intent = getIntent();
        String selectedOption1 = intent.getStringExtra("selected_option1");
        String selectedOption2 = intent.getStringExtra("selected_option2");
        String selectedOption3 = intent.getStringExtra("selected_option3");
        String selectedOption4 = intent.getStringExtra("selected_option4");
        String selectedOption5 = intent.getStringExtra("selected_option5");
        String selectedOption6 = intent.getStringExtra("selected_option6");
        String selectedOption7 = intent.getStringExtra("selected_option7");
        String selectedOption8 = intent.getStringExtra("selected_option8");
        String selectedOption9 = intent.getStringExtra("selected_option9");
        String selectedOption10 = intent.getStringExtra("selected_option10");

        EditText edittext1 = findViewById(R.id.edittext1);
        EditText edittext3 = findViewById(R.id.edittext3);
        EditText edittext5 = findViewById(R.id.edittext5);
        EditText edittext7 = findViewById(R.id.edittext7);
        EditText edittext9 = findViewById(R.id.edittext9);
        EditText edittext11 = findViewById(R.id.edittext11);
        EditText edittext13= findViewById(R.id.edittext13);
        EditText edittext15= findViewById(R.id.edittext15);
        EditText edittext17= findViewById(R.id.edittext17);
        EditText edittext19= findViewById(R.id.edittext19);

        edittext1.setText("Selected Option: " + selectedOption1);
        edittext3.setText("Selected Option: " + selectedOption2);
        edittext5.setText("Selected Option: " + selectedOption3);
        edittext7.setText("Selected Option: " + selectedOption4);
        edittext9.setText("Selected Option: " + selectedOption5);
        edittext11.setText("Selected Option: " + selectedOption6);
        edittext13.setText("Selected Option: " + selectedOption7);
        edittext15.setText("Selected Option: " + selectedOption8);
        edittext17.setText("Selected Option: " + selectedOption9);
        edittext19.setText("Selected Option: " + selectedOption10);

        int score = 0;

        if ("Delhi".equalsIgnoreCase(selectedOption1)) score++;
        if ("Dr. B.R. Ambedkar".equalsIgnoreCase(selectedOption2)) score++;
        if ("2".equalsIgnoreCase(selectedOption3)) score++;
        if ("Mars".equalsIgnoreCase(selectedOption4)) score++;
        if ("Oxygen".equalsIgnoreCase(selectedOption5)) score++;
        if ("Blue Whale".equalsIgnoreCase(selectedOption6)) score++;
        if ("Leonardo da Vinci".equalsIgnoreCase(selectedOption7)) score++;
        if ("Nile River".equalsIgnoreCase(selectedOption8)) score++;
        if ("kidneys".equalsIgnoreCase(selectedOption9)) score++;
        if ("Neil Armstrong".equalsIgnoreCase(selectedOption10)) score++;




        Toast.makeText(Resulteasyset1.this,"You've Scored :"+ score, Toast.LENGTH_LONG).show();





    }
}