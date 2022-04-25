package com.example.ders_16042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    //ctrl+alt+L = kodu düzenlemek için kısayol
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView b = (TextView) findViewById(R.id.txt_f);
        TextView x = (TextView) findViewById(R.id.txt_toplam);
        String yazi = " ";
        Integer toplam = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Gazi Beltek"); //logcatte yazımı görürüz fakat aynı satırdan fazladan varsa bitiş ve başlangıç yazıp
            a += 1;                              // diğerleri aynıdır diye çıktı vermekte.

        }
        System.out.println(a);

        for (int i = 1; i < 5; i++) {
            yazi = (yazi + "\t" + String.valueOf(i));
            b.setText(yazi);
        }
        int i;
        for (i=1; i < 11; i++) {
            toplam += i;
            //x.setText(String.valueOf(c));
        }
        int c = i-1;
        x.setText("Birden "+c+"'a kadar olan sayıların toplamı: "+toplam);
    }
}