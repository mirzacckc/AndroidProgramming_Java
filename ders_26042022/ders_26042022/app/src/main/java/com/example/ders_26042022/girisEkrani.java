package com.example.ders_26042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class girisEkrani extends AppCompatActivity {
    //public String kullaniciAdi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris_ekrani);
        EditText kullanici = findViewById(R.id.edt_kullaniciAdi);
        EditText sifre = findViewById(R.id.edt_password);
        Button giris = findViewById(R.id.btn_giris);


        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kullanici.getText().toString().equals("username") && (sifre.getText().toString().equals("1234"))){
                    Toast.makeText(getApplicationContext(),"Giriş Yapılıyor...",Toast.LENGTH_SHORT).show();
                    Intent girisYapildi = new Intent(girisEkrani.this,kullaniciEkrani.class);
                    startActivity(girisYapildi);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Hata!!Bilgilerinizi kontrol ediniz!!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    //public String getUserName(){
        //return kullaniciAdi;
    //}
}