package com.cikarastudio.cikaraartikel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel button di java
    //ditambah sesuai kebutuhan
    Button buttonAjava,buttonBjava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sambungkan variabel java dengan id di xml
        //(R.id.buttonA) = ngambil id button di xml nya
        buttonAjava = findViewById(R.id.buttonA);
        buttonBjava = findViewById(R.id.buttonB);

        //dikasih fungsi tiap variabel tombol java yang disambungin tadi
        //makin banyak tombol makin banyak bikin yang begini
        buttonAjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //masukin intentnya
                Intent intenta= new  Intent(MainActivity.this,Intent.class);
                startActivity(intenta);
            }
        });

        buttonBjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //masukin juga disini
                Intent intentb = new Intent(MainActivity.this,INtentV.class);
                startActivity(intentb);
            }
        });

    }
}
