package com.example.ders_05042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button degistir = (Button) findViewById(R.id.btn_renk);
        Resources res = getResources();
        degistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degistir.setText(R.string.degismis_yazi);   //bu şekilde tanımlama yapılacaksa string.xml içinde tanımlanmalı.
                //degistir.setText("Yazımız Değişti Bile");  //burada tanımlama olmadan işlem yapılmaktadır.
                //degistir.setBackgroundColor(res.getColor(R.color.red)); //bu şekilde tanımlama yapılacaksa color.xml içinde tanımlanmalı.
                degistir.setBackgroundColor(Color.GREEN);    //buradaki tanımlama color classı aracılığıyla yapılmakta.
                degistir.setTextColor(Color.RED);

            }
        });

        Integer a,b;
        a = 15;
        b = 11;
        Integer toplam = a+b;
        TextView txt = (TextView) findViewById(R.id.txt_toplam);
        txt.setText("Toplam sonucu= " + Integer.toString(toplam));
        }

}