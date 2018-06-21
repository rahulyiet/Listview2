package com.example.rahulyiet.listview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);


        String[] country = {"America", "India", "Australia", "China"};
        final String[] AmericaCities = {"Washington", "Cicago", "New york"};
        final String[] IndiaCities = {"Shimla", "Nainital", "Chandigarh"};
        final String[] AustraliaCities = {"Canbera", "Melbourne", "Sydney"};
        final String[] ChinaCities = {"Beijing", "Shanghai", "Tianjin"};

        Button button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);

                intent.putExtra("name","Rahul");
                intent.putExtra("email","rahulyiet22@gmail.com");
                intent.putExtra("phone","860741876");


                intent.putExtra("spinner","Country");
                intent.putExtra("spinner2","spinner2");

                Log.d("btn","My Button Clicked");


            }
        });


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, country);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {

                    ArrayAdapter<String> citiestAdapter = new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_dropdown_item_1line, AmericaCities);
                    spinner2.setAdapter(citiestAdapter);

                } else if (i == 1) {
                    ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_dropdown_item_1line, IndiaCities);
                    spinner2.setAdapter(citiesAdapter);
                } else if (i == 2) {
                    ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_dropdown_item_1line, AustraliaCities);
                    spinner2.setAdapter(citiesAdapter);
                } else if (i == 3) {
                    ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_dropdown_item_1line, ChinaCities);
                    spinner2.setAdapter(citiesAdapter);

                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
        public void setAdapter(String[] citiesArray) {
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, citiesArray);
            spinner2.setAdapter(arrayAdapter);







    }


}




