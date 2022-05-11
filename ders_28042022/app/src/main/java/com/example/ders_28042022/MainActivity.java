package com.example.ders_28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtYazi = findViewById(R.id.textView);
        Button btnGoster = findViewById(R.id.button);
        ImageView resim = findViewById(R.id.imageView);
        Button sonrakiSayfa = findViewById(R.id.btn_nextPage);

        sonrakiSayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ileri = new Intent(MainActivity.this,ikinciSayfa.class);
                startActivity(ileri);
            }
        });

        btnGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtYazi.setVisibility(View.VISIBLE);
                txtYazi.setText("Deadpool Karşınızda");
                resim.setImageResource(R.drawable.deadpool);
            }
        });
    }
}