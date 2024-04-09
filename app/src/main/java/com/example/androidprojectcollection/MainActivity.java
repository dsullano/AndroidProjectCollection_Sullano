package com.example.androidprojectcollection;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button midbtn;
    Button prefinalbtn;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        midbtn = findViewById(R.id.midbtn);
        prefinalbtn = findViewById(R.id.prefibtn);

        btn1.setOnClickListener(view -> {
            Intent intent1 = new Intent(
                    MainActivity.this,
            LayoutExercise.class);
            startActivity(intent1);
        });

        btn2.setOnClickListener(view -> {
            Intent intent2 = new Intent(
                    MainActivity.this,
                    Button_Activity.class);
            startActivity(intent2);
        });

        btn3.setOnClickListener(view -> {
            Intent intent3 = new Intent(
                    MainActivity.this,
                    Calculator.class);
            startActivity(intent3);
        });

        midbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(
                        MainActivity.this,
                        batch2.class);
                Toast.makeText(MainActivity.this, "Sullano, Dechie A. - Opening TicTacToe...", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
            }
        });

        prefinalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(
                        MainActivity.this,
                       match3.class);
                Toast.makeText(MainActivity.this, "Sullano, Dechie A. - Opening Match 3...", Toast.LENGTH_SHORT).show();
                startActivity(intent5);
            }
        });


    }
}