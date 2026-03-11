package com.example.quizapplicationproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Eset5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eset5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button button = findViewById(R.id.btnsubmit1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup optionsGroup1 = findViewById(R.id.options1);
                RadioGroup optionsGroup2 = findViewById(R.id.options2);
                RadioGroup optionsGroup3 = findViewById(R.id.options3);
                RadioGroup optionsGroup4 = findViewById(R.id.options4);
                RadioGroup optionsGroup5 = findViewById(R.id.options5);
                RadioGroup optionsGroup6 = findViewById(R.id.options6);
                RadioGroup optionsGroup7 = findViewById(R.id.options7);
                RadioGroup optionsGroup8 = findViewById(R.id.options8);
                RadioGroup optionsGroup9 = findViewById(R.id.options9);
                RadioGroup optionsGroup10 = findViewById(R.id.options10);


                int selectedId1 = optionsGroup1.getCheckedRadioButtonId();
                int selectedId2 = optionsGroup2.getCheckedRadioButtonId();
                int selectedId3 = optionsGroup3.getCheckedRadioButtonId();
                int selectedId4 = optionsGroup4.getCheckedRadioButtonId();
                int selectedId5 = optionsGroup5.getCheckedRadioButtonId();
                int selectedId6 = optionsGroup6.getCheckedRadioButtonId();
                int selectedId7 = optionsGroup7.getCheckedRadioButtonId();
                int selectedId8 = optionsGroup8.getCheckedRadioButtonId();
                int selectedId9 = optionsGroup9.getCheckedRadioButtonId();
                int selectedId10 = optionsGroup10.getCheckedRadioButtonId();


                if (selectedId1 != -1 && selectedId2 != -1 && selectedId3 != -1 && selectedId4 != -1 && selectedId5 != -1 && selectedId6 != -1 && selectedId7 != -1 && selectedId8 != -1 && selectedId9 != -1 && selectedId10 != -1  ) {
                    RadioButton selectedOption1 = findViewById(selectedId1);
                    String selectedText1 = selectedOption1.getText().toString();

                    RadioButton selectedOption2 = findViewById(selectedId2);
                    String selectedText2 = selectedOption2.getText().toString();

                    RadioButton selectedOption3 = findViewById(selectedId3);
                    String selectedText3 = selectedOption3.getText().toString();

                    RadioButton selectedOption4 = findViewById(selectedId4);
                    String selectedText4 = selectedOption4.getText().toString();

                    RadioButton selectedOption5 = findViewById(selectedId5);
                    String selectedText5 = selectedOption5.getText().toString();

                    RadioButton selectedOption6 = findViewById(selectedId6);
                    String selectedText6 = selectedOption6.getText().toString();

                    RadioButton selectedOption7 = findViewById(selectedId7);
                    String selectedText7 = selectedOption7.getText().toString();

                    RadioButton selectedOption8 = findViewById(selectedId8);
                    String selectedText8 = selectedOption8.getText().toString();

                    RadioButton selectedOption9 = findViewById(selectedId9);
                    String selectedText9 = selectedOption9.getText().toString();

                    RadioButton selectedOption10 = findViewById(selectedId10);
                    String selectedText10 = selectedOption10.getText().toString();





                    Intent intent = new Intent(Eset5.this,resulteasyset5.class);
                    intent.putExtra("selected_option1", selectedText1);
                    intent.putExtra("selected_option2", selectedText2);
                    intent.putExtra("selected_option3", selectedText3);
                    intent.putExtra("selected_option4", selectedText4);
                    intent.putExtra("selected_option5", selectedText5);
                    intent.putExtra("selected_option6", selectedText6);
                    intent.putExtra("selected_option7", selectedText7);
                    intent.putExtra("selected_option8", selectedText8);
                    intent.putExtra("selected_option9", selectedText9);
                    intent.putExtra("selected_option10",selectedText10);





                    startActivity(intent);


                } else {
                    Toast.makeText(Eset5.this, "Please Attempt all Questions before continuing.", Toast.LENGTH_SHORT).show();
                }












            }
        });

        ImageView imageview =findViewById(R.id.imageview);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Eset5.this, MainActivity2.class);
                startActivity(i);
            }
        });


        ImageView home =findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Eset5.this, MainActivity.class);
                startActivity(i);
            }
        });




    }
}