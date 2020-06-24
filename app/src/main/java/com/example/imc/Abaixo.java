package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Abaixo extends AppCompatActivity {

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaixo);

        resultado = findViewById(R.id.resultado);


        Intent intent = getIntent();

        Bundle imc = intent.getExtras();

        if (imc != null){
            double resultimc = imc.getDouble("chave_imc");
            resultado.setText("Seu imc é: " + resultimc);
        }
    }
}
