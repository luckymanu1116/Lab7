package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Name: Manoj Kumar Reddy Guttikonda. ID: A00258697.
//Name: Naresh Kmanaboyana, ID: A00257027.
//Name: Manikanta Reddy Sama, ID: A00255242.
    public class settings extends AppCompatActivity {

        TextView tex1;
        Button save_btn;
        Button cancel_btn;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_settings);

            tex1 = findViewById(R.id.tex1);
            save_btn = findViewById(R.id.save_btn);
            cancel_btn = findViewById(R.id.cancel_btn);
            cancel_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(settings.this, MainActivity.class));
                }
            });

        }


    }
