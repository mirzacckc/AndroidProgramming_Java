package com.example.ders_14042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText secim = findViewById(R.id.txt_secim);
        TextView sonuc = findViewById(R.id.txt_sonuc);
        Button btn_ode = findViewById(R.id.btn_ode);

        secim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i = Integer.valueOf(String.valueOf(secim.getText()));
                if (i == 1){
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Elektronikte fırsatlar 10£'dan başlayan fiyatlarla!");
                }
                else if (i == 2){
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Giyimde fırsatlar 20£'dan başlayan fiyatlarla!");
                }
                else if (i == 3){
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Yemekte fırsatlar 15£' başlayan fiyatlarla!");
                }
                else{
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Lütfen geçerli bir seçim giriniz!!!!");
                }
            }
        });

        btn_ode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(secim.getText()).equals("1")){
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Elektronikte 10£ ödendi.");
                }
                else if (String.valueOf(secim.getText()).equals("2")){
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Giyimde 20£ ödendi.");
                }
                else if (String.valueOf(secim.getText()).equals("3")){
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Yemekte 15£ ödendi.");
                }
                else{
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Lütfen geçerli bir seçim giriniz!!!!");
                }

            }
        });
    }
}