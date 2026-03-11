package com.example.quizapplicationproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btn1= findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        Button btn3=findViewById(R.id.btn3);
        Button btn4=findViewById(R.id.btn4);
        Button btn5=findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "Loading Set 1", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity2.this, Eset1.class);
                startActivity(i);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "Loading Set 2", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity2.this, Eset2.class);
                startActivity(i);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "Loading Set 3", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity2.this, Eset3.class);
                startActivity(i);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "Loading Set 4", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity2.this, Eset4.class);
                startActivity(i);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "Loading Set 5", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity2.this, Eset5.class);
                startActivity(i);

            }
        });


        ImageView imageview =findViewById(R.id.imageview);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity2.this, MainActivity2.class);
                startActivity(i);
            }
        });


        ImageView home =findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });



    }
}