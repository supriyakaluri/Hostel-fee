package com.example.kaluriresidency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fee extends AppCompatActivity {
    private Button term1;
    private Button term2;
    private Button term3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee);
        term1 = findViewById(R.id.term1);
        term2 = findViewById(R.id.term2);
        term3 = findViewById(R.id.term3);
        term1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfirst_term();
            }
        });

        term2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensecond_term();
            }
        });
        term3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthird_term();
            }
        });
    }
    public void openfirst_term(){
        Intent intent = new Intent(this,first_term.class);
        startActivity(intent);
    }
    public void opensecond_term(){
        Intent intent = new Intent(this,second_term.class);
        startActivity(intent);
    }
    public void openthird_term(){
        Intent intent = new Intent(this,third_term.class);
        startActivity(intent);
    }
}