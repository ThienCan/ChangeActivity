package com.example.intern.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView =new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);


        ViewGroup layour = (ViewGroup) findViewById(R.id.activity_display_message);
        layour.addView(textView);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "DMonStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "DMonPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        Toast.makeText(this, "DMonResume", Toast.LENGTH_SHORT).show();
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "DMonStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "DMonRestart", Toast.LENGTH_SHORT).show();
    }
}
