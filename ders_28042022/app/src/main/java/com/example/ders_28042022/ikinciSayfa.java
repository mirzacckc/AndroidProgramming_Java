package com.example.ders_28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ikinciSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_sayfa);
        Button btn_visible = findViewById(R.id.btn_visible);
        ImageView resim = findViewById(R.id.image_visible);
        Button btn_next = findViewById(R.id.btn_nextPage2);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ileri = new Intent(ikinciSayfa.this,ucuncuSayfa.class);
                startActivity(ileri);
            }
        });
        btn_visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resim.setVisibility(View.VISIBLE);
            }
        });


    }
}