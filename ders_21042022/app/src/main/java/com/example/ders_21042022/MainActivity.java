package com.example.ders_21042022;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText sayi1 = findViewById(R.id.sayi_bir);
        EditText sayi2 = findViewById(R.id.sayi_iki);
        Button topla = findViewById(R.id.btn_topla);
        TextView uyari = findViewById(R.id.txt_uyari);
        TextView sonuc = findViewById(R.id.txt_sonuc);
        Button cikar = findViewById(R.id.btn_cikar);
        Button bol = findViewById(R.id.btn_bol);
        Button carp = findViewById(R.id.btn_carp);

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uyari.setVisibility(View.INVISIBLE);
                sonuc.setVisibility(View.INVISIBLE);
                if (sayi1.getText().toString().equals("") && sayi2.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Sayı Alanlarını Boş Bırakmayınız",Toast.LENGTH_LONG).show();
                }
                else if (!sayi1.getText().toString().equals("") && !sayi2.getText().toString().equals("")){
                    sonuc.setVisibility(View.VISIBLE);
                    float toplam = Float.valueOf(String.valueOf(sayi1.getText()))/Float.valueOf(String.valueOf(sayi2.getText()));
                    sonuc.setText("Toplam: " + toplam);
                }
                else if (sayi1.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Birinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
                else{
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen İkinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
            }
        });
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uyari.setVisibility(View.INVISIBLE);
                sonuc.setVisibility(View.INVISIBLE);
                if (sayi1.getText().toString().equals("") && sayi2.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Sayı Alanlarını Boş Bırakmayınız",Toast.LENGTH_LONG).show();
                }
                else if (!sayi1.getText().toString().equals("") && !sayi2.getText().toString().equals("")){
                    sonuc.setVisibility(View.VISIBLE);
                    int toplam = Integer.valueOf(String.valueOf(sayi1.getText()))-Integer.valueOf(String.valueOf(sayi2.getText()));
                    sonuc.setText("Toplam: " + toplam);
                }
                else if (sayi1.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Birinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
                else{
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen İkinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uyari.setVisibility(View.INVISIBLE);
                sonuc.setVisibility(View.INVISIBLE);
                if (sayi1.getText().toString().equals("") && sayi2.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Sayı Alanlarını Boş Bırakmayınız",Toast.LENGTH_LONG).show();
                }
                else if (!sayi1.getText().toString().equals("") && !sayi2.getText().toString().equals("")){
                    sonuc.setVisibility(View.VISIBLE);
                    int toplam = Integer.valueOf(String.valueOf(sayi1.getText()))*Integer.valueOf(String.valueOf(sayi2.getText()));
                    sonuc.setText("Toplam: " + toplam);
                }
                else if (sayi1.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Birinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
                else{
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen İkinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
            }
        });

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uyari.setVisibility(View.INVISIBLE);
                sonuc.setVisibility(View.INVISIBLE);
                if (sayi1.getText().toString().equals("") && sayi2.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Sayı Alanlarını Boş Bırakmayınız",Toast.LENGTH_LONG).show();
                }
                else if (!sayi1.getText().toString().equals("") && !sayi2.getText().toString().equals("")){
                    sonuc.setVisibility(View.VISIBLE);
                    int toplam = Integer.valueOf(String.valueOf(sayi1.getText()))+Integer.valueOf(String.valueOf(sayi2.getText()));
                    sonuc.setText("Toplam: " + toplam);
                }
                else if (sayi1.getText().toString().equals("")){
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen Birinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
                else{
                    uyari.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Lütfen İkinci Sayı İçin Geçerli Bir Deger Giriniz!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}