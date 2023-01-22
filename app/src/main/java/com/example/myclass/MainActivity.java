package com.example.myclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.anew.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("grb");
    }
}