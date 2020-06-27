package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ObesidadeIII extends AppCompatActivity {

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade_i_i_i);

        resultado = findViewById(R.id.resultadoObesidadeIII);

        Intent intent = getIntent();

        Bundle imc = intent.getExtras();

        if (imc != null){
            double resultimc = imc.getDouble("chave_imc");
            resultado.setText(String.format("Seu imc é: %.02f", resultimc));
        }
    }
}
