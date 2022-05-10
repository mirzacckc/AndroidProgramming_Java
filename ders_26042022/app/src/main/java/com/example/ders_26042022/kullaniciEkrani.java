package com.example.ders_26042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class kullaniciEkrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_ekrani);
        Button btn_cikis = findViewById(R.id.btn_cikis);
        ImageView avatar = findViewById(R.id.imageView);
        Button btn_man = findViewById(R.id.btn_man);
        Button btn_woman = findViewById(R.id.btn_woman);
        Button btn_animal = findViewById(R.id.btn_animal);
        Button btn_secret = findViewById(R.id.btn_secret);

        //TextView txt_merhaba = findViewById(R.id.txt_kullaniciMerhaba);
        //girisEkrani deneme = new girisEkrani();
        //String kullaniciadi = deneme.getUserName();
        //txt_merhaba.setText("Merhaba " + kullaniciadi);

        btn_secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatar.setImageResource(R.drawable.anonymous);
            }
        });

        btn_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatar.setImageResource(R.drawable.animal);
            }
        });

        btn_woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatar.setImageResource(R.drawable.woman);
            }
        });

        btn_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatar.setImageResource(R.drawable.man);
            }
        });

        btn_cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Çıkış Yapılıyor...",Toast.LENGTH_SHORT).show();
                Intent geri = new Intent(kullaniciEkrani.this,girisEkrani.class);
                startActivity(geri);
            }
        });
    }
}