package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

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

        //  Nota mental: Fazer o if dentro de uma segunda activity seria melhor,
        //  diminuindo o numero de activitys e setando texto e imagem de acordo com o resultado do if
        if (resultado < 18.5){
            Intent intent = new Intent(this, Abaixo.class);
            Bundle imc = new Bundle();
            imc.putDouble("chave_imc", resultado);
            intent.putExtras(imc);
            startActivity(intent);
        } else if (resultado >= 18.6 && resultado <= 25){
            Intent intent = new Intent(this, Imc_peso_Ideal.class);
            Bundle imc = new Bundle();
            imc.putDouble("chave_imc", resultado);
            intent.putExtras(imc);
            startActivity(intent);
        } else if (resultado > 25 && resultado <= 29.9){
            Intent intent = new Intent(this, SobrePeso.class);
            Bundle imc = new Bundle();
            imc.putDouble("chave_imc", resultado);
            intent.putExtras(imc);
            startActivity(intent);
        } else if (resultado >= 30 && resultado <= 34.9){
            Intent intent = new Intent(this, ObesidadeI.class);
            Bundle imc = new Bundle();
            imc.putDouble("chave_imc", resultado);
            intent.putExtras(imc);
            startActivity(intent);
        } else if(resultado >= 35 && resultado <= 39.9){
            Intent intent = new Intent(this, ObesidadeII.class);
            Bundle imc = new Bundle();
            imc.putDouble("chave_imc", resultado);
            intent.putExtras(imc);
            startActivity(intent);
        } else if (resultado > 40){
            Intent intent= new Intent(this, ObesidadeIII.class);
            Bundle imc = new Bundle();
            imc.putDouble("chave_imc", resultado);
            intent.putExtras(imc);
            startActivity(intent);
        }
    }
}
