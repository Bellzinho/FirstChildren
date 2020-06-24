package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ObesidadeI extends AppCompatActivity {

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade_i);

        resultado = findViewById(R.id.resultadoObesidadeI);

        Intent intent = getIntent();

        Bundle imc = intent.getExtras();

        if (imc != null){
            double resultimc = imc.getDouble("chave_imc");
            resultado.setText("Seu imc é: " + resultimc);
        }
    }
}
