package com.example.n2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_criar;
    Button btn_visuazilar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_criar = (Button) findViewById(R.id.btn_criar);

        //BOTAO QUE VAI  ATE CriarActivity
        btn_criar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CriarActivity.class);
                startActivity(intent);
            }
        });

        btn_visuazilar = (Button) findViewById(R.id.btn_vizualizar);

        // BOTAO QUE VAI ATE ActivityView

        btn_visuazilar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityView.class );
                startActivity(intent);
            }
        });

    }
}
