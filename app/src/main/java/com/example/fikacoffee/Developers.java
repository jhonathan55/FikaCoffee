package com.example.fikacoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

public class Developers extends AppCompatActivity {
    private MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
        //implementación del toolbar

        toolbar = findViewById(R.id.appbar_toolbar);
        //soporte de toolbar
        setSupportActionBar(toolbar);
        //desabilita el titulo por defecto
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("");
        toolbar.setSubtitle("");

    }
}