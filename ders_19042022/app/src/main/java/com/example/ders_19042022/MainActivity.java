package com.example.ders_19042022;

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
        TextView txt = (TextView) findViewById(R.id.textView);
        EditText edt_txt = (EditText) findViewById(R.id.sayi_txt);
        Button btn_hesap = (Button) findViewById(R.id.btn_hesapla);

        btn_hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i = Integer.valueOf(String.valueOf(edt_txt.getText()));
                int t =i;
                int factoriyel = 1;
                while (i != 0) {
                    factoriyel = factoriyel * i;
                    --i;

                    txt.setVisibility(View.VISIBLE);
                    txt.setText(t + "'nin faktoriyeli: " + factoriyel + " dir");
                    System.out.println(t + "'nin faktoriyeli: " + factoriyel + "dir");
                    //System.out.println olarak W3school derleyicisinde çıktı vermekte fakat logcatde çıktı gözükmemekte.
                }
            }
        });
    }
}







