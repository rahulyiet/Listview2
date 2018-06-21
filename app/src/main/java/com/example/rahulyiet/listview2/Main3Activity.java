package com.example.rahulyiet.listview2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.rahulyiet.listview2.R.id.name;

public class Main3Activity extends AppCompatActivity {

    @SuppressLint({"ResourceType", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        int phone = getIntent().getIntExtra("phone",860741835);
        String spinner =getIntent().getStringExtra("spinner");
        String spinner2 =getIntent().getStringExtra("spinner2");


        TextView name1 =findViewById(R.id.name);
        TextView email1 =findViewById(R.id.email);
        TextView phone1 =findViewById(R.id.phone);
        TextView country1=findViewById(R.id.spinner);
        TextView states1 =findViewById(R.id.spinner2);

        name1.setText(name);
        email1.setText(email);
        phone1.setText(phone);
        country1.setText(spinner);
        states1.setText(spinner2);
    }
}
