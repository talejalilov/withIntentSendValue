package com.example.sendtovalueotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        change = findViewById(R.id.button2);

        Intent intent = getIntent();
        String user = intent.getStringExtra("userKey");
        textView.setText(user);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            startActivity(new Intent(SecondActivity.this, MainActivity.class));

            }
        });

    }
}