package com.example.ders_12042022;

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
        TextView yazi = findViewById(R.id.txt_sonuc);

        Button btn = findViewById(R.id.btn_ode);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte i = Byte.valueOf(String.valueOf(secim.getText()));
                switch(i){
                    case 1:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Elektronikte 10£ ödendi.");
                        break;
                    case 2:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Giyimde 20£ ödendi.");
                        break;
                    case 3:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Yemekte 15£ ödendi.");
                        break;
                    default:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Lütfen geçerli bir seçim giriniz!!!!");
                        break;
                }

            }

        });

        secim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte i = Byte.valueOf(String.valueOf(secim.getText()));
                switch(i){
                    case 1:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Elektronikte fırsatlar 10£'dan başlayan fiyatlarla!");
                        break;
                    case 2:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Giyimde fırsatlar 20£'dan başlayan fiyatlarla!");
                        break;
                    case 3:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Yemekte fırsatlar 15£' başlayan fiyatlarla!");
                        break;
                    default:
                        yazi.setVisibility(View.VISIBLE);
                        yazi.setText("Lütfen geçerli bir seçim giriniz!!!!");
                        break;
                }

            }
        });
    }
}