package com.example.practical42homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //String text = "Toppings: ";

    /*public void showToast(String text)
    {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }*/

    public void OnButtonClicked(View view)
    {
        String text = "Toppings: ";
        CheckBox chocSyrup, sprinkles, crushedNuts, cherries, oreo;
        chocSyrup = findViewById(R.id.chocolate_syrup);
        sprinkles = findViewById(R.id.sprinkles);
        crushedNuts = findViewById(R.id.crushed_nuts);
        cherries = findViewById(R.id.cherries);
        oreo = findViewById(R.id.oreo_cookies);
        if (chocSyrup.isChecked())
            text += "Chocolate syrup ";
        if (sprinkles.isChecked())
            text += "Sprinkles ";
        if (crushedNuts.isChecked())
            text += "Crushed nuts ";
        if (cherries.isChecked())
            text += "Cherries ";
        if (oreo.isChecked())
            text += "Oreo cookie crumbles ";
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}