package com.example.ders_28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ucuncuSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucuncu_sayfa);

        Button btn_cat = findViewById(R.id.btn_cat);
        Button btn_dog = findViewById(R.id.btn_dog);
        Button btn_owl = findViewById(R.id.btn_owl);
        ImageView resim = findViewById(R.id.image_change);
        Button btn_gizle = findViewById(R.id.btn_gizle);
        Button btn_goster = findViewById(R.id.btn_goster);

        btn_goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resim.setVisibility(View.VISIBLE);
            }
        });
        btn_gizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resim.setVisibility(View.INVISIBLE);
            }
        });
        btn_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resim.setImageResource(R.drawable.dog);
                resim.setVisibility(View.VISIBLE);
            }
        });
        btn_owl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resim.setImageResource(R.drawable.owl);
                resim.setVisibility(View.VISIBLE);
            }
        });
        btn_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resim.setImageResource(R.drawable.cat);
                resim.setVisibility(View.VISIBLE);
            }
        });
    }
}