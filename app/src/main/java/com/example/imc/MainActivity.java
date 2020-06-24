package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextPeso, editTextAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
    }
    public void redirecionar (View view){
        double altura = Double.parseDouble(editTextAltura.getText().toString());
        double peso = Double.parseDouble(editTextPeso.getText().toString());
        double resultado = peso/(altura * altura);

        if (resultado < 18.5){
            Intent intent = new Intent(this, Abaixo.class);
            startActivity(intent);
        } else if (resultado >= 18.6 && resultado <= 25){
            Intent intent = new Intent(this, Imc_peso_Ideal.class);
            startActivity(intent);
        } else if (resultado > 25 && resultado <= 29.9){
            Intent intent = new Intent(this, SobrePeso.class);
            startActivity(intent);
        } else if (resultado >= 30 && resultado <= 34.9){
            Intent intent = new Intent(this, ObesidadeI.class);
            startActivity(intent);
        } else if(resultado >= 35 && resultado <= 39.9){
            Intent intent = new Intent(this, ObesidadeII.class);
            startActivity(intent);
        } else if (resultado > 40){
            Intent intent= new Intent(this, ObesidadeIII.class);
            startActivity(intent);
        }
    }
}
