package com.example.demo15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bactivity);
    }

    public void back(View view) {
        Intent intent=new Intent(Bactivity.this,MainActivity.class);
        startActivity(intent);
    }
}