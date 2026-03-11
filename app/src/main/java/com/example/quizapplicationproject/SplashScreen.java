package com.example.quizapplicationproject;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;


        public class SplashScreen extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_splash_screen);

                LottieAnimationView animationView = findViewById(R.id.animationView);
                animationView.setAnimation("loader.json");




                // Optional: wait for animation end before switching
                animationView.addAnimatorListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        startActivity(new Intent(SplashScreen.this, MainActivity.class));
                        finish();
                    }
                });

                new Handler().postDelayed(() -> {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }, 3000); // 3 seconds
            }
        }


